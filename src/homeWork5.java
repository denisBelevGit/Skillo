import java.util.Scanner;
import java.util.*;

public class homeWork5 {
    public static void main(String[] args) {
        //Ex1
        double res = minNumMeth(13.74 , 65.33 , 75.2);
        System.out.println(res);
         //Ex2
        System.out.println(avrg(3, 5, 6));
         //Ex3
        middChar("Animal");
         //Ex4
        System.out.println(countWords("Spooky Halloween everyone, Booo & bla blah!"));
         //Ex5
        isEven();
         //Ex6
        palindrome();
    }

    public static double minNumMeth(double num1, double num2, double num3) {
        double smallNum = 0;
        if (num1 < num2 && num1 < num3) {
            smallNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallNum = num2;
        } else if (num3 < num1 && num3 < num2) {
            smallNum = num3;
        }
        return smallNum;
    }

    public static double avrg(double num1, double num2, double num3) {

        double sum = num1 + num2 + num3;
        double average = sum / 3;
        return average;
    }

    public static void middChar(String value) {
        int lenght;
        int position;

        if (value.length() % 2 == 0) {
            position = value.length() / 2 - 1;
            lenght = 2;
        }else {
            position= value.length() / 2;
            lenght= 1;
        }
        System.out.println(value.substring(position , position+ lenght));
    }

    public static int countWords(String text){
    String trimmedText = text.trim();
    int counter=0;
    int textLenght= trimmedText.length();
     if(textLenght>1) {
            counter++;
            for (int i = 1; i < textLenght; i++) {
                if (trimmedText.charAt(i) == ' ') {
                    counter++;
                }
            }
        }
    return counter;
    }
    public static void isEven() {
        Scanner checkNum = new Scanner(System.in);
        System.out.println("Enter Number");
        int i = checkNum.nextInt();
        if (i >= 0) {
            isEven(i);
        } else {
            System.out.println("Enter Positive Integer!");
        }
        if (isEven(i) == true) {
            System.out.println("true");
        } else if (isEven(i) == false) {
            System.out.println("false");
        }
    }
    public static boolean isEven(int i){
        if (i % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void palindrome()
    {
        String num, reverseNum= "" ;
        Scanner in = new Scanner(System.in);
        System.out.println("Palindrome Checker, enter a number:");
        num = in.nextLine();
        int length = num.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverseNum = reverseNum + num.charAt(i);
        if (num.equals(reverseNum))
            System.out.println("Your number is a palindrome.");
        else
            System.out.println("Your number isn't a palindrome ;(");
    }

}


