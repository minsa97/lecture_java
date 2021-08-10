package a5;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("키: ");
        int h=sc.nextInt();

        System.out.print("나이: ");
        int a=sc.nextInt();

        if(h>=140 && a>=10){
            System.out.println("탑승 가능");
        }
        else{
            System.out.println("탑승 불가능");
        }
    }
}
