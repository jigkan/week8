import java.util.Scanner;

public class Sq2 {
   /* 2. -Read the numbers from the console entered by the user and print the minimum
    and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
            -If the user enters an invalid number, break out of the loop and print the minimum and maximum
    number.
            Hint:
            -Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/

    public static void main(String[] args) {
        minMax();
    }
    public static void minMax(){
        int max = 0;
        int min = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            if(sc.hasNextInt()) {

                int a = sc.nextInt();

                if (a > max) {
                    max = a;
                }else {
                    min = a;
                }
            } else  {
                break;
            }
        }

        System.out.println("maximum number is : " + max);
        System.out.println("minimum number is : " + min);
    }

}


