package exam;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("좌표(x,y) >> ");
        int x=sc.nextInt();
        int y=sc.nextInt();

       if(x>=100 && x<=200 && y>=100 && y<=200){
            System.out.println("좌표는 사각형 내부에 있다.");
       }
       else{
            System.out.println("좌표는 사각형 내부에 없다.");
       }
    }
}
