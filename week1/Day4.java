package week1;
//pattern : question *****************coding blok********************

import java.util.Scanner;

public class Day4 {
    public static void PatternSeries1(int num ){
        // //Q1.------>>>*****
        //             //   *****
        //             //   *****
        //             //   *****
        //             //   *****
        // for(int i = 1; i<=num ; i++){
        //     for(int j = 1 ; j<=num ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

        // // Q2.----->>>>*
        // //             * *
        // //             * * *
        // //             * * * *
        // for(int i = 1 ; i<=num ; i++){
        //     for(int j = 1 ; j<=i; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

        // // Q3.--------->>>>>>    *****
        // //                       ****
        // //                       ***
        // //                       **
        // //                       *
        // for(int i = num ; i>0 ; i--){
        //     for(int j = 1 ; j<=i ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

        // // Q4.----->>>>>     *
        // //                 * *
        // //               * * *
        // //             * * * *  
        // for(int i = 1 ; i<=num ; i++){
        //     for(int k = num-i ; k>0 ;k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j<=i ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

        // // Q5.--------->>>>>>    *****
        // //                        ****
        // //                         ***
        // //                          **
        // //                           *
        // for(int i = num ; i>0 ; i--){
        //     for(int k = num-i ; k>0 ;k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j<=i ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
        
        // // Q6.--------->>>>>>    *****
        // //                         ****
        // //                           ***
        // //                             **
        // //                               *
        // for(int i = num ; i>0 ; i--){
        //     for(int k = num-i ; k>0 ;k--){
        //         System.out.print(" \t\t");
        //     }
        //     for(int j = 1 ; j<=i ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println("");
        // }

        //     // Q7.---->>>> *******
        //     //             *     *
        //     //             *     *
        //     //             *     *
        //     //             *     *
        //     //             *     *
        //     //             *******
        // for(int i = 1 ; i<=num ; i++){
        //     for(int j = 1 ; j<=num ; j++){
        //         if(i==1||i==num||j==1||j==num){
        //             System.out.print("*\t");
        //         }
        //         else{
        //             System.out.print(" \t");
        //         }
        //     }
        //     System.out.println();
        // }

        // // Q8.----->>>>>       *       *
        // //                       *   *
        // //                         *
        // //                       *   *
        // //                     *       *
        // for(int i = 1; i <= num ; i++){
        //     for(int j = 1 ; j <= num-1 ; j++){
        //         if(i==j||i+j==num){
        //             System.out.print("*\t");
        //         }
        //         else{
        //             System.out.print(" \t");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // // Q9.------->>>>>>            *
        // //                            ***
        // //                           *****
        // //                          *******
        // //                         ********* 
        // for(int i = 1 ; i<=num ; i++){
        //     for(int k = num-i ; k>0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = ((2*i)-1) ; j > 0 ; j-- ){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // } 
        
        // // Q10.------->>>>>>           
        // //                         ********* 
        // //                          *******
        // //                           *****
        // //                            ***
        // //                             *
        // for(int i = num ; i>0 ; i--){
        //     for(int k = num-i ; k>0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = ((2*i)-1) ; j > 0 ; j-- ){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // } 

        // // Q11. ------->>>>>>>>>>>
        // //                             *
        // //                          *     *
        // //                       *     *    *
        // //                    *     *     *    *
        // //                 *     *     *    *    *
        // for(int i =1 ; i<=num ; i++){
        //     for(int k = num-i ; k>0 ; k--){
        //             System.out.print(" \t");
        //         }
        //         for(int j = 1 ; j <= i ; j++ ){
        //             System.out.print("*\t\t");
        //         }
        //         System.out.println();
        // }
        
        // // Q12. ------->>>>>>>>>>>
        // //                             *
        // //                           * !  *
        // //                        *  ! * !  *
        // //                     *  !  *  ! * ! *
        // //                   * !  *  ! *  ! * ! *
        // for(int i =1 ; i<=num ; i++){
        //     for(int k = num-i ; k>0 ; k--){
        //             System.out.print(" \t");
        //         }
        //         for(int j = 2*i-1 ; j > 0 ; j-- ){
        //             if(j%2==0){
        //                 System.out.print("!\t");
        //             }
        //             else{
        //                 System.out.print("*\t");

        //             }
        //         }
        //         System.out.println();
        // }

        // // Q13. ----->>>>>>>>>       *
        // //                           * *
        // //                           * * *
        // //                           * * * * 
        // //                           * * * 
        // //                           * * 
        // //                           *
        // for(int i = 1 ; i <= num ; i++){
        //     for(int j = 1 ; j <= i ; j++){
        //          System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
        // for(int i = num ; i > 0 ; i--){
        //     for(int j = 2 ; j <= i ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
        
        // // Q14. ----->>>>>>>>>             *
        // //                               * *
        // //                             * * *
        // //                           * * * * 
        // //                             * * * 
        // //                               * * 
        // //                                 *
        // for(int i = 1 ; i <= num ; i++){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= i ; j++){
        //          System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
        // for(int i = num ; i > 0 ; i--)
        //     for(int k = num-i+1 ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 2 ; j <= i ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
                    
        // //Q15.---->>>>               * * * * 
        // //                               * * * 
        // //                                   * * 
        // //                                       *
        // //                                   * * 
        // //                               * * * 
        // //                           * * * * 
        // for(int i = num ; i > 0 ; i--){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t\t");
        //     }
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
        // for(int i = 2 ; i <= num ; i++){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t\t");
        //     }
        //     for(int j = i ; j > 0 ; j--){
        //          System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
            
        // // Q16. ----->>>>>>>>>                   * * * *
        // //                                     * * *
        // //                                   * *
        // //                                 *
        // //                                   * * 
        // //                                     * * * 
        // //                                       * * * * 
        // for(int i = num ; i > 0 ; i--){
        //      for( int k = i-1 ; k > 0 ; k--){
        //         System.out.print(" \t");          
        //     }
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
        // for(int i = 2 ; i <= num ; i++){
        //      for(int k = i-1 ; k > 0 ; k--){
        //          System.out.print(" \t");
        //      }
        //     for(int j = 1 ; j <= i ; j++){
        //          System.out.print("*\t");
        //     }
        //     System.out.println();
        // }


        // // <<<<<<<<<<<<<***********🤦‍♀️🤦‍♀️🤦‍♀️ DOUBT LOGIC IS NOT VALID FOR EVEN NUM AND ALSO VERY COMPLICATED 🤦‍♀️🤦‍♀️🤦‍♀️***************>>>>>>>>>>

        // // // Q17. ----->>>>> * * *   * * * 
        // // //                 * *       * * 
        // // //                 *           *
        // // //
        // // //                 *           *
        // // //                 * *       * * 
        // // //                 * * *   * * * 
        // for(int i = 1; i <= num ; i++){
        //     for(int j = 1 ; j<=num/2-i+1; j++){
        //             System.out.print("*  ");
        //     }
        //     for(int k = 1 ; k <= 2*i-1 && i <= num/2 ; k++){
        //         System.out.print("   ");
        //     }
        //     for(int j = num/2-i+1; j > 0 ; j--){
        //             System.out.print("*  ");
        //     }
        //     for(int j = 1 ; j<=i-num/2-1 ; j++){
        //         System.out.print("*  ");
        //     }
        //     for(int k = 2*(num-i+1)-1 ; k > 0 && i > num/2 ; k--){
        //         System.out.print("   ");
        //     }
        //     for(int j = 1 ; j<=i-num/2-1 ; j++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }

        // // <<<<<<<<<<<<<***********🤦‍♀️🤦‍♀️🤦‍♀️ DOUBT LOGIC IS NOT VALID FOR EVEN NUM ANSD ALSO VERY COMPLICATED 🤦‍♀️🤦‍♀️🤦‍♀️***************>>>>>>>>>>
        
        // // Q18.-------->>>>>>>>               *
        // //                                  * * *
        // //                                * * * * * 
        // //                              * * * * * * *    <<<<<<<<<----------->>>>>>>>>>🤦‍♂️🤦‍♂️TIS CODE WILL WORK ONLY FOR ODD NO.S🤦‍♂️🤦‍♂️
        // //                                * * * * * 
        // //                                  * * * 
        // //                                    *
        // for(int i = 1 ; i <= num ; i++){
        //     for(int j = 1 ; j<=num/2-i+1 && i<=num/2 ; j++){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= 2*i-1 && i<=num/2+1 ; j++){
        //         System.out.print("*\t");
        //     }
        //     for(int j = 1 ; j< i-num/2 && i> num/2 ; j++){
        //         System.out.print("\t");
        //     }
        //     for(int j = 1 ; j <= 2*(num-i+1)-1 && i > num/2+1 ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

        // {
        //     //--------->>>>>>>>INCORRECT CODE(( BY ELSE IF STATEMENT )) <<<<<<<<<<<<<<<-----------
        //                             |^^^^^^^^|
        // // for(int i = 1 ; i <= num ; i++){
        // //     for(int j = 1 ; j <= num ; j++ ){
        // //         if(j<=num/2-i+1 && i<=num/2){
        // //             System.out.print(" \t");
        // //         }
        // //         else if ( j <= 2*i-1 && i<=num/2+1 ){
        // //             System.out.print("*\t");
        // //         }
        // //         else if ( j<= i-num/2 && i>= num/2 ){
        // //             System.out.print(" \t");
        // //         }
        // //         else if (j <= 2*(num-i+1)-1 && i >= num/2+1 ){
        // //             System.out.print("*\t");
        // //         }
        // //     }
        // //     System.out.println();
        // // }
        // }   
        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PatternSeries1(num);
    }
}
