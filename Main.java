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
    ArrayList<Employee> employees=new ArrayList<>();
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
    public static void AddEmployee(){
        System.out.println("Please enter the id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the name: ");
        String name=sc.next();
        System.out.println("Please enter the department: ");
        String dept=sc.next();
        System.out.println("Please enter the salary: ");
        int salary=sc.nextInt();
        employees.add(new Employee(id,name,dept,salary));
        System.out.println("Employee details are added succesfully");
    }
    public static void ViewEmployees(){
        if(employees.isEmpty()){
            System.out.println("list is empty");
        }
        else{
            for(Employee emp:employees){
                emp.display();
            }
            System.out,println();
        }
    }
}