//increase the salary for the employee with a bonus added

class Employee{
    //data+method-->instance--->using an object
    int empno;
    double salary;
    String name;
    Employee(int empno,double salary,String name){
    //LHS =RHS-->name collision-->this
        //this.empno-->instance variable
        this.empno=empno;
        this.salary=salary;
        this.name=name;
        
    }
    void display() {
        System.out.println(empno+"  "+salary+"   "+name);
    }
    
}
public class EmpMain{

    
    

    public static void main(String[] args) {
        
        
        //int empno,double salary,String name
        Employee e=new Employee(101,20000,"karthik");
        e.display();
        
        
    }
    
}