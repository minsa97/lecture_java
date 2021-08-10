package a5;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자>> ");
        String a=sc.next();

        switch(a){
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
            System.out.println("모음입니다.");
            break;
        default:
            System.out.println("자음입니다.");
            break;
        }
    }
}
