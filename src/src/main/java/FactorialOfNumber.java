public class FactorialOfNumber {
    public static void main(String args[]) {
        int numberForFactorial=3;
        int factorial=1;
        int counter=1;
        /*way-----------------1*/
        do{
           factorial = factorial *counter;
           ++counter;
        }while(numberForFactorial >=counter);
        System.out.println("way 1::: Factorial of the number is "+factorial);


        /*way----------------------2*/

        int factorial2=1;
        for(int counter2=1;counter2<=numberForFactorial;counter2++){
            factorial2 =factorial2*counter2;
        }

        System.out.println("way 2::: Factorial of the number is "+factorial2);

        /*way----------------3*/

        System.out.println("way 3::: Factorial of the number" +
                " is "+factorialThree(numberForFactorial));


    }

    private static int factorialThree(int i) {
        if(i==0){
            return 1;
        }
        return i * factorialThree(i-1);
    }
}
