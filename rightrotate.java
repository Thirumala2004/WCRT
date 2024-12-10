import java.util.Scanner;

public class rightrotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Siz of array : ");
        int n=sc.nextInt();
        int N[]=new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            N[i]=sc.nextInt();
        }
        System.out.print("Array elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(N[i]+" ");
        }
        System.out.print("\nEnter numbre of times to rotate : ");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int temp=N[n-1];
            for(int j=n-1;j>0;j--){
                N[j]=N[j-1];
            }
            N[0]=temp;
        }
        System.out.print("Array elements after swap are : ");
        for(int i=0;i<n;i++){
            System.out.print(N[i]+" ");
        }
    }
}
