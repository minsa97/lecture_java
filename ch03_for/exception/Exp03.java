package exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exp03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int sum=0;
        for(int i=0;i<3;i++){
            try{
                System.out.print("정수: ");
                int x=sc.nextInt();
                sum=sum+x;
            }
            catch(InputMismatchException e){
                System.out.println(" *** 정수가 아닌 값이 입력되었음. ***");
                i--;
                sc.next(); // 버퍼에 있는 내용 지운다.
            }
        }
        System.out.println("합: "+sum);
    }
}
