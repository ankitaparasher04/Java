// import java.util.*;
// public class Day3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){
//             for(int k= num-i ;k>0;k--){
//                 System.out.print(" \t");
//             }
//             for(int j = 1 ; j<= i && j<=(num/2)+1;j++){
//                 System.out.print("*\t");
//             }           
//             for(int j=2;j<=i;j++){
//                System.out.print("*\t");
//             }
//                System.out.println();
//         }
//         sc.close();
//     }
// }




// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for( int i=1; i<=num ; i++ ){
//             for( int k= num-i ; k>num/2 ; k-- ){
//                 System.out.print(" \t");
//             }
//             if( num%2==0 ){ 
//                 for( int j = 1 ; j<=i && j<=num/2 ; j++ ){
//                     System.out.print("*\t");
//                 } 
//             }          
//             else{ 
//                 for( int j = 1 ; j<= i && j<=num/2+1 ; j++){
//                     System.out.print("*\t");
//                 } 
//             }          
//             for( int j=2 ; j<=i ; j++ ){
//                System.out.print("*\t");
//             }
//                System.out.println();
//         }
//         sc.close();
//     }
// }




// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for( int i=1; i<=num ; i++ ){
//             for( int k = num/2 ; k<=num-i> ; k --){
//                 System.out.print(" \t");
//             }
//             if( num%2==0 ){ 
//                 for( int j = 1 ; j<=i && j<=num/2 ; j++ ){
//                     System.out.print("*\t");
//                 } 
//             }          
//             else{ 
//                 for( int j = 1 ; j<= i && j<=num/2+1 ; j++){
//                     System.out.print("*\t");
//                 } 
//             }          
//             for( int j=2 ; j<=i ; j++ ){
//                System.out.print("*\t");
//             }
//                System.out.println();
//         }
//         sc.close();
//     }
// }



// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){
//             for(int k=num-i;k>0;k--){
//                 System.out.print(" \t");
//             }
//             for(int j=1;j<=i;j++){
//                 if(j%2!=0){
//                     System.out.print("*\t");
//                 }
//                 else{
//                     System.out.print(" \t");
//                 }
//             }
//             for(int j = 2;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("*\t");
//                 }
//                 else{
//                     System.out.print(" \t");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

 

// // star doubt
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){
//             for(int k = 1;k<-num-i;k++){
//                 System.out.print(" \t");
//             }
//             for(int j =1 ; j<=i;j++){
//                 System.out.print("*\t");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

