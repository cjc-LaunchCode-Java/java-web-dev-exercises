package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String teacherName;
    private ArrayList<String> studentList = new ArrayList<>();

    public void setStudentList(Student aStudent){
        studentList.add(aStudent.getName());
    }

    public void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }
    public void setTeacherName(String aTeacherName){
        teacherName = aTeacherName;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public ArrayList<String> getArrayList(){
        return studentList;
    }
}
