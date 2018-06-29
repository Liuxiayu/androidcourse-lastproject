package com.mnnyang.hqu.add;

import com.mnnyang.hqu.BasePresenter;
import com.mnnyang.hqu.BaseView;
import com.mnnyang.hqu.data.bean.Course;


public interface AddContract {
    interface Presenter extends BasePresenter {
        void addCourse(Course course);
        void removeCourse(int courseId);
        void updateCourse(Course course);
    }

    interface View extends BaseView<AddContract.Presenter> {
        void showAddFail(String msg);
        void onAddSucceed(Course course);
        void onDelSucceed();
        void onUpdateSucceed(Course course);
    }
}
