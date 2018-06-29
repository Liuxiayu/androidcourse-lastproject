package com.mnnyang.hqu.mg;

import com.mnnyang.hqu.data.bean.CsItem;
import com.mnnyang.hqu.data.db.CourseDbDao;

import java.util.ArrayList;



public class MgModel implements MgContract.Model {
    @Override
    public ArrayList<CsItem> getCsItemData() {
        return CourseDbDao.newInstance().loadCsNameList();
    }
}
