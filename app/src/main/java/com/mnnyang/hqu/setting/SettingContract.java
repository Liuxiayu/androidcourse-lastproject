package com.mnnyang.hqu.setting;


import com.mnnyang.hqu.BasePresenter;
import com.mnnyang.hqu.BaseView;



public interface SettingContract {
    interface Presenter extends BasePresenter {
        void feedback();
    }

    interface View extends BaseView<Presenter> {
        void showNotice(String notice);
    }
}
