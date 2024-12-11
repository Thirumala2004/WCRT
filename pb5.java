import java.util.Scanner;
import java.lang.Math.*;

public class pb5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of points that beetle move : ");
        int n=sc.nextInt();
        float f1=0f;
        float f2=0f;
        float pie=3.14f;
        int p[][]=new int[n][3];
        for(int i=0;i<n;i++){
            System.out.print("Enter the coordinates of point p"+(i+1)+" : ");
            for(int j=0;j<3;j++){
                p[i][j]=sc.nextInt();
            }
        }
        for(int k=1;k<n;k++){
            int i=1;
            if((p[k-1][n-1])==(p[k][n-1]) && ((p[k-1][k-1])==(p[k][k-1])||(p[k-1][k])==(p[k][k])) && (p[k-1][n-1]!=0) && (p[k][n-1]==0)){
                float maxdist=Math.max(Math.abs(p[k-1][i-1]-p[k][i-1]),Math.abs(p[k-1][i]-p[k][i]));
                maxdist=Math.max(maxdist,Math.abs(p[k-1][i+1]-p[k][i+1]));
                f1=f1+(maxdist/3)*pie;
            }
            else{
                f2=f2+(float)(Math.sqrt((Math.pow((p[k-1][i-1]-p[k][i-1]), 2))+(Math.pow((p[k-1][i]-p[k][i]), 2)))+Math.abs(p[k-1][i+1]-p[k][i+1]));     

            }
        }
        System.out.print(f1+f2);
    }
}
