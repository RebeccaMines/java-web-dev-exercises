package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but " +
                "it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        String[] words = paragraph.split("[,'?:\\s]");

        System.out.print("Please enter a word to search: ");
        String term = input.nextLine();

        input.close();

        if (paragraph.toLowerCase().contains(term.toLowerCase())) {
            System.out.println("The word " + term + " was found."); }
        else {
            System.out.println("The word " + term + " was not found.");
        }

    }
}