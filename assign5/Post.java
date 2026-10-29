import java.util.Scanner;
public class Post{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
         MediaPost mediapost = new MediaPost();
        TextPost text = new TextPost();
        ImagePost image = new ImagePost();
       

        do{
            System.out.println("!. posting the text");
            System.out.println("2.Posting the image");
            System.out.println("3.Commenting on text post");
            System.out.println("4. commenting on image post");
            System.out.println("5.Exit");
            System.out.println("Enter the choice");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    text.post();
                    break;
                case 2:
                    image.post();
                    break;
                case 3:
                    text.comment();
                    break;
                case 4:
                    image.comment();
                    break;
                case 5:
                    System.out.println("Exiting the pogram");
                    break;
                default:
                    System.out.println("Invalid choice");
            }    
        }
        while(choice!=5);
        sc.close();
        mediapost.post();
        mediapost.comment();
    }
}