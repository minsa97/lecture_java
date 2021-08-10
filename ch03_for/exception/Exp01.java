package exception;
import java.util.Scanner;

public class Exp01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            try{
                System.out.print("분자: ");
                int a=sc.nextInt();

                System.out.print("분모: ");
                int b=sc.nextInt();

                System.out.println("결과(몫): "+(a/b));
                break;
            }
            catch(ArithmeticException e){
                System.out.println("분모는 0이 될 수 없습니다.");
            }
        }
        sc.close();
    }
}