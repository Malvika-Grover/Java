package grover.malvika.java.Basics;

public class ClassesAndObject {

    String name;
    int age;
    String designation;
    double salary;

    // Constructor of class ClassesAndObjects
    public ClassesAndObject(String name){
        this.name = name;
    }

    //Assigning age of employee to variable age
    public void EmployeeAge(int EmpAge){
       age = EmpAge;
    }

    //Assigning salary of the employee to variable salary
    public void EmployeeSalary(double EmpSal){
        salary = EmpSal;
    }

    //Assigning designation of employee to variable designation
    public void EmployeeDesignation(String EmpDes){
        designation = EmpDes;
    }

    //Printing the whole data
    public void PrintEmployee(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Designation:"+designation);
        System.out.println("Salary:"+salary);
    }

    public static void main(String[] args) {

        //Creating 2 objects
        ClassesAndObject obj1 = new ClassesAndObject("Malvika Grover");
        ClassesAndObject obj2 = new ClassesAndObject("Shubham Grover");

        //Calling objects with respective data - Invoking methods for each object created
        obj1.EmployeeAge(22);
        obj1.EmployeeDesignation("SDET");
        obj1.EmployeeSalary(500000);
        obj1.PrintEmployee();

        obj2.EmployeeAge(25);
        obj2.EmployeeDesignation("QA");
        obj2.EmployeeSalary(600000);
        obj2.PrintEmployee();
    }

}
