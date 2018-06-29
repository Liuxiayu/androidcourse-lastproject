package com.mnnyang.hqu.mg;

import com.mnnyang.hqu.BasePresenter;
import com.mnnyang.hqu.BaseView;
import com.mnnyang.hqu.data.bean.CsItem;
import com.mnnyang.hqu.utils.DialogHelper;

import java.util.ArrayList;



public interface MgContract {
    interface Presenter extends BasePresenter {
        void deleteCsName(int csNameId, DialogHelper dh);
        void switchCsName(int csNameId);
        void reloadCsNameList();
        void addCsName(String csName);
        void editCsName(int id, String newCsName);
    }

    interface View extends BaseView<Presenter> {
        void showList(ArrayList<CsItem> csNames);
        void showNotice(String notice);
        void gotoCourseActivity();
        void deleteFinish();
        void addCsNameSucceed();
        void editCsNameSucceed();
    }

    interface Model{
        ArrayList<CsItem> getCsItemData();
    }
}
