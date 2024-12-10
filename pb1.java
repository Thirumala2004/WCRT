import java.util.*;
class pb1{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sn.nextInt();
        int count=0;
        for(int i=1;i<num+1;i++){
            if((i%1==0)&&(i%2==0)&&(i%4==0)&&(i%8==0)&&(i%10!=0)){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}