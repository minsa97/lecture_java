import java.io.IOException;

public class System_in_1{
    public static void main(String[] args) throws IOException{
        System.out.print("a: ");
        int a=System.in.read();

        System.out.print("b: ");
        int b=System.in.read();

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}