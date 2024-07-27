public class CheckIfANumberIsPalindrome {
    public static void main(String arguments[]) {
       int numberToCheck=123;
       int reverseNumber=0;

       /*way-----------------------------1*/

        int temp =numberToCheck;
        while (temp>0){
            reverseNumber = reverseNumber*10 + temp%10;
            temp = temp/10;
        }

        if(numberToCheck == reverseNumber)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");


        /*way---------------------------------------2*/
        System.out.println("------------------------------------------------");

        String numberToCheckString = String.valueOf(numberToCheck);
        String reverseString = new StringBuffer(numberToCheckString).reverse().toString();

        if(numberToCheckString.equalsIgnoreCase(reverseString))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");


    }

}
