public class Sq15 {
    /*
    15. Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
p
        int rows = 4;

        for (int x = 1; x <= rows; x++)
        {        for (int i = 1; i <= x; i++)
            {          System.out.print("* ");
            }     System.out.println("");

     */
    public static void main(String[] args) {
        int i;
        for ( i=1; i<=4; i++){
              for(int j=1; j<=i; j++)
            { System.out.print("*");
        }System.out.println(" ");}

    }


}
