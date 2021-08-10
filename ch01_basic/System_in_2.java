import java.io.IOException;

public class System_in_2{
    public static void main(String[] args) throws IOException{
        byte[] arr=new byte[10];

        System.out.print("a: ");
        System.in.read(arr);
        String str1=new String(arr);
        str1=str1.trim();
        int a=Integer.parseInt(str1);

        System.out.print("b: ");
        System.in.read(arr);
        String str2=new String(arr);
        str2=str2.trim();
        int b=Integer.parseInt(str2);

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}