import java.util.Scanner;
public class switchcase {
    public static void main(String[]args){
        Scanner scc=new Scanner(System.in);
        int age=scc.nextInt();
        switch(age){
            case 18:
                System.out.println("your are become a adult");
                break;
            case 23:
                System.out.println("your are going to jion job");
                break;
            case 60:
                System.out.println("your are going to retried");
                break;
            default:
            System.out.println("enjoy your life");
            
        }
    }
    
}
