package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of miles driven:");
        Double miles=input.nextDouble();
        System.out.println("Enter number of gallons used:");
        Double gallons=input.nextDouble();
        input.close();

        Double milesPerGallon=miles/gallons;
        System.out.println("Your miles per gallon is " + milesPerGallon);

    }
}
