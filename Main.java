class Employee{
    int id;
    String Name;
    String Department;
    double salary;
    Employee(int id,String Name,String Department,double salary){
        this.id=id;
        this.Name=Name;
        this.Department=Department;
        this.salary=salary;
    }
    public void display(){
        System.out.println("ID: "id +" | Name: "+name+" | Department: "+Department+" | salary: "+salary);
    }
}
public class Main{
    Static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int choice;
        do{
            System.out.println("""===Employee Management System===
            1.Add Employee
            2.View Employees
            3.Update Employee
            4.Delete Employee
            5.Exit""");
            System.out.println("Please Enter your choice from 1-6");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    AddEmployee();
                    break;
                case 2:
                    ViewEmployees();
                    break;
                case 3:
                    UpdateEmployee();
                    break;
                case 4:
                    DeleteEmployee();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
            }
        }while(choice!=5);
    }
}