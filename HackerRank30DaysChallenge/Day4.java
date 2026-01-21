import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int i = 0; i < 3; i++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }
}

/*
You have to create a Person class that has one variable called age.
  The class must have a constructor that takes an integer value.
  If the given age is negative, then age should be set to 0 and the message “Age is not valid, setting age to 0.
  should be printed. If the age is valid, then it should be assigned normally.
  
  You must also write two methods:

yearPasses(): It increases the age by 1 year.
amIOld(): It checks the value of age and prints:
"You are young.” if age is less than 13
“You are a teenager.” if age is between 13 and 17
“You are old.” if age is 18 or more

Sample Input:
4
-1
10
16
18
Sample Output:
Age is not valid, setting age to 0.
You are young.
You are young.
You are young.
You are a teenager.
You are a teenager.
You are old.
You are old.
You are old.  
*/


