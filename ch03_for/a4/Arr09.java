package a4;

public class Arr09 {
    public static void main(String[] args) {
        int[][] a={
            {91,83,34},
            {77,85,79},
            {94,93,91}
        };

        double[] avg=new double[a.length];

        for(int i=0;i<a.length;i++){
            double sum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
            avg[i]=(double)sum/a[i].length;
            System.out.println((i+1)+"번째 학생의 평균: "+avg[i]);
        }
    }
}
