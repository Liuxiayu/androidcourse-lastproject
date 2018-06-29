package com.mnnyang.hqu.data.bean;

import java.util.ArrayList;



public class CourseTime {
    public ArrayList<String> years = new ArrayList<>();
    public ArrayList<String> terms = new ArrayList<>();
    public String selectYear;
    public String selectTerm;

    @Override
    public String toString() {
        return "CourseTime{" +
                "years=" + years +
                ", terms=" + terms +
                ", selectYear='" + selectYear + '\'' +
                ", selectTerm='" + selectTerm + '\'' +
                '}';
    }
}
