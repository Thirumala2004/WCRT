import java.lang.*;
import java.util.*;
public class pb2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        System.out.println("Entr Array Elements : ");
        int arr[];
        arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        int count=0;
        int temp=0;
        int res=0;
        for(int i=0;i<n;i++){
            temp=arr[i];
            
            for(int j=i+1;j<n;j++){
                temp=(temp>arr[j]?temp:arr[j]);
            }
            if(arr[i]==temp){
                count=count+1;
                System.out.println(arr[i]+" is a Superior Element.");
            }
        }
        System.out.println("Number of Superior Elements is : "+count+".");
    }
}
