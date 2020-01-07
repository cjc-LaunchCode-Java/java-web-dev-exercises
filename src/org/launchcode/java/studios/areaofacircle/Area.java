package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double radius=0.0;
        boolean error=false;
        do {
            System.out.println("Please enter radius of the circle:");
            if(input.hasNextDouble()) {
                radius = input.nextDouble();
            } else {
                System.out.println("Error: Numbers only");
                error=true;
            }
        } while (radius<0);
        if(!error){
            Double area=Circle.getArea(radius);
            System.out.println("The area of a circle of radius "+ radius + " is: " + area);
        }
        input.close();
    }
}
