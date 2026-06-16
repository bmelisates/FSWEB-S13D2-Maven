package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // System.out.println( isPalindrome(-1221));
        // System.out.println( isPalindrome(707));
        // System.out.println( isPalindrome(11212));
        // System.out.println(isPerfectNumber(6));
        // System.out.println(isPerfectNumber(28));
        // System.out.println(isPerfectNumber(5));
        // System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

    }

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(Math.abs(number));
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false; // Eşleşmezse palindrom değildir
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        if (number < 0) return false;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number){
        if(number < 0) return "Invalid Value";
        String numStr = String.valueOf(number);
        String result = "";
        for (int i = 0; i < numStr.length(); i++){
            char digit = numStr.charAt(i);
            switch (digit) {
                case '0': result += "Zero"; break;
                case '1': result += "One"; break;
                case '2': result += "Two"; break;
                case '3': result += "Three"; break;
                case '4': result += "Four"; break;
                case '5': result += "Five"; break;
                case '6': result += "Six"; break;
                case '7': result += "Seven"; break;
                case '8': result += "Eight"; break;
                case '9': result += "Nine"; break;
            }
            if (i < numStr.length() - 1) {
                result += " ";
            }
        }
        return result;
    }

}
