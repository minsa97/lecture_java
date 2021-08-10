package exception;

public class Exp02 {
    public static void main(String[] args) {
        int[] a=new int[5];
        try{
            for(int i=0;i<7;i++){
                a[i]=3;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 범위를 벗어남");
        }
    }
}
