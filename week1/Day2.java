package week1;
//loops

//intigers from 1 to n
import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        // int i=1;                 //while loop
        // while(i<=num){
        //     System.out.println(i);
        //     i++;
        // }
        // for(int i = 1;i<=num;i++){              //for loop
        //     System.out.println(i);
        // }

        // //q1. take an int as an input and print * n times
        // for(int i =1 ; i <= num;i++){
        //     System.out.print("*\t");
        // }

        //nested loops 

        //1.  *****
        //    *****
        //    *****
        //    *****
        //    *****
        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=num;j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

        // //2.     *
        //          **
        //          ***
        //          ****
        //          *****
        // for(int i=1;i<=num;i++){
            //     for(int j=1;j<=i;j++){
                //         System.out.print("*\t");
                //     }
                //     System.out.println(); 
                // }
                
                
                // // 3.           *
                // //             **
                // //            ***
                // //           ****
                // //          *****
                // //new pattern for the blank space is i+j<=n(here j replaca by k later) which result out be k<=n-i
                // for(int i=1;i<=num;i++){
                    //     for(int k= num-i;k>0;k--){
                        //         System.out.print(" \t");
                        //     }
                        //     for(int j = 1 ; j<= i;j++){
                            //         System.out.print("*\t");
                            //     }
                            //     System.out.println();
                            // }
                // //4.           *****
                // //             ****
                // //             ***
                // //             **
                // //             *            
                // for(int i=num;i>=0;i--){
                //         for(int j=1;j<=i;j++){
                //                 System.out.print("*\t");
                //             }
                //             System.out.println(); 
                //         }


                // for(int i=num;i>=1;i--){
                //         for(int k= num-i;k>0;k--){
                //                 System.out.print(" \t");
                //             }
                //             for(int j = 1 ; j<= i;j++){
                //                     System.out.print("*\t");
                //                 }
                //                 System.out.println();
                // }

                // for(int i=num;i>=1;i--){
                //         for(int k= num-i;k>0;k--){
                //                 System.out.print(" \t\t");
                //             }
                //             for(int j = 1 ; j<= i;j++){
                //                     System.out.print("*\t");
                //                 }
                //                 System.out.println();
                // }

                // for(int i=1;i<=num;i++){
                //         for(int k= num-i;k>0;k--){
                //                 System.out.print(" \t\t");
                //             }
                //             for(int j = 1 ; j<= i;j++){
                //                     System.out.print("*\t");
                //                 }
                //                 System.out.println();
                //             }

                // for(int i=num;i>=1;i--){
                //         for(int k= num-i;k>0;k--){
                //                 System.out.print(" \t\t");
                //             }
                //             for(int j = 1 ; j<= i;j++){
                //                     System.out.print("*\t");
                //                 }
                //                 System.out.println();
                // }

                // for(int i=1;i<=num;i++){
                //     for(int j=1;j<=num;j++){
                //         if(i==num||i==1||j==1||j==num){
                //             System.out.print("*\t");
                //         }
                //         else{
                //             System.out.print(" \t");
                //         }
                //     }
                //     System.out.println();
                // }
// {**************doubt***********
//             for(int i=1;i<=num;i++){
//                     for(int j=1;j<=num;j++){
//                         if(i==num||i==1||j==1||j==num||i+j==num-1||i==j){
//                             System.out.print("*\t");
//                         }
//                         else{
//                             System.out.print(" \t");
//                         }
//                     }
//                     System.out.println();
//                 }
// }

            // for(int i=1;i<=num;i++){
            //     for(int k=num-i;k>0;k--){
            //         System.out.print(" \t");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*\t");
            //     }
            //     for(int j = 2;j<=i;j++){
            //         System.out.print("*\t");
            //     }
            //     System.out.println();
            // }


    sc.close();
    }
}
                    