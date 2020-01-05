package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the length of rectangle:");
        Double length=input.nextDouble();
        System.out.println("Please enter the width of the rectangle:");
        Double width=input.nextDouble();
        input.close();
        Double area=length*width;
        System.out.println("The area of the rectangle is " + area);
    }
}
