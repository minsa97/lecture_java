package q1;

import java.util.Scanner;

public class Func05 {
    public static void main(String[] args) {
        // 숫자 4개(1~10)를 입력받으시오.
        // 평균을 리턴하는 함수를 작성하시오.
        // 평균이 5 이상이면 , 합격을 출력
        // 아니면 불합격을 출력하시오.

        Scanner sc=new Scanner(System.in);
        System.out.print("정수 4개 입력(1~10): ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        double avg=getAverage(a,b,c,d);
        if(avg>=5){
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }
    }

    public static double getAverage(int a,int b,int c,int d){
        return (double)(a+b+c+d)/4.;
    }
}
