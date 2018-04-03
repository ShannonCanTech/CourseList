package com.example.demo;

public class CourseDetails {
    private String CourseNumber;
    private String CourseName;
    private String RoomNumber;
    private String Semester;
    private String Year;

    public String getCourseNumber() {
        return CourseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        CourseNumber = courseNumber;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "CourseDetails{" +
                "Course Name:'" + CourseName + '\'' +
                ", Course Number:'" + CourseNumber + '\'' +
                ", Room Number:'" + RoomNumber + '\'' +
                ", Semester:'" + Semester + '\'' +
                ", Year:'" + Year + '\'' +
                '}';
    }
}
