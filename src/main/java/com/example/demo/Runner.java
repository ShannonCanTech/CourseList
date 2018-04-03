package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String args[]) {
        String result;
//        String addMore;
        CourseDetails inputCourseInfo;
        Scanner sc = new Scanner(System.in);

        ArrayList<CourseDetails> coursedetails = new ArrayList<>();


            for (int courses = 1; courses < 5; courses++) {
                inputCourseInfo = new CourseDetails();
                System.out.println("What is the course number? ");
                inputCourseInfo.setCourseNumber(sc.nextLine());
                System.out.println("What is your course name? ");
                inputCourseInfo.setCourseName(sc.nextLine());
                System.out.println("What is the room number? ");
                inputCourseInfo.setRoomNumber(sc.nextLine());
                System.out.println("What is the semester? ");
                inputCourseInfo.setSemester(sc.nextLine());
                System.out.println("What is the year? ");
                inputCourseInfo.setYear(sc.nextLine());
                System.out.println("Your course information: " + inputCourseInfo.toString());
                coursedetails.add(inputCourseInfo);
                System.out.print("Do you want to continue? (Y/N) ");
                result = sc.nextLine();
                if (result.equalsIgnoreCase("N") || result.equalsIgnoreCase("NO") ) {
                   break;
                } else if (result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("YES")) {
                    System.out.print("Would you like to enter details for another course? (Y/N)");
                    result = sc.nextLine();
                    if (result.equalsIgnoreCase("N") || result.equalsIgnoreCase("NO") ){
                        break;
                    } else if (result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("YES")) {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }

            //Review
            for (CourseDetails eachCourseDetails : coursedetails) {
                System.out.println(eachCourseDetails.getCourseName());
                System.out.println(eachCourseDetails.getCourseNumber());
                System.out.println(eachCourseDetails.getRoomNumber());
                System.out.println(eachCourseDetails.getSemester());
                System.out.println(eachCourseDetails.getYear());
                System.out.println(eachCourseDetails.toString());
            }
        }
}
