public class Sq13 {
    /*
    13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each numbershould be within the range of 10 (inclusive) - 99 (inclusive). If one ofthe numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
public class SharedDigit {


     */
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b){

    if (a<10 || b>75)
        return false;
    int x=a%10;//last digit
    int y=b%10;//last digit
        a/=10;
        b/=10;
        return (a==b||a==y||b==x||x==y);}





   // {
        //if(a >= 10 && a <= 99 && b >= 10 && b >=10 && b <=99 || a / 10 == b / 10 || a %  10 == b / 10){

         //   return true;

       // }


 // return false;

//}

    }