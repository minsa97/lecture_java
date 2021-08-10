package q1;

public class Func03 {
    public static void main(String[] args) {
        add(1,2,3);
        add(5,6,7);
        add(15,25,35);
        add(1,2,3,4,5);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add(int a, int b, int c, int d, int e){
        System.out.println(a+b+c+d+e);
    }
}
