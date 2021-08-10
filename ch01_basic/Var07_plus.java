public class Var07_plus {
    public static void main(String[] args) {
        int a=1;
        int b=3;
        double c=4;
        a+=b+c;
        b+=b++ + c++;

        int d=a*(a+b/2); // a=8,b=10 --> 8*(8+5)=8*13=104
        
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("d= "+d);
    }    
}
