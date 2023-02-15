//package Encapsulation;

class Bank
{
    private long accno;
    private String name,email;
    private float amount;
 public String getName()
 {
    return name;
 }
 public void setName(String name){
    this.name=name;
 }
 public String getEmail()
 {
    return email;
 }
 public void setEmail(String email){
    this.email=email;
 }
 public float getAmount()
 {
    return amount;
 }
 public void setAmount(float amount){
    this.amount=amount;
 }
 public long getAccNo()
 {
    return accno;
 }
 public void setAccNo(long accno){
    this.accno=accno;
 }
 
 
} 


public class Encapsulted {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.setAccNo(1234);
        b1.setName("Navnath");
        b1.setEmail("nagutte0@gmail.com");
        b1.setAmount(1000);

        System.out.println("Account No :"+b1.getAccNo());
        System.out.println("Name : "+b1.getName());
        System.out.println("Email id: "+b1.getEmail());
        System.out.println("Account balence : "+b1.getAmount());
    }
}
