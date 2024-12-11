import java.util.*;
import java.io.*;
public class pb7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num=sc.nextInt();
        System.out.print("Enter the action string : ");
        String act=sc.next();
        String numstr=String.valueOf(num);
        int numarr[]=new int[(numstr.length())];
        for(int i=0;i<numstr.length();i++){
            numarr[i]=(numstr.charAt(i)-48);
        }
        System.out.print("Array of Elements before performing "+act+" actions is : ");
        for(int i=0;i<numarr.length;i++){
            System.out.print(numarr[i]+" ");
        }
        int j=0;
        for(int i=0;i<act.length();i++){
            char ch=act.charAt(i);
            if (ch=='R') {
                if(j<9){
                    j=j+1;
                }
            }
            else if (ch=='L') {
                if(j!=0){
                    j=j-1;
                }
            }
            else if (ch=='T') {
                numarr[j]=numarr[j]+1;
            }
            else if(ch=='B'){
                numarr[j]=numarr[j]-1;
            }
            else if((ch=='0')||(ch=='1')||(ch=='2')||(ch=='3')||(ch=='4')||(ch=='5')||(ch=='6')||(ch=='7')||(ch=='8')||(ch=='9')){
                continue;
            }
            else{
                int temp=numarr[j];
                numarr[j]=numarr[(act.charAt(i+1))-48];
                numarr[(act.charAt(i+1))-48]=temp;
            }
        }
        System.out.print("\nArray of Elements after performing "+act+" actions is : ");
        for(int i=0;i<numarr.length;i++){
            System.out.print(numarr[i]+" ");
        }
    }
}
