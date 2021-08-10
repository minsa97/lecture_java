package exam;

import java.util.Scanner;

public class MinExam {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("숫자1: ");
        int a=sc.nextInt();

        System.out.print("숫자2: ");
        int b=sc.nextInt();

        if(a>b){
            System.out.println("최소: "+b);
        }
        else{
            System.out.println("최소: "+a);
        }

        sc.close();
    }
}
