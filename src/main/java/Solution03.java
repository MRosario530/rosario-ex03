/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
import java.util.*;

public class Solution03 {

    public static void main(String[] args) {
	/*
		print: What is the quote?
	    'quote' = read string from user
	    print: Who said it?
	    'author' = read string from user
		print: 'author' says, " 'quote' "
	*/

        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }

}
