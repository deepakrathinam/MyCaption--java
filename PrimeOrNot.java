import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        //declaration
        Scanner s = new Scanner(System.in);
        int num,i,divided;

        //setting default value
        divided = 0;

        //getting an input
        System.out.print("Enter a number : ");
        num = s.nextInt();

        //checking whether prime or not
        if (num == 2){
            divided += 0;
        }
        else {
            if ((num % 2) == 0 || num == 1){
                divided += 1;
            }
            else {
                for (i = 3;i <= (num / 2);i += 2){
                    if ((num % i) == 0){
                        divided += 1;
                        break;
                    }
                }
            }
        }

        //printing the result
        if (divided == 0){
            System.out.println(num + " is a PRIME NUMBER");
        }
        else {
            System.out.println(num + " is not a PRIME NUMBER");
        }
    }
}
