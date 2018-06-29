package com.mnnyang.hqu.conf;

import com.mnnyang.hqu.BasePresenter;
import com.mnnyang.hqu.BaseView;



public interface ConfContract {
    interface Presenter extends BasePresenter {
    }

    interface View extends BaseView<ConfContract.Presenter> {
        void confBgImage();
    }
}
