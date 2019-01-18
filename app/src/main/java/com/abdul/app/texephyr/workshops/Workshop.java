package com.abdul.app.texephyr.workshops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Abdul Noushad (abdulnine7)
 */
public class Workshop {

    private final static Map<String, List<Workshop>> workshops = new HashMap<>();
    public String title;
    public String shortText;
    public String text;

    public Workshop(String title, String shortText, String text) {
        this.title = title;
        this.shortText = shortText;
        this.text = text;
    }

    public static Map<String, List<Workshop>> getWorkshops() {
        workshops.clear();

        List<Workshop> entc_workshop;
        List<Workshop> comp_workshop;
        List<Workshop> mech_workshop;

        comp_workshop = new ArrayList<>();
//        comp_workshop.add(new Workshop("", "", ""));
        comp_workshop.add(new Workshop("Androledge", "Be a real Android Dev!",
                "TEXEPHYR’18 is organising a 2-day workshop on Android Development conducted by Seed Infotech. " +
                        "The perspective of this course is to understand basic concepts for developing an app. \n" +
                        "\n" +
                        "Course Contents: \n\n" +
                        "1. Introduction to the Android world.\n" +
                        "2. Understanding the Building Environment for Android.\n" +
                        "3. Understanding Layouts.\n" +
                        "4. Getting familiar with Activity.\n" +
                        "5. Introduction to Intents.\n" +
                        "6. Understanding various Notifications.\n" +
                        "7. Other Interesting Stuff.\n" +
                        "8. Some Technical  Stuff.\n" +
                        "9. Developing Applications.\n" +
                        "10. Publishing an Application on Google Play.\n" +
                        "\n" +
                        "Date: 12 and 13 March\n" +
                        "\n" +
                        "Venue:\nDepartment of Computer Engineering, MIT PUNE KOTHRUD.\n" +
                        "\n" +
                        "Workshop Cost: ₹600 for 2 days\n" +
                        "\n" +
                        "Siddharth: +91 95451 58528\n\n"));
        comp_workshop.add(new Workshop("Python Workshop", "See if you can tame this snake!",
                "TEXEPHYR'18 is annual technical fest of MIT-WPU, Pune. It is organising a 2-day workshop " +
                        "on Python conducted by Seed Infotech.The perspective of this course is to " +
                        "understand basic concepts related to the language.\n" +
                        "\n" +
                        "Course Contents: \n\n" +
                        "1.Basic introduction.\n" +
                        "2.Introduction to data types and libraries.\n" +
                        "3.File handling and string handling.\n" +
                        "4.Writing Functions and classes.\n" +
                        "5.Use of python in data visualisation and plotting.\n" +
                        "6.Use of python in image processing.\n" +
                        "7.Use of python in Machine learning.\n" +
                        "\n" +
                        "Date: 27 Jan-28 Jan\n" +
                        "\n" +
                        "Duration: 4-5 hrs/day\n" +
                        "\n" +
                        "Venue:\nDepartment of Computer Engineering, MIT PUNE KOTHRUD.\n" +
                        "Workshop Cost: ₹300 for 2 days\n" +
                        "\n" +
                        "Siddharth: +91 95451 58528\n\n"));


        entc_workshop = new ArrayList<>();
        entc_workshop.add(new Workshop("Image Processing Using Open CV", "Image Processing Using Open CV Workshop",
                "COURSE CONTENT\n\n" +
                        "DAY 1\n\n" +
                        "SESSION 1:\n" +
                        "INTRODUCTION:\n" +
                        "➢All basics and introduction about Python.\n" +
                        "➢Comparison of various types of software.\n" +
                        "➢The importance of python in today’s technology.\n\n" +
                        "SESSION 2:\n" +
                        "➢The real time applications of python.\n" +
                        "➢Characteristics of python.\n" +
                        "➢Loops and variables.\n" +
                        "➢E-speak.\n" +
                        "➢Security application using camera, capture and send image through SMS ,email using SMTP protocol.\n" +
                        "\n" +
                        "SMALL TASK BASED ON THESE SESSIONS AND QUESTIONS AND ANSWER.\n" +
                        "\n\nDAY 2\n\n" +
                        "SESSION 1:\n" +
                        "INTRODUCTION\n" +
                        "➢Introduction to OpenCV.\n" +
                        "➢Image processing Basics.\n\n" +
                        "SESSION 2:\n" +
                        "➢Real time applications useful for project.\n" +
                        "➢Leaf Disease/Traffic Density.\n" +
                        "➢Object tracking/Face Detection Demo\n\n" +
                        "SMALL TASK BASED ON THESE SESSIONS AND QUESTIONS AND ANSWER.\n" +
                        "\n"));
//        entc_workshop.add(new Workshop("", "", ""));

        mech_workshop = new ArrayList<>();
        mech_workshop.add(new Workshop("3D Printing Workshop", "Build Your Own 3D Printer",
                "\nImagine\n" +
                        "Design\n" +
                        "Print\n" +
                        "\n" +
                        "What is 3D Printing?\n" +
                        "3D printing is a process of making three dimensional solid objects from a digital file.\n" +
                        "\n" +
                        "What are the applications of 3D Printing?\n" +
                        "The possibilities of 3D Printing for your product development and manufacturing are endless. Print everything from concept models to robotic arms. The sky is the limit. \n" +
                        "Anything you imagine, you can print.\n" +
                        "\n" +
                        "Learn How to Build a 3D Printer of your own, Designing, Image Processing, Actual Printing and Problem Solving.\n" +
                        "\n" +
                        "Date: 11th - 12th March\n" +
                        "Venue: Department of Mechanical Engineering, MIT, Kothrud, Pune\n" +
                        "Workshop costs: 1100/- for 2 days\n" +
                        "\n" +
                        "For any queries contact\n" +
                        "Nidhi: 7385699268\n" +
                        "Pratik: 97645772265\n\n"));

        workshops.put("1. Computer Department", comp_workshop);
        workshops.put("2. ENTC Department", entc_workshop);
        workshops.put("3. Mechanical Department", mech_workshop);

        return workshops;
    }
}
