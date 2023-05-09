package Zoo;
//values as place holder
public class Employees {

    public String employeeName= " Mark Awili";
    private int employeeSalary=42000;


    public int getEmployeeSalary(){
        return employeeSalary;
    }
    public String assignedAnimal(){
        Animals animals= new Animals();
        return animals.animalsName;
    }

    public static void main(String[] args) {
        Employees employees = new Employees();
        String assignment = employees.assignedAnimal();
        System.out.println(employees.employeeName + " is assigned to " + assignment);

    }

}
