package com.training.assignment3;

import java.lang.Math;

public class Circle {

    private double radius;
    private static int totalCount;
    public Circle(double radius) {
        Validator a = new Validator();
        this.radius = radius;

    }
    public double getCircumference() {
        double cir = 0;
        cir = 2 * Math.PI * radius;
        totalCount++;
        return cir;
    }
    public String getFormattedCircumference() {
        String forCir = "";
        forCir = String.format("%.2f %n", getCircumference());
        return forCir;

        /*
        	System.out.printf("Value with 3 digits after decimal point %.3f %n", PI);
// OUTPUTS: Value with 3 digits after decimal point 3.142
         */
    }
    public double getArea() {
        double area = 0;
        area = Math.PI * radius * radius;
        return area;
    }
    public String getFormattedArea() {
        String forArea = "";
        forArea = String.format("%.2f %n", getArea());
        return forArea;
    }
    private String formatNumber(double x) {
        String forNum = "";
        forNum = String.format("%.2f %n", x);
        return forNum;
    }
    public static int getObjectCount() {
        return totalCount;
    }

}


