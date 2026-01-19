/*
Problem Statement – Day 0: Hello, World.

To complete this challenge, you must save a line of input from standard input (stdin) into a variable, print Hello, World. on the first line, and then print the value of the variable on the second line.

You’ve got this!

Note:
The instructions are Java-based, but solutions can be submitted in many popular programming languages. You can switch languages using the drop-down menu above your editor. The variable name and style may differ depending on the best-practice conventions of the chosen language.

Input Format
A single line of text denoting the input string whose contents must be printed.

Output Format
Print Hello, World. on the first line.
Print the contents of the input string on the second line.
    */
import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        String input = sc.nextLine();

        // Print output
        System.out.println("Hello, Worldwel.");
        System.out.println(input);

        sc.close();
    }

    
}

// input Hi
// Output
//Hello, World.
//Hi 

   

