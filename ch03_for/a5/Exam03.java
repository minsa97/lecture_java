package a5;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("3개의 정수: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(b>c){
                System.out.println("최소: "+c);
            }
            else{
                System.out.println("최소: "+b);
            }
        }
        else{
            if(a>c){
                System.out.println("최소: "+c);
            }
            else{
                System.out.println("최소: "+a);
            }
        }
    }
}
