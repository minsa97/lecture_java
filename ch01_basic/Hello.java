public class Hello{
    public static int sum(int i, int j){
        return i+j;
    }
    public static void main(String[] args) {
        int i,j;
        char a;
        String b;
        final int TEN=10;

        i=1;
        j=sum(i,TEN);
        a='?';
        b="Hello";

        java.lang.System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("TEN= "+TEN);
        System.out.println("i= "+i);
        System.out.println("j= "+j);
    }
}