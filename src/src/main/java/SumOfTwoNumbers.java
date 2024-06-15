public class SumOfTwoNumbers {
    public static void main(String arguments[]) {
      int numberOne=4;
      int numberTwo=3;
      /*way--------1*/
        int totalValue = numberOne+numberTwo;
        System.out.println("Sum of two digits------------>"+totalValue);

        /*way---------------2*/
        int totalSum = Integer.sum(numberOne,numberTwo);
        System.out.println("Sum of two digits----------->"+totalSum);

        /*way-----------3*/
        int totalSumVal = findTheSum(numberOne,numberTwo);
        System.out.println("Sum of two digits------------>"+totalSumVal);
    }

    private static int findTheSum(int numberOne, int numberTwo) {
        return numberOne+numberTwo;
    }
}
