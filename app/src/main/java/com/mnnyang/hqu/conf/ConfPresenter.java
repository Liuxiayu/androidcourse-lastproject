package com.mnnyang.hqu.conf;



public class ConfPresenter implements ConfContract.Presenter {
    private ConfContract.View mView;

    public ConfPresenter(ConfContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void start() {
        //nothing
    }

}
