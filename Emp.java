package Employ;
public class Emp {
    String name;
    int id;
    double salary;
    String city;
    public Emp(String name,int id, double salary,String city){
       this.name = name;
       this.id =id;
       this.salary = salary;
       this.city=city;
    }
    public void displayInfo(){
       System.out.println("Employee ID: " + id);
       System.out.println("Employee Name: " + name);
       System.out.println("Salary: $ " + salary);
       System.out.println("City : "+ city);
    }
    public static void main(String[] args) {
        Emp emp1 = new Emp("XYZ",101,50000.0,"Hubli");
        emp1.displayInfo();
    }
}