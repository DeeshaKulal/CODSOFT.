import java.util.Scanner;
class BankAccount{
    private double balance;

public BankAccount(double initialBalance){
    balance=initialBalance;
}
public void withdraw( double amount){
    if(amount<=0){
        System.out.println("Invalid withdrawl amount");
    }
    else if(amount > balance ){
        System.out.println("Insufficient Balance");
    }
    else{
        balance-=amount;
        System.out.println("Please collect your cash.");
    }

}

public void deposit(double amount){
    if(amount > 0){
        balance+=amount;
        System.out.println("Amount deposited successfully!......");
    }
    else{
        System.out.println("Invalid deposit amount");
    }
}

public double getBalance(){
    return balance;
}
}

public class ATMInterface{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount account=new BankAccount(1000);
        int choice;
        do{
            System.out.println("\n-----------------------ATM MENU-------------------------");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit ");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            

            switch(choice){
                case 1:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount=sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount=sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("Current Balance:"+ account.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.Try Again");    
            }
        }while(choice!=4);

        sc.close();
    }
}