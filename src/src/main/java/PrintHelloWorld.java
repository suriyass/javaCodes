public class PrintHelloWorld {
    public static void main(String arguments[]){
        /*way---1*/
        System.out.println("Hello, World!");
        /*way--2*/
        String message="Hello,World---2!";
        System.out.println(message);
        /*way----3*/
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");
        sb.append("---3");

        System.out.println(sb);
    }

}
