public class CreateEmployee {
    private String name;
    private int yoj;
    private int salary;
    public void CreateData(String nam,int yo,int salar){
        this.name = nam;
        this.yoj = yo;
        this.salary = salar;
    }
    public void ShowData(){
        System.out.println("Name : " + this.name);
        System.out.println("Year of Joining : " + this.yoj);
        System.out.println("Salary : " + this.salary);
    }
}
