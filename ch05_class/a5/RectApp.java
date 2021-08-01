package a5;

import java.util.Scanner;

class Rectangle{
    int width, height;
    public int getArea(){
        return width*height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle rect=new Rectangle();
        System.out.print("직사각형 가로, 세로 >> ");

        rect.width=sc.nextInt();
        rect.height=sc.nextInt();

        System.out.println("직사각형의 면적: "+ rect.getArea());

        sc.close();
    }    
}
