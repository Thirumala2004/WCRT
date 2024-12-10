import java.util.Scanner;

public class pb4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.print("Enter which factor do you want : ");
        int k=sc.nextInt();
        int count=0;
        for(int i=num;i>0;i--){
            if(num%i==0){
                count++;
            }
            if(count==k){
                System.out.println("The "+k+" largest factor is "+i);
                break;
            }
        }
        if(count!=k){
            System.out.println("There is no prsence of "+k+" factors");
        }
    }
}
