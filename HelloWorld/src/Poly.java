class Poly1{
    void display() {
        System.out.println("no arg");
    }
    void display(int a) {
        System.out.println(" one arg");
    }
    void display(int  a,float b) {
        System.out.println("two arg of int");
    }
    void display(float a,float b) {
        System.out.println("two arg with float");
    }
    
}
public class Poly{
    public static void main(String[] args) {
        Poly1 p=new Poly1();
        p.display(2.0f,3);
    }
}