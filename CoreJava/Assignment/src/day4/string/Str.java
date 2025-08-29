package day4.string;

import java.util.Arrays;

public class Str {

    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        boolean result = true;

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        int[] arr1 = new int[charArr1.length];
        int[] arr2 = new int[charArr1.length];

        for(int i = 0; i < arr1.length;i++){
            arr1[i] = Character.getNumericValue(charArr1[i]);
            arr2[i] = Character.getNumericValue(charArr2[i]);
        }




        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;


    }

    public static void countULS(String str){
        int upper = 0;
        int lower = 0;
        int number = 0;
        int specials = 0;

        char[] arr = str.toCharArray();

        for(char ch : arr){
            if(ch>=65&&ch<=90){
                upper++;
            }

            if(ch>=97&&ch<=122){
                lower++;
            }

            if(ch>=48&&ch<=57){
                number++;
            }

            else{
                specials++;
            }
        }

        System.out.format("Uppercase - %d\nLowercase - %d\nNumber - %d\nSpecials - %d\n",upper,lower,number,specials);
    }

    public static boolean isUpper(String str){

        char[] arr = str.toCharArray();
        for(char ch : arr){
            if(!(ch>=65&&ch<=90)){
                return false;
            }
        }
        return true;
    }

    public static String leftshift(String str){
        char ch = str.charAt(0);
        return str.substring(1) + ch;
    }

    public static boolean equals(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }

    public static boolean equalsWithIgnoreCase(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        int[] arr1 = new int[charArr1.length];
        int[] arr2 = new int[charArr1.length];

        for(int i = 0; i < arr1.length;i++){
            arr1[i] = Character.getNumericValue(charArr1[i]);
            arr2[i] = Character.getNumericValue(charArr2[i]);
        }

        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}
