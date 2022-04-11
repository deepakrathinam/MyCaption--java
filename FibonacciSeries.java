import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //declaration
        Scanner s = new Scanner(System.in);
        int num,i,a,b,c;

        //getting input
        System.out.print("How many numbers do you want to print in Fibonacci Series? : ");
        num = s.nextInt();

        //printing Fibonacci Series
        System.out.println("FIBONACCI SERIES:");
        if (num == 1){
            System.out.println("0");
        }
        else {
            if (num == 2){
                System.out.println("0\n1");
            }
            else {
                System.out.println("0\n1");
                a = 0;
                b = 1;
                num -= 2;
                for (i = 1;i <= num;i++){
                    c = a + b;
                    System.out.println(c);
                    a = b;
                    b = c;
                }
            }
        }
    }
}
