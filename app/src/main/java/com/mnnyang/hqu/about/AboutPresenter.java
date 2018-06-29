package com.mnnyang.hqu.about;

import com.mnnyang.hqu.R;
import com.mnnyang.hqu.app.app;
import com.mnnyang.hqu.data.bean.Version;
import com.mnnyang.hqu.http.HttpCallback;
import com.mnnyang.hqu.utils.LogUtil;
import com.mnnyang.hqu.utils.ToastUtils;
import com.mnnyang.hqu.utils.VersionUpdate;



public class AboutPresenter implements AboutContract.Presenter {
    private AboutContract.View mView;

    public AboutPresenter(AboutContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void start() {

    }

    @Override
    public void checkUpdate() {
        mView.showNotice(app.mContext.getString(R.string.checking_for_updates));

        final VersionUpdate versionUpdate = new VersionUpdate();
        versionUpdate.checkUpdate(new HttpCallback<Version>() {
            @Override
            public void onSuccess(Version version) {
                if (version == null) {
                    LogUtil.e(this, "version object is null");
                    return;
                }
                int localVersion = versionUpdate.getLocalVersion(app.mContext);

                LogUtil.d(this, String.valueOf(version.getCode()));
                if (version.getVersion() > localVersion) {
                    mView.showUpdateVersionInfo(version);
                } else {
                    mView.showNotice(app.mContext.getString(R.string.already_the_latest_version));
                }
            }

            @Override
            public void onFail(String errMsg) {
                LogUtil.e(this, errMsg);
                ToastUtils.show(app.mContext.getString(R.string.access_err));
            }
        });
    }
}
