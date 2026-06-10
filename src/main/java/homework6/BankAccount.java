/**@author <Ketevan Khatiashvili>*/
package homework6;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("არასაკმარისი თანხა");
        }else{
            balance-=amount;
        }
    }

 public static void main(String[] args) {
        BankAccount acc=new BankAccount("Keti",200);
        acc.deposit(80);
        acc.withdraw(200);
        System.out.println(acc.getBalance());

 }
}
