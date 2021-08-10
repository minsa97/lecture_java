package q1;

import java.util.Scanner;

public class Func06 {
    public static void main(String[] args) {
        // 숫자 4개(1~10)를 입력받으시오.
        // 평균을 리턴하는 함수를 작성하시오.
        // 평균이 5 이상이면 , 합격을 출력
        // 아니면 불합격을 출력하시오.

        Scanner sc=new Scanner(System.in);
        System.out.print("정수 4개 입력(1~10): ");
        int[] a=new int[4];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        double avg=getAverage(a);
        if(avg>=5){
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }
    }

    public static double getAverage(int[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum/arr.length;
    }
}
