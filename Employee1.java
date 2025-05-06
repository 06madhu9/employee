package q_three;

public class Employee1 {
     String name;
     int id;
     double salary;
     String phone_no;
     public Employee1(String name,int id,double salary,String phone_no){
             this.name=name;
             this.id=id;
             this.salary=salary;
             this.phone_no=phone_no;
     }
     public void displayInfo(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary:  "+salary);
        System.out.println("Phone Number:  "+phone_no);
     }
     public static void main(String[] args){
        Employee1 emp1 = new Employee1("XYZ",101,50000.0,"1234567892");
        emp1.displayInfo();
     }
}
