import java.util.Scanner;

public class Employee {
    int empId;
    String empName;
    String designation;
    double salary;
    int performanceRating;

    // parameterized constructor
    Employee(int id,String name,int rating){
        this.empId = id;
        this.empName = name;
        this.performanceRating = rating;

    }
    // getters
    public int getEmpId(){
        return this.empId;
    }
    public String getEmpName(){
        return this.empName;
    }
    public String getDesignation(){
        return this.designation;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getPerformanceRating(){
        return this.performanceRating;
    }
    // setters
    public void setDesignation(String design){
        this.designation = design;
    }
    public void setSalary(double sal){
        this.salary = sal;
    }
    public void display(){
        System.out.println("Before Promotion: ");
        System.out.println("Employee ID: "+this.empId);
        System.out.println("Name: "+this.empName);
        System.out.println("Designation: "+this.designation);
        System.out.println("Salary: $"+this.salary);
        System.out.println("Performance Rating: "+this.performanceRating);
    }
    public void promoteEmployee(String design){

        if(this.performanceRating >= 4){
            System.out.println();
            System.out.println("After Promotion");
            this.designation = design;
            System.out.println("New Designation: "+this.designation);
            this.salary *= 1.2;
            System.out.println("Developer Updated Salary: $"+this.salary);

        }else{
            System.out.println("No promotion");
        }
    }
}
