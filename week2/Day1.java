//FUNCTION
package week2;

import java.util.Collection;
import java.util.Scanner;
import java.lang.*;

public class Day1 {
    public static void swap2No(int a , int b){
        int temp ; 
        temp = a ;
        a = b ;
        b = temp;
        // Collection.swap(a,b);//do search for more
        System.out.println("numbers after swap are : "+a+" and "+b);
    }
    // public static void printNaturalNo(int num){
    //     for(int i = 1 ; i <= num ; i++ ){
    //         System.out.print(i+"\t");
    //     }
    // }
    // public static boolean checkPrime(int num ){
    //     for(int i = 2; i <= num/2 ; i++ ){
    //         if(num%i == 0){
    //             return true ;
    //         }
    //     }
    //     return false;
    // }
    // public static int inversNo(int num ){
    //     int invNo = 0 ;
    //     for(int i = 1 ; num != 0 ; i++){
    //         invNo = invNo*10 + num%10 ;
    //         num = num/10 ;
    //     }
    //     return invNo ;
    // }

    // public static int countDigit(int num){
    //     int count = 0;
    //     for(int i = 1 ; num != 0 ; i++){
    //         count++;
    //         num = num/10 ;
    //     }
    //     return count ;
    // }

    // public static boolean checkArmstrong(int num){
    //     int temp = num , count = 0 ;
    //     int checkArm = 0 ;
    //     for(int i = 1 ; temp != 0 ; i++ ){
    //         count++;
    //         temp/=10;
    //     }
    //     temp = num ;
    //     for(int i = 1 ; temp != 0 ; i++ ){
    //         checkArm += Math.pow(temp%10, count);//here explicitly cnvert a double to int as Math.pow() is a double type
    //         temp /= 10;
    //     }
    //     return checkArm==num;
    // }


    //ARRAYS

    public static void printArrey(int[] arr ){

        //foreach loop
        // for(int j : arr){
        //     System.out.println(arr[j]+"\t");
        // }
        for(int i = 1 ; i <= arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // //Swap 2 numbers
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("numbers before swap are : "+a+" and "+b);
        // swap2No(a,b);

        // //print n natural numbers
        // int num = sc.nextInt();
        // printNaturalNo(num);

        //creat a func to check number is prime or not
        // int num = sc.nextInt();
        // boolean check = checkPrime(num);
        // if(check==true){
        //     System.out.println(num + " is not a prime number ");
        // }
        // else{
        //     System.out.println(num + " is a prime number ");
        // }

        // //invers of number n
        // int num = sc.nextInt();
        // System.out.println("number before inverse : "+num);
        // System.out.println("number after inverse : "+inversNo(num));
        
        // //count number of digits in a given number 
        // int num = sc.nextInt();
        // System.out.println("number of digits in "+ num + "is/are : "+countDigit(num));

        // // Armstrong Number:::
        // int num = sc.nextInt();
        // boolean t = checkArmstrong(num);
        // if(t==true){
        //     System.out.println(num + " is a  armstrong number ");
        // }
        // else{
        //     System.out.println(num + " is not a  armstrong number ");
        // }

        //ASSIGNMENT operator will convert data type implicitly 
        // char a = 'a';
        // int b = 4 ;
        // a += b;
        // System.out.println(a);


        //ARRAYS
        // int[] arr = new int [2];
        // float[] arr1 = new float[2];
        // char[] arr2 = new char[2];
        // System.out.println(arr);
        // System.out.println(arr+"int");
        // System.out.println(arr1);
        // System.out.println(arr1+"float");
        // System.out.println(arr2);//it will no show the address of arr2 
        // System.out.println(arr2+" ");
        // System.out.println(arr2+"char");
        // arr[0] = 1;
        // arr1[0] = 1;
        // arr2[0] = 'a';
        // arr2[1] = 95;
        // String arr3 = " ";
        // System.out.println(arr[0]);
        // System.out.println(arr1[0]);
        // System.out.println(arr2[0]);
        // System.out.println(arr2[1]);
        // System.out.println(arr3);

        int[] arr = new int[10];
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i]=i+1;
        }
        // int [] num = {1,2,3,4};

        printArrey(arr);
        // printArrey(num);



        sc.close();
    }
}
