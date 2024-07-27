public class CheckIfANumberIsPrime {
    public static void main(String atgs[]){
        int numberToCheck=9;
        int flag=0;
        /*way--------------------------------1---brute force*/
        if(numberToCheck<=1){
            System.out.println("The number is neither a prime nor a composite");
        }else{
            for(int i=2;i<numberToCheck;i++){
                if(numberToCheck % i ==0){
                    flag=1;
                }
            }
            if(flag ==1){
                System.out.println("Not a prime number");
            }else{
                System.out.println("A prime number");
            }
        }


        /*way-----------------------------2---optimized*/
        if(numberToCheck<=1){
            System.out.println("The number is neither a prime nor a composite");
        }else{
            for(int j=2;j<Math.sqrt(numberToCheck);j++){

                    if(numberToCheck % j ==0){
                        flag=1;
                    }
                }
                if(flag ==1){
                    System.out.println("Not a prime number");
                }else{
                    System.out.println("A prime number");
                }
            }
        }

}
