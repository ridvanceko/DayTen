import java.util.Scanner;
import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {

         int [] arrayValue = new int [10];

        Scanner input = new Scanner(System.in);

        int count=0;

        for (int i = 0; i < arrayValue.length; i++) {
            System.out.println("What is your array  number value? " + (arrayValue.length-i) +  "number left!" );
      arrayValue[i] = input.nextInt();



        }

            System.out.println(Arrays.toString(arrayValue));

    }
}

//Create one int array with size of 10 without any value. Using scanner ask
//user to provide the int value until you filled out the array with given numbers.
//Then print the array with all numbers.
//Int [] numbers=new int[10];
//Example:
//Please enter the int number. You have 10 space in array:
//11
//Please enter the int number. You have 9 space in array:
//43
//Please enter the int number. You have 8 space in array:
//77
//.. keep continue to ask user until you don't have any space in the array.


//package Homeworks.Homework10;
//​
//import java.util.Arrays;
//import java.util.Scanner;
//​
//public class Task3 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//​
//​
//        int [] array=new int[10];
//        int count= array.length;
//​
//        for (int i = 0; i < array.length ; i++) {
//            System.out.println("Provide numbers. You have "+count+" space in array.");
//            int numbers = input.nextInt();
//            array[i]=numbers;
//            count--;
//        }
//        System.out.println(Arrays.toString(array));
//    }}