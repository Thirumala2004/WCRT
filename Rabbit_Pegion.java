import java.util.*;
class Rabbit_Pegion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Heads : ");
        int head=sc.nextInt();
        System.out.print("Enter No.of Legs : ");
        int legs=sc.nextInt();
        int pleg=2,rleg=4;
        for(int i=1;i<=head;i++){
            if((i*pleg)+((head-i)*rleg)==legs){
                System.out.println("Number of Pegions : "+i);
                System.out.println("Number of Rabbits : "+(head-i));
                break;
            }
        }
    }
}
