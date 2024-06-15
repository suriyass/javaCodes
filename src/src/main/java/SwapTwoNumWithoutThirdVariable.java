public class SwapTwoNumWithoutThirdVariable {
    public static void main(String args[]){
        int nOne =9;
        int nTwo=5;
       System.out.println("Before swap::::" +
               "NUMBER ONE ="+nOne+"" +
               " NUMBER TWO = "+nTwo+"");

       /*way------------arthemetic operator*/

        nOne = nOne +nTwo;
        nTwo = nOne - nTwo;
        nOne = nOne - nTwo;
        System.out.println("After swap::: arthemetic:::" +
                "NUMBER ONE ="+nOne+"" +
                " NUMBER TWO = "+nTwo+"");

        /*way---------------multi/divi*/

        nOne =9;
        nTwo=5;
        nOne = nOne* nTwo;
        nTwo = nOne/nTwo;
        nOne = nOne/nTwo;

        System.out.println("After swap::: multi/divi:::" +
                "NUMBER ONE ="+nOne+"" +
                " NUMBER TWO = "+nTwo+"");

    }
}
