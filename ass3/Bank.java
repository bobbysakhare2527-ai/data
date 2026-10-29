import java.util.Scanner;
public class Bank{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of accounts :");
        n=sc.nextInt();

        Account a[]=new Account[n];

        int choice;
        do { 
            System.out.println("PCCOE COOPERATIVE BANK");
            System.out.println("1.Add account");
            System.out.println("2.Deposit Money");
            System.out.println("3.Remove Account");
            System.out.println("4.Withdraw Money");
            System.out.println("5.Display All account");
            System.out.println("6.exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    for(int i=0; i<n; i++){
                        a[i]=new Account();
                        System.out.println("Enter the details of account "+(i+1));
                        a[i].inputInfo();
                    }
                    break;
                
                case 2:
                    System.out.println("Enter the acc number :");
                    long daccNumber=sc.nextLong();
                    int d=Account.search(daccNumber,a);
                    if(d==-1){
                        System.out.println("Account not found");
                    }
                    else{
                        System.out.println("Enter amount to be deposited");
                        int amt = sc.nextInt();
                        a[d].deposit(amt);
                    }
                    break;

                    case 3:
                        System.out.println("Enter the acc number:");
                        long raccNumber=sc.nextLong();
                        int r=Account.search(raccNumber,a);
                        if(r==-1){
                            System.out.println("Account not found");
                        }
                        else{
                            for(int i=r; i<Account.count-1; i++){
                                a[i]=a[i+1];
                            }
                            a[Account.count-1]=null;
                            Account.count--;
                            System.out.println("Account removed successfully!!");       
                        }
                        break;

                    case 4:
                        System.out.println("Enter the account name: ");
                        long waccNumber = sc.nextLong();
                        int w=Account.search(waccNumber , a);
                        if(w==-1){
                            System.out.println("Account not found !");
                        }        
                        else{
                            System.out.println("Enter the amount:");
                            int amt = sc.nextInt();
                            a[w].withdraw(amt);
                        }
                        break;

                    case 5:
                        System.out.println("Account details: ");
                        for(int i=0; i<n; i++){
                            System.out.println("Account "+(i+1));
                            a[i].displayInfo();
                        }    
                        break;

                    case 6:
                        System.out.println("Exiting program.");
                        break;

                    default:
                        System.out.println("Invalid Choice");        
            }
        } while (choice!=6);
    }
}