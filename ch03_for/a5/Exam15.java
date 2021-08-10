package a5;

import java.util.Scanner;

public class Exam15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("number: ");
        int n=sc.nextInt();

        for(int i=1;i<=9;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
        
    }
}
