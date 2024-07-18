//continue pattern questions <<<<<<<<<<<<------------>>>>>>>>>>>>-------->>>>>>

import java.util.Scanner;

public class Day5 {
    public static void PatternSeries2(int num){
        // // Q19------>>>>>>>       * * * * * * *
        // //                        * * *   * * *
        // //                        * *       * *
        // //                        *           *
        // //                        * *       * *
        // //                        * * *   * * *
        // //                        * * * * * * *
        // for(int i = 1; i <= num ; i++){
        //     for(int j = 1 ; j<=num/2-i+2; j++){
        //             System.out.print("*  ");
        //     }
        //     for(int k = 1 ; k <= 2*i-3 && i <= num/2+1 ; k++){
        //         System.out.print("   ");
        //     }
        //     for(int j = 1; j <= num/2-i+2 && j<num/2+1 ; j++){
        //             System.out.print("*  ");
        //     }
        //     for(int j = i-num/2 ; j>0 && i > num/2+1 ; j--){
        //         System.out.print("*  ");
        //     }
        //     for(int k = 2*(num-i)-1 ; k > 0 && i > num/2+1 ; k--){
        //         System.out.print("   ");
        //     }
        //     for(int j = 1 ; j<=i-num/2 && i > num/2+1 && j <= num/2 ; j++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }

        //Q20.---->>>> INCOMPLETE
        // for(int i = 1 ; i <= num ; i++ ){
        //     for(int j = 1 ; j <= num ; j++){
        //         // if((i+j) == num/2+2){
        //         //     System.out.print("*  ");
        //         // }
        //         if((i+j) == num/2+(i-1)*2-2 && j > num/2 ){
        //             System.out.print("*  ");
        //         }
        //         // else if ( (i + j) == 3*(num/2)+1  ){
        //         //     System.out.print("*  ");
        //         // }
        //         // else if ( (i + j) == 9 ){
        //         //     System.out.print("*  ");
        //         // }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        
        // // Q21.----->>>>>  *               *
        // //                 * *           * *
        // //                 * * *       * * * 
        // //                 * * * *   * * * * 
        // //                 * * * * * * * * * 
        // for(int i = 1 ; i <= num ; i++){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print("*\t");
        //     }
        //     for(int k = 2*(num-i)-1; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= i && j < num ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
        
        // // Q22.----->>>>>  * * * * * * * * *
        // //                 * * * *   * * * * 
        // //                 * * *       * * * 
        // //                 * *           * *
        // //                 *               * 
        // for(int i = num ; i > 0 ; i--){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print("*\t");
        //     }
        //     for(int k = 2*(num-i)-1; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= i && j < num ; j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

        // // Q23.-------->>>>>>>>>                1
        // //                                    1 1 1
        // //                                  1 1 1 1 1
        // //                                1 1 1 1 1 1 1 
        // for(int i = 1 ; i <= num ; i++){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= 2*i-1 ; j++ ){
        //         System.out.print("1\t");
        //     }
        //     System.out.println();
        // }

        // // Q24.-------->>>>>>>>>                1
        // //                                    2 2 2 
        // //                                  3 3 3 3 3
        // //                                4 4 4 4 4 4 4
        // for(int i = 1 ; i <= num ; i++){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= 2*i-1 ; j++ ){
        //         System.out.print(i+"\t");
        //     }
        //     System.out.println();
        // }

        // // Q25.--------->>>>>>>>>>                     1
        // //                                           2 3 4
        // //                                         5 6 7 8 9
        // int count = 1 ;
        // for(int i = 1 ; i <= num ; i++){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= 2*i-1 ; j++ ){
        //         System.out.print(count +"\t");
        //         count++;
        //     }
        //     System.out.println();
        // }  
        
        // // Q26.-------->>>>>>>>>                1
        // //                                    1 2 3
        // //                                  1 2 3 4 5
        // //                                1 2 3 4 5 6 7
        // for(int i = 1 ; i <= num ; i++){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= 2*i-1 ; j++ ){
        //         System.out.print(j+"\t");
        //     }
        //     System.out.println();
        // }

        // // Q27.------->>>>>>>                   1
        // //                                    1 2 1
        // //                                  1 2 3 2 1
        // //                                1 2 3 4 3 2 1
        // for(int i = 1 ; i <= num ; i++){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= i ; j++ ){
        //         System.out.print(j+"\t");
        //     }
        //     for(int j = i-1 ; j > 0 ; j-- ){
        //         System.out.print(j+"\t");
        //     }
        //     System.out.println();
        // }
        
        // // Q28.------->>>>>>>                   1
        // //                                    2 3 2
        // //                                  3 4 5 4 3
        // //                                4 5 6 7 6 5 4
        // for(int i = 1 ; i <= num ; i++){
        //     int t = i ;
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = 1 ; j <= i ; j++ ){
        //         System.out.print(t+"\t");
        //         t++;
        //     }
        //     for(int j = 1 ; j <= i-1 ; j++ ){
        //         System.out.print(t-2+"\t");
        //         t--;
        //     }
        //     System.out.println();
        // }

        // // Q29.------->>>>>>>                   1
        // //                                    2 0 2
        // //                                  3 0 0 0 3
        // //                                4 0 0 0 0 0 4
        // for(int i = 1 ; i <= num ; i++){
        //     for(int k = num-i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     System.out.print(i+"\t");
        //     for(int j = 1 ; j <= 2*(i-1)-1 ; j++ ){
        //         System.out.print(0+"\t");
        //     }
        //     if(i>1){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // // Q30.--------->>>>>>>>      5 4 3 2 1
        // //                            5 4 3 2 1
        // //                            5 4 3 2 1
        // //                            5 4 3 2 1
        // //                            5 4 3 2 1
        // for(int i = num ; i > 0 ; i -- ){
        //     for( int j = num ; j > 0 ; j -- ){
        //         System.out.print(j+"\t");
        //     }
        //     System.out.println();
        // }
        
        // // Q31.--------->>>>>>>>      5 4 3 2 *
        // //                            5 4 3 * 1
        // //                            5 4 * 2 1
        // //                            5 * 3 2 1
        // //                            * 4 3 2 1
        // for(int i = num ; i > 0 ; i -- ){
        //     for( int j = num ; j > 0 ; j -- ){
        //         if(i+j == num+1){
        //             System.out.print("*\t");
        //         }
        //         else{
        //             System.out.print(j+"\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // // Q32.--------->>>>>>>>>>        1
        // //                                2 * 2
        // //                                3 * 3 * 3
        // //                                4 * 4 * 4 * 4
        // //                                3 * 3 * 3
        // //                                2 * 2
        // //                                1
        // for(int i = 1 ; i <= num ; i ++){
        //     for(int j = 1 ; j <= i ; j ++){
        //         System.out.print(i+"\t");
        //         if(i!=j){
        //             System.out.print("*\t");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i = num-1 ; i > 0  ; i -- ){
        //     for(int j = i ; j > 0 ; j -- ){
        //         System.out.print(i+"\t");
        //         if(j!=1){
        //             System.out.print("*\t");
        //         }
        //     }
        //     System.out.println();
        // }
        // // ALSO IN THIS WAY WE CAN PRINT THIS PATTERN
        // for(int i = 1 ; i <= 2*num-1 ; i ++){
        //     int x = 2*num-i;
        //     for(int j = 1 ; j <= i && i <= num; j ++){
        //         System.out.print(i+"\t");
        //         if(i!=j){
        //             System.out.print("*\t");
        //         }
        //     }
        //     for(int j = x ; j > 0 && i > num && x+i == 2*num ; j -- ){
        //         System.out.print(x+"\t");
        //         if(j!=1){
        //             System.out.print("*\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // // Q33.--------->>>>>>>>>>        0
        // //                              5 0 5
        // //                            4 5 0 5 4                             
        // //                          3 4 5 0 5 4 3                        
        // //                        2 3 4 5 0 5 4 3 2                         
        // //                      1 2 3 4 5 0 5 4 3 2 1
        // for(int i = num+1 ; i > 0 ; i -- ){
        //     int x = i ;
        //     for(int k = i ; k > 0 ; k--){
        //         System.out.print(" \t");
        //     }
        //     for(int j = num-i ; j >= 0 ; j -- ){
        //         System.out.print(x+"\t");
        //         x++;
        //     }
        //     System.out.print(0+"\t");
        //     x=num;
        //     for(int j = num-i ; j >= 0 ; j -- ){
        //         System.out.print(x+"\t");
        //         x--;
        //     }
        //     System.out.println();
        // }

        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PatternSeries2(num);
    }
}
