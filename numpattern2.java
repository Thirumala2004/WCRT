import java.util.*;
class numpattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a start number : ");
        int m=sc.nextInt();
        System.out.print("Enter a end number : ");
        int n=sc.nextInt();
        String str=series(m,n);
        System.out.println(str);
    }
    public static String series(int m,int n){
        String str="";
        for(int i=1;m>n;i++){
            str=str+Integer.toString(m);
            str=str+",";
            m=m-i;
            
        }
        
        String newstr=str.substring(0,str.length()-1);
        return newstr;
    }
}
