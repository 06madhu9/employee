package q_three;

public class Employee1 {
     String name;
     int id;
     double salary;
     public Employee1(String name,int id,double salary){
             this.name=name;
             this.id=id;
             this.salary=salary;
     }
     public void displayInfo(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary:  "+salary);
     }
     public static void main(String[] args){
        Employee1 emp1 = new Employee1("XYZ",101,50000.0);
        emp1.displayInfo();
     }
}
