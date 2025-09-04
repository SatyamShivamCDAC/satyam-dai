package day4.string;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("First String - ");
        String str1 = sc.next();
        System.out.print("Second String - ");
        String str2 = sc.next();

        if(Str.isAnagram(str1 ,str2)){
            System.out.println("Given Two Strings are Anagram");
        }
        else{
            System.out.println("Given Two Strings are Not Anagram");
        }

        System.out.print("\nFor first String");
        Str.countULS(str1);

        System.out.println("\nFirst String is in Upper Case Characters - " + Str.isUpper(str1));

        System.out.print("\nLeft Shift on First String ");
        System.out.println(Str.leftshift(str1));

        if ((Str.equals(str1, str2))) {
            System.out.println("\nGiven Strings are Equal");
        } else {
            System.out.println("\nGiven Strings are not Equal");
        }

        if ((Str.equalsWithIgnoreCase(str1, str2))) {
            System.out.println("\nGiven Strings are Equal ignoring case");
        } else {
            System.out.println("\nGiven Strings are not Equal ignoring case");
        }


    }
}
