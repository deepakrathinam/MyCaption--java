import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int choice;
        Scanner s = new Scanner(System.in);
        System.out.print("Available\n1.Hii\n2.Hello\n3.Hey\nYour choice : ");
        choice = s.nextInt();
        switch (choice){
            case 1 :
                System.out.print("Hii");
                break;
            case 2 :
                System.out.print("Hello");
                break;
            case 3 :
                System.out.print("Hey");
                break;
            default :
                System.out.print("Invalid choice");
                break;
        }
    }
}
