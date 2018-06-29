package com.mnnyang.hqu.about;

import com.mnnyang.hqu.BasePresenter;
import com.mnnyang.hqu.BaseView;
import com.mnnyang.hqu.data.bean.Version;


public interface AboutContract {
    interface Presenter extends BasePresenter {
        void checkUpdate();
    }

    interface View extends BaseView<AboutContract.Presenter> {
        void showNotice(String notice);
        void showUpdateVersionInfo(Version version);
    }
}
