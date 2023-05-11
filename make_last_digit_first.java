import java.util.*;
public class Main{
  public static void main(String[] arg){
    int x=0;
    int n=9;
    int last=n%10;
    int temp=n;
    String num="";
    if(last==n){
      System.out.print("You have enter one digit number "+last);
    }
      
    else{
      
      while(temp>0){
        int digit=temp%10;
        if(digit!=last){
          num=Integer.toString(digit)+num;
        }
        temp/=10;
      
      
     
      }
    
    
      int power=Integer.toString(n).length()-1;
      x=last*(int) Math.pow(10,power)+Integer.parseInt(num);
      System.out.print(x);
    }
  }
}

// output --> 315
