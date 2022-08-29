import java.util.Scanner;
public class prime_method {
    static int logic(int num){
        int count=0;
        if(num>2){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    count+=1;
                }
            }
        }
       return count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int c=logic(n);
        if(c==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("non prime number");
        }
        
    }
    
}
