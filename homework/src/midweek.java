import java.util.Scanner;

public class midweek {

    public static void main(String[] args) {


        while(true){
            Scanner sc = new Scanner(System.in);

        System.out.println("please enter first number :");
        int n1 = sc.nextInt();
        System.out.println("please enter second number :");
        int n2 = sc.nextInt();
        System.out.println("please select symbol for calculation +,-,*,/ : ");
        char symbol = sc.next().charAt(0);


            switch (symbol) {
                case '+':
                    System.out.println("Addition of first and second number is:" + (n1 + n2));

                    break;
                case '-':
                    System.out.println("Substraction of first and second number is:" + (n1 - n2));

                    break;
                case '*':
                    System.out.println("Addition of first and second number is:" + (n1 * n2));

                    break;
                case '/':
                    System.out.println("division of first and second number is:" + (n1 / n2));

                    break;
            }

            System.out.println("y/n");
            Scanner in=new Scanner(System.in);
            String ans= in.next();
            if (("y".equals(ans))||("Y".equals(ans))){

            } else if (("n".equals(ans))||("N".equals(ans))) {
                break;
            }
        }


}}