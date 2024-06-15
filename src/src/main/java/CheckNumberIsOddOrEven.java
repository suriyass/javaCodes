public class CheckNumberIsOddOrEven {
    public static void main(String args[]){
           int numberToCheck =4;

           /*way-------------------1*/

        if(numberToCheck%2==0){
            System.out.println("way 1:::The given number is EVEN number");
        }else{
            System.out.println("way 1::The given number is ODD number");
        }

        /*way--------------------2------bitwise OR*/

        if((numberToCheck|1)>numberToCheck){
            System.out.println("way 2::The given number is EVEN number");
        }else{
            System.out.println("way 2::The given number is ODD number");
        }

        /*way--------------3---------AND*/

        if((numberToCheck & 1) == 1){
            System.out.println("way 3::The given number is ODD number");
        }else{
            System.out.println("way 3::The given number is even number");
        }
    }
}
