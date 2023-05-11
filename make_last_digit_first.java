import java.util.*;
public class Main{
  public static void main(String[] arg){
    int x=0;
    int n=153;
    int last=n%10;
    int temp=n;
    String num="";
    while(temp>0){
      int digit=temp%10;
      if(digit!=last){
        num=Integer.toString(digit)+num;
      }
      temp/=10;
      
      
     
    }
    x=last*100+Integer.parseInt(num);
    System.out.print(x);
  }
}

// output --> 315
