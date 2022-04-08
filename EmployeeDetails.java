import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args){
        //declaring required parameters for an employee
        String[] name = new String[3];
        int[] yoj = new int[3];
        int[] salary = new int[3];

        //Scanner to get input from the user
        Scanner sc = new Scanner(System.in);

        //calculating the length to know the no.of.objects to be created
        int length,i;
        length = name.length;

        //getting the input
        for (i = 0;i < length;i++){
            System.out.print("Enter Employee's name : ");
            name[i] = sc.nextLine();
            System.out.print("Enter Year of Joining : ");
            yoj[i] = sc.nextInt();
            System.out.print("Enter Emplyee's Salary : ");
            salary[i] = sc.nextInt();
        }

        //creating some blank lines
        System.out.println();
        System.out.println();

        //creating object
        CreateEmployee obj = new CreateEmployee();

        //printing output
        System.out.print("Employee Details :\n");

        //creating a database
        for (i = 0;i < length;i++){
            obj.CreateData(name[i],yoj[i],salary[i]);
            obj.ShowData();
        }
    }
}
