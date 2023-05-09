package Zoo;
//values as place holder
public class Managers {
    public String managerName= "Siglo Alcantara";
    int managerAge= 24;

    String managerTitle= "Manager";

    void managerGetEmployeeSalary(){
        Employees employee =new Employees();
        System.out.println(employee.getEmployeeSalary());

    }

    public static void main(String[] args) {
        Managers managers = new Managers();
        managers.managerGetEmployeeSalary();

    }
}

