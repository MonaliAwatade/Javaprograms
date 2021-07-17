class Student{
    int regno;
    String name;
    static String colzname="IIT";
    public Student(int regno, String name) {
        
        this.regno = regno;
        this.name = name;
        
    }
    void change(String colzname) {
        this.colzname=colzname;
    }
    
    static void display() {
        System.out.println(colzname);
    }
    
    
}
public class College {
    public static void main(String[] args) {
            Student s1=new Student(101,"kk");
            s1.change("MIIT");
            Student s2=new Student(102,"pp");
            Student s3=new Student(103,"ll");
            Student.display();
    }

}
