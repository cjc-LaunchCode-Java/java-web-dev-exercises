package exercises;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<String,Integer> studentsWithIds = new HashMap<>();
        String newStudent;

        do{
            System.out.println("Student Name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")){
                System.out.println(newStudent + "'s ID number: ");
                Integer newStudentId = input.nextInt();
                studentsWithIds.put(newStudent,newStudentId);
                input.nextLine();
            }

        } while (!newStudent.equals(""));

        for(Map.Entry<String, Integer> student:studentsWithIds.entrySet()){
            System.out.println(student.getKey() + ": " + student.getValue());
        }


    }
}
