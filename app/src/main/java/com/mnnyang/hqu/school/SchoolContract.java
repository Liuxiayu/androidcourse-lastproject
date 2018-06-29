package com.mnnyang.hqu.school;


import com.mnnyang.hqu.BasePresenter;
import com.mnnyang.hqu.BaseView;


public interface SchoolContract {
    interface Presenter extends BasePresenter {
        void testUrl(String url);
    }

    interface View extends BaseView<Presenter> {
        void showNotice(String notice);

        void showInputDialog();

        void testingUrl(boolean bool);

        void testUrlFailed(String url);

        void testUrlSucceed(String url);
    }
}
