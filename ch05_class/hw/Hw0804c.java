package hw;

class MyPoint{
    int x, y;

    // 생성자, 타입이 없는 함수형태
    public MyPoint(){}
    public MyPoint(int a, int b){x=a;y=b;}

    public double getDistance(int x2, int y2){
        int dx=x2-x, dy=y2-y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}


public class Hw0804c {
    public static void main(String[] args) {        
        MyPoint p=new MyPoint(1,1);
        double dist=p.getDistance(5,5);
        System.out.println(dist);
    }

}
