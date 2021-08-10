package a5;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수: ");
        int a = sc.nextInt();

        System.out.print("정수: ");
        int b = sc.nextInt();

        if(a%b==0){
            System.out.println(b+"는 "+a+"의 약수입니다.");
        }
        else{
            System.out.println(b+"는 "+a+"의 약수가 아닙니다.");
        }
    }
    
}
