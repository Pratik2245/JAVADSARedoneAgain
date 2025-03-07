package Polymorphism;

class Bank{
    double getInterestRate(){
        return 5.0;
    }
}
class HDFC extends  Bank{
    double getInterestRate(){
        return  super.getInterestRate()+1.5;
    }
}
class SBI extends Bank
{
    double getInterestRate(){
        return  super.getInterestRate()+2.5;
    }
}
public class BankTest {
    public static void main(String[] args) {
        Bank hdfc=new HDFC();
        System.out.println(hdfc.getInterestRate());
        Bank sbi=new SBI();
        System.out.println(sbi.getInterestRate());

    }
}
