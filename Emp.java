package Employ;
public class Emp {
    String name;
    int id;
    double salary;
    public Emp(String name,int id, double salary){
       this.name = name;
       this.id =id;
       this.salary = salary;
    }
    public void displayInfo(){
       System.out.println("Employee ID: " + id);
       System.out.println("Employee Name: " + name);
       System.out.println("Salary: $ " + salary);
    }
    public static void main(String[] args) {
        Emp emp1 = new Emp("XYZ",101,50000.0);
        emp1.displayInfo();
    }
}