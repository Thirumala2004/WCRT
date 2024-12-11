import java.util.Scanner;
public class pb6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String newstr="";
        System.out.print("Enter a Sentence : ");
        String str=sc.nextLine();
        for(int i=(str.length()-1);i>=0;i--){
            if(str.charAt(i)==' '){
                newstr=newstr+str.substring(i,(str.length()));
                str=str.substring(0, i);
            }
        }
        newstr=newstr+" ";
        newstr=newstr+str;
        System.out.println(newstr.substring(1));
    }
}