package exam;

class MemberService{
    String id="hong";;
    String pw="12345";

    boolean login(String a, String b){
        if(id.equals(a) && pw.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }
    
    void logout(String a){
        System.out.println(a+" is logouted !");
    }
}

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService ms=new MemberService();
        boolean result=ms.login("hong", "12345");

        if(result){
            System.out.println("login completed!");
            ms.logout("hong");
        }
        else{
            System.out.println("wrorng id or wrong password !");
        }
    }
}
