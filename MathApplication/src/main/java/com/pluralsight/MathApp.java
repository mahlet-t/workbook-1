package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        double bobSalary=4500.50, garySalary=5600.45;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("the Highest salary is "+highestSalary);
        // question 2
        double carPrice= 15000, truckPrice=25000;
        double smallestPrice= Math.min(carPrice,truckPrice);
        System.out.println("the smallest price is "+smallestPrice);
        // Question 3
        double radius= 7.25;
        double area =  Math.PI * Math.pow(radius,2);
        System.out.println("the area is " +Math.round(area));
        // Question 4
        double number=5.0;
        double result= Math.sqrt(number);
        System.out.println("the square root of " + number + " is " + result);
        // Question 5
        int x1= 5 ,x2= 85, y1 =10 , y2= 50;
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("Distance Between Points: " +distance);
        // Question 6
        float positive=-3.8f;
        System.out.println("the absolute value of "+positive+" is "+Math.abs(positive));
        //Question 7
        double randomNum= Math.random();
        System.out.println("random number between 0 and 1: "+ randomNum);



    }
}
