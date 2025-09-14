package pro;
import java.util.Scanner;

class Bank {
    private String accHolder;
    private double balance; 
    
    public Bank(String accHolder , double balance){
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public String getAccHolder(){
        return accHolder;
    }

    public void setAccHolder(String accHolder){
        this.accHolder = accHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("✅ Deposited: " + amount);
        } else {
            System.out.println(" Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("✅ Withdrawal successful.");
            System.out.println("💰 New Balance: " + balance);
        } else if (amount <= 0) {
            System.out.println(" Amount must be positive.");
        } else {
            System.out.println(" Insufficient funds!");
        }
    }
}

public class Encap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("Buddy", 1000000.00);

        System.out.println("💳 Welcome to SuckD! Bank");

        boolean running = true;
        while (running) {
            System.out.println("\n==============================");
            System.out.println(" Choose an operation:");
            System.out.println(" 1. Get Account Information");
            System.out.println(" 2. Withdraw Amount");
            System.out.println(" 3. Deposit Amount");
            System.out.println(" 4. View Balance");
            System.out.println(" 5.  Exit");
            System.out.println("==============================");
            System.out.print(" Enter your choice: ");
            
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println(" Account Holder: " + bank.getAccHolder());
                    System.out.println(" Balance: " + bank.getBalance());
                    break;
                case 2:
                    System.out.print(" Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print(" Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println(" Current Balance: " + bank.getBalance());
                    break; 
                case 5:
                    System.out.println(" Thank you for banking with us! Goodbye!");
                    running = false; 
                    break;
                default:
                    System.out.println(" Invalid choice. Please try again.");
                    break;
            }

            if(running == true){
                try{
                    System.out.println();
                    System.out.println("wait till 5 second to return to main program");
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    System.out.println("something went wrong :");
                }
            }
        }
        sc.close();
    }
}
