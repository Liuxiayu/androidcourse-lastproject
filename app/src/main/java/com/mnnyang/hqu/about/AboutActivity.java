package com.mnnyang.hqu.about;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.mnnyang.hqu.BaseActivity;
import com.mnnyang.hqu.R;
import com.mnnyang.hqu.app.app;
import com.mnnyang.hqu.data.bean.Version;
import com.mnnyang.hqu.utils.DialogHelper;
import com.mnnyang.hqu.utils.DialogListener;
import com.mnnyang.hqu.utils.ToastUtils;
import com.mnnyang.hqu.utils.VersionUpdate;

public class AboutActivity extends BaseActivity implements AboutContract.View {

    private AboutPresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        initGithubTextView();
        initVersionName();
        initCheckUpdate();

        mPresenter = new AboutPresenter(this);
    }

    private void initVersionName() {
        TextView tvVersionName = findViewById(R.id.tv_version);

        VersionUpdate vu = new VersionUpdate();
        String versionName = vu.getLocalVersionName(app.mContext);
        tvVersionName.setText(versionName);
    }

    private void initCheckUpdate() {
        TextView tv = findViewById(R.id.tv_check_update);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.checkUpdate();
            }
        });
    }

    private void initGithubTextView() {
        TextView tv = findViewById(R.id.tv_github);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }


    @Override
    public void showNotice(String notice) {
        ToastUtils.show(notice);
    }

    @Override
    public void showUpdateVersionInfo(Version version) {

        DialogHelper dialogHelper = new DialogHelper();
        dialogHelper.showNormalDialog(this, getString(R.string.now_version), version.getMsg(), new DialogListener() {
            @Override
            public void onPositive(DialogInterface dialog, int which) {
                super.onPositive(dialog, which);
                VersionUpdate.goToMarket(getBaseContext());
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
