package exam;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Programming language >> ");
        String lang=sc.next();

        if(lang.equals("c")){
            System.out.println("easy");
        }else if(lang.equals("c++")){
            System.out.println("very easy");
        }else if(lang.equals("java")){
            System.out.println("fun");
        }else if(lang.equals("python")){
            System.out.println("difficult");
        }else{
            System.out.println("sorry");
        }

    }
}
