abstract class Bank{
     abstract void ATM();
     abstract void KYC();

}

class SBI extends Bank{
    void ATM(){
        System.out.println("atm-----50000");}
     void KYC(){
            System.out.println("kyc-------");

    }

}
class Axis extends Bank{
    void ATM(){
        System.out.println("atm-----50000");}
     void KYC(){
            System.out.println("kyc-------");}


}
public class abstr2{
 public static void main(String[] args) {
    SBI s=new SBI();
    s.ATM();
    s.KYC();

    Axis a=new Axis();
    a.ATM();
    a.KYC();

 }
    
 }
