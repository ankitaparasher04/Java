package week2;

import java.util.Scanner;
import java.lang.*;

//array
public class Day2 {
    // static int sumArr(int[] arr){
    //     int sum =0 ;
    //     for(int i : arr){
    //         sum = sum+ 1;
    //     }
    //     return sum;
    // }
    static void printArr(int [] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    // static void revArrEl(int[] arr){
    //     int i = arr.length-1;
    //     for(int j = 0 ; j < i  ; j++){
    //         
    //     }
    //     printArr(arr);
    // }
    //by sir(heep and stack concept only work for call by value not on claa by refference )
    // static void revArr(int[] arr){
    //     // int i = arr.length-1;
    //     int[] temp = new int [arr.length];
    //     for(int j = 0 ; j < arr.length  ; j++){
    //        temp[j]=arr[arr.length-1-j];
    //     }
    //     for(int i : arr ){
    //         arr[i]=temp[i];
    //     }
    //     System.out.println("array after reverse : ");
    //     printArr(arr);
    //     System.out.println("length of arr"+arr.length);
    // }
    //by myself
    // static void revArr(int[] arr){
    //     int i = arr.length-1;
    //     int temp = 0;
    //     for(int j = 0 ; j < i  ; j++){
    //         temp = arr[j];
    //         arr[j]=arr[i];
    //         arr[i]=temp;
    //         i--;
    //     }
    //     System.out.println("array after reverse : ");
    //     printArr(arr);
    // }
    // static void swap2no(int[] arr,int a , int b){
    //     int temp = arr[b] ; 
    //     arr[b] = arr[a] ;
    //     arr[a] = temp ;
    // }
    // static void revBySwap(int [] arr,int a , int b){
    //     for(int i = a , j = arr.length-1 ; i<j && j>=b ; i++,j--){
    //         if(a>b||a<0||b>arr.length){
    //             return ;
    //         }
    //         else{
    //         swap2no(arr,i,j);
    //         }
    //     }
    // }
    // static boolean linearSearch(int[] arr,int num ){
    //         // for(var i=1){
    //         for(var i=0 ; i<arr.length ; i ++ ){
    //         if(arr[i]==num){
    //             System.out.println("searching succesfully");
    //             System.out.println("index of the element search : "+ i );
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // static void sort(int[] arr){
    //     for(int i = 0 ; i < arr.length ; i++ ){
    //         for(int j = arr.length-1 ; j > 0 && j > i ; i++){
    //             int temp;
    //             if(arr[i]>arr[j])
    //                 temp = arr[j] ; 
    //                 arr[j] = arr[i] ;
    //                 arr[i] = temp ;
    //             }
    //         }
    //     }
    // }
    static boolean binarySearch(int [] arr , int num){
        // sort(arr);
        int beg=0,end=arr.length-1,mid=(beg+end)/2;
        for(int i = 0 ; i <= arr.length && beg<end ; i++){
            if(arr[mid]==num){
                System.out.println("hi");
                return true;
            }
            else if (arr[mid]<num){
                beg = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // //sum  of elements of array
        // System.out.println("number of elements in the array : ");
        // int num = sc.nextInt();
        // int[] arr = new int[num];
        // for(int i : arr){
        //     arr[i]=i+1;
        // }
        // System.out.println("sum of thr elements of the array : "+sumArr(arr));
        

        // //read the elements of array backword without changing the position of elements of array
        // System.out.println("number of elements in the array : ");
        // int num = sc.nextInt();
        // int[] arr = new int[num];
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i]=i;
        // }
        // printArr(arr);
        // revArrEl(arr);

        //reverse the element of array 
        // System.out.println("number of elements in the array : ");
        // int num = sc.nextInt();
        // int[] arr = new int[num];
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i]=i;
        // }
        // System.out.println("array before reverse : ");
        // printArr(arr);
        // revArr(arr);
        // printArr(arr);

        // System.out.println("number of elements in the array : ");
        // int num = sc.nextInt();
        // int[] arr = new int[num];
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i]=i+1;
        // }
        // System.out.println("array before reverse : ");
        // printArr(arr);
        // revBySwap(arr,1,3);
        // System.out.println("array after reverse : ");
        // printArr(arr);


        //array=operations=searching and sorting
        //searching==linear and binary
        // //linearsearch
        // System.out.println("number of elements in the array : ");
        // int num = sc.nextInt();
        // int[] arr = new int[num];
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("enter the element you want to search");
        // int numS = sc.nextInt();
        // boolean t = linearSearch(arr,numS);
        // if(t == false){
        //     System.out.println("searching unsuccesful");
        // }

        //binary search 
        System.out.println("number of elements in the array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to search");
        int numS = sc.nextInt();
        boolean t = binarySearch(arr,numS);
        if(t==true){
            System.out.println("searching successfully");
        }
        else{
            System.out.println("searching successfully");
        }


    }
}

