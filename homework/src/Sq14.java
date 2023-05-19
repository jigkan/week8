import java.util.Scanner;

public class Sq14 {
    /*
    14. Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
     */
    //  public static void main(String[] args) {
    //   int i;
    // for ( i=1; i<=5; i++){
    //  for(int j=1; j<=i; j++){
    //      System.out.print(" * ");
    //   }
    //   System.out.println("");
    // }
    // for (i=1; i<5; i++){
    //     for (int j=0;j<i;j++){
    //        System.out.print("*");
    //}
    //    System.out.println(" " );
    //}}
//}

    public static void main(String[] args) {
       number();
    }
    public static void number(){
        int i,j;
        System.out.print("enter number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

 /*for (i=0;i<num;i++){
     for (j=1;j<=num-1;j++)
     System.out.println("");
     for(j=1;j<1*i-1;j++)
     System.out.print("*");}

     for (i=num-1; i>=1;i--) {
             for (j = 1; j <= num - i; j++)
                 System.out.println(" ");
                 for (j = 1; j <= 1 * i - 1; j++)
                     System.out.print("*");
             }
         }*/
        i=0;
               do{ j=1;
                   do {System.out.println(""); j++;}
                   while(j<=num-1);
                   j=1;
                   do {System.out.print("*"); j++;}
                   while(j<1*i-1);
               i++;}while(i<num);

        i=num-1; do{
            do {System.out.println(""); j++;}
            while(j<=num-1);
            j=1;
            do {System.out.print("*"); j++;}
            while(j<1*i-1);

            i--;}while(i>=1);

    }}