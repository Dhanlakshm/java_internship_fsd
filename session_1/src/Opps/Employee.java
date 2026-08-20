package Opps;

public class Employee {
     private double salary;
     private String emp_Adress;
     private long phone;

    public String getEmp_Adress() {
        return emp_Adress;
    }

    public void setEmp_Adress(String emp_Adress) {
        this.emp_Adress = emp_Adress;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    //setter and getter methods
    //setter methods -- is used to assign value to the private data memeber
    public void setSalary(double sal)
    {
        salary=sal;
    }
    //getter methods-- is used to display/print/retrive the private data memeber
    public double getSalary()
    {
        return salary;
    }
}
