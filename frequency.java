import java.util.*;
import java.io.*;
class frequency{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String newstr="";
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            if(temp==' '){
                continue;
            }
            if(newstr.indexOf(temp)==-1){
                int count=1;
                for(int j=i+1;j<str.length();j++){
                    if(temp==str.charAt(j)){
                        count++;
                    }
                }
                System.out.println(temp+" appears "+count+" times");
                newstr=newstr+temp;
            }
        }
    }
}
