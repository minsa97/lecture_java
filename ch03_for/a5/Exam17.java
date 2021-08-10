package a5;
import java.util.Scanner;

public class Exam17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.print("number: ");
            int x=sc.nextInt();
            sum=sum+x;
        }
        System.out.println("Total: "+sum);
    }
    
}
