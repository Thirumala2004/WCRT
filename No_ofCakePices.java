import java.util.*;
class No_ofCakePices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Cuts : ");
        int n=sc.nextInt();
        int pices=(n*(n+1)/2)+1;
        System.out.println("Number of Pices : "+(pices));
    }
}
