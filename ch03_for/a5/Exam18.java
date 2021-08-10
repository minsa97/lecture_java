package a5;
import java.util.Scanner;

public class Exam18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0, cnt=0;
        while(true){
            System.out.print("number: ");
            int x=sc.nextInt();

            if(x==-1){
                break;
            }

            sum=sum+x;
            cnt++;
        }
        double avg=(double)sum/(double)cnt;
        System.out.println("Average: "+avg);
    }
}
