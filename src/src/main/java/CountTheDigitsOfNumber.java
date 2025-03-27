public class CountTheDigitsOfNumber {
    public static void main(String args[]){
        int numberToCheck =234;
        /*way----1*/
        int countOne=0;
        while(numberToCheck !=0){
            numberToCheck =numberToCheck/10;
            countOne++;
        }
        System.out.println("the number of digits using while loop:: " +countOne);

        /*way---2*/
        numberToCheck =2346;
        int counttwo = String.valueOf(numberToCheck).length();
        System.out.println("The number of digits using string function:: "+counttwo);

        /*way--------3 streams*/
        numberToCheck =23564;
        long countThree = String.valueOf(numberToCheck).chars().count();
        System.out.println("The number of digits using stream functions:: "+countThree);

        /*way---3 math functions---*/
        numberToCheck =2356467;
        int countFour = (numberToCheck == 0) ? 1 :(int) Math.log10(Math.abs(numberToCheck))+1;
        System.out.println("The number of digits using Math functions:: "+countFour);
    }
}
