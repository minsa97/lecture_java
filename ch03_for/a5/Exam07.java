package a5;

import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("좌표(x,y)>> ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        if(x>0 && y>0){
            System.out.print("1사분면");
        }
        else if(x<0 && y>0){
            System.out.print("2사분면");
        }
        else if(x<0 && y<0){
            System.out.print("3사분면");
        }
        else if(x>0 && y<0){
            System.out.print("4사분면");
        }
        else{
            System.out.println("잘못침");
        }
    }
}