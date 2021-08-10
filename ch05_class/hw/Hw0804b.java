package hw;

public class Hw0804b {
    public static void main(String[] args) {        
        System.out.println(getDistance(1,1,2,2));

    }
    public static double getDistance(int x1, int y1, int x2, int y2){
        int dx=x2-x1, dy=y2-y1;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
