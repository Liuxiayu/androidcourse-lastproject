package com.mnnyang.hqu.course;


import android.graphics.Bitmap;

import com.mnnyang.hqu.BasePresenter;
import com.mnnyang.hqu.BaseView;
import com.mnnyang.hqu.data.bean.Course;

import java.util.ArrayList;



public interface CourseContract {
    interface Presenter extends BasePresenter {
        void loadBackground();
        void updateCourseViewData(int csNameId);
        void deleteCourse(int courseId);
    }

    interface View extends BaseView<Presenter> {
        void initFirstStart();
        void setBackground(Bitmap background);
        void setCourseData(ArrayList<Course> courses);
        void updateCoursePreference();
        void updateOtherPreference();
    }


}
