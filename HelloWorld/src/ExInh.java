class Bank{
double rateOfIntrest=7.8;
}
class HDFC extends Bank{
    void interstAmount(double amount) {
        double interestamount=(amount*rateOfIntrest)/100;
        System.out.println(interestamount);
        
    }
}


public class ExInh {
    public static void main(String[] args) {
        HDFC hdfc=new HDFC();
        hdfc.interstAmount(100000);
    }

}
