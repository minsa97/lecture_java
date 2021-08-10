package exception;

import java.lang.NumberFormatException;

public class Exp04 {
    public static void main(String[] args){
        String[] a={"12","453","3.14"};

        for(int i=0;i<a.length;i++){
            try{
                int x=Integer.parseInt(a[i]); // 문자열을 정수로 형변환
                System.out.println(x);
            }
            catch(NumberFormatException e){
                System.out.println(a[i] + "를 정수로 바꿀수 없습니다.");
            }
        }
    }
}
