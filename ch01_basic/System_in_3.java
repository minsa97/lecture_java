import java.io.IOException;

public class System_in_3{
    public static void main(String[] args) throws IOException{
        byte[] arr=new byte[10];

        System.out.print("a: ");
        String str1="";
        int key;
        while((key=System.in.read())!=13){
            str1+=Character.toString((char)key);
        }
        System.in.read();
        System.out.println("a= "+str1);
        int a=Integer.parseInt(str1);

        System.out.print("b: ");
        String str2="";
        while((key=System.in.read())!=13){
            str2+=Character.toString((char)key);
        }
        System.in.read();
        //System.out.println("b= "+str2);
        int b=Integer.parseInt(str2);

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}