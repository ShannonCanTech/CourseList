package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String args[]) {
        CourseDetails inputCourseInfo;
        Scanner sc = new Scanner(System.in);

        ArrayList<CourseDetails> coursedetails = new ArrayList<>();

        for (int courses = 1; courses < 5; courses++) {
            inputCourseInfo = new CourseDetails();
            System.out.println("\t" + "What is the course number? ");
            inputCourseInfo.setCourseNumber(sc.nextLine());
            System.out.println("\t" + "What is your course name? ");
            inputCourseInfo.setCourseName(sc.nextLine());
            System.out.println("\t" + "What is the room number? ");
            inputCourseInfo.setRoomNumber(sc.nextLine());
            System.out.println("\t" + "What is the semester? ");
            inputCourseInfo.setSemester(sc.nextLine());
            System.out.println("\t" + "What is the year? ");
            inputCourseInfo.setYear(sc.nextLine());
            System.out.println("Your course information: " + inputCourseInfo.toString());
            coursedetails.add(inputCourseInfo);
        }

        //Review
        for(CourseDetails eachCourseDetails:coursedetails) {
            System.out.println(eachCourseDetails.getCourseName());
            System.out.println(eachCourseDetails.getCourseNumber());
            System.out.println(eachCourseDetails.getRoomNumber());
            System.out.println(eachCourseDetails.getSemester());
            System.out.println(eachCourseDetails.getYear());
            System.out.println(eachCourseDetails.toString());
        }

    }
}
