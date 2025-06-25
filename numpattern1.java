import java.util.*;
class numpattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        String str=series(n);
        System.out.println(str);
    }
    public static String series(int n){
        int a=1;
        String str="";
        while(a<=n){
            str=str+Integer.toString(a);
            str=str+',';
            a=((a*2)+1);
        }
        String newstr=str.substring(0,str.length()-1);
        return newstr;
    }
}
