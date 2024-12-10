import java.util.Scanner;

public class sumnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Siz of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Target Value : ");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
