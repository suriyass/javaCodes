public class CheckIfANumberIsArmstrongNumber {
    public static void main(String argsp[]) {
        int numberToCheck=121;
        int sumOfDigit=0;
        int countOfDigits = String.valueOf(numberToCheck).length();
        int individualDigits=0;
        int actualNumber= numberToCheck;
        while(numberToCheck >0){
            individualDigits =numberToCheck%10;
            numberToCheck = numberToCheck /10;
            sumOfDigit = (int) (sumOfDigit + Math.pow(individualDigits,countOfDigits));
        }

        if(sumOfDigit == actualNumber)
            System.out.println("The number "+actualNumber+" is a armstrong number");
        else
            System.out.println("The number "+actualNumber+" is not a armstrong number");
    }
}
