public class Sq11 {
  /*11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
*/


 public static int getEvenDigitSum(int number)
 { int mainnumner = number;
    int lastdigit;
    int evensum=0;
    if (number>=0){
        while (number > 0) {
            lastdigit = number % 10;
            if (lastdigit % 2 == 0) {
                evensum += lastdigit;
            }
            number /= 10;
        }
    if(mainnumner>=0){
        java.lang.System.out.println("The sum of even digits within a number " + mainnumner + " is equal to:" + evensum );
            }
     return evensum; }

    System.out.println("Invalid input:");
        return -1;
 }}

