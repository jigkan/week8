import java.util.Scanner;

public class Qs5 {
    /*6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910


     */
    public static void main(String[] args) {
        int i;
        System.out.print("Input number of rows : ");
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
                for ( i=1;i<=number; i++) {
                    System.out.println("");
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);

                    }
                }
    }
}
