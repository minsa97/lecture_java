package a5;

import java.util.Scanner;

public class Exam08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.print("숫자: ");
            int n=sc.nextInt();
            if(n==4)
                break;
        }
        System.out.println("환영합니다.");
    }
}
