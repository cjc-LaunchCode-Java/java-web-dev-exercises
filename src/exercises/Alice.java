package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String firstSentence="Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a search term that may be in the first sentence of Alice's Adventures in Wonderland");
        String searchTerm=input.nextLine().toLowerCase();
        input.close();
        Boolean result=firstSentence.toLowerCase().contains(searchTerm);

        System.out.println(result);
        if(result){
            int indexOfSearchTerm=firstSentence.toLowerCase().indexOf(searchTerm);
            System.out.println(indexOfSearchTerm);
            int lengthOfSearchTerm=searchTerm.length();
            System.out.println(lengthOfSearchTerm);
            String updatedSentence=firstSentence.toLowerCase().replace(searchTerm,"");
            System.out.println(updatedSentence);
        } else {
            System.out.println(firstSentence);
        }
    }
}
