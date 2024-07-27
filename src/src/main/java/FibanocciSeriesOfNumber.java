public class FibanocciSeriesOfNumber {
    public static void main(String args[]) {
        int firstNum=0;
        int nextNum=1;
        int fibSeriesTerm=5;
        /*way----------------------------------1*/
        for(int i=0;i<fibSeriesTerm;i++){
            System.out.print(firstNum+" ");
            int ser = nextNum+firstNum;
            firstNum = nextNum;
            nextNum = ser;
        }

        System.out.println("-------------------------------");
        /*way------------------------------------2*/
        for(int j=0;j<fibSeriesTerm;j++){
            System.out.print(fibnocci(j)+" ");
        }
    }

    private static int fibnocci(int j) {
        if(j<=1)
            return j;
        return fibnocci(j-1)+fibnocci(j-2);
    }
}
