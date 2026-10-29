import java.util.Scanner;
class Account{
    String accName;
    long accNumber;
    int balance=5000;
    static int count;

    void inputInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name :");
        accName=sc.nextLine();

        System.out.println("Enter the acc Nmber:");
        accNumber=sc.nextLong();

        System.out.println("Balance: "+balance );
        count++;
    }

    void displayInfo(){
        System.out.println("Account name :" + accName);
        System.out.println("Account number :" + accNumber);
        System.out.println("Balance :"+balance);
    }

    void deposit (int amount){
        balance +=amount;
        System.out.println("Ammount deposited!!");
        System.out.println("Current balance is :" +balance);    
    }

    void withdraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient balance in account !!");
        }
        else{
            balance-=amount;
            System.out.println("Amount withdraw successfully ");
            System.out.println("Balance :" +balance);  
        }
    }
    static int search(Long targetAcc, Account a[]) {
        for (int i = 0; i < count; i++) {
            if (targetAcc == a[i].accNumber) {
                return i;
            }
        }
        return -1;
    }
}

