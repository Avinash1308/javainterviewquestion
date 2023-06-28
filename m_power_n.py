public class Main{
    public static void main(String[] arg){
        int num=2;
        int pow=5;
        int result=1;
        for(int i=1;i<=pow;i++){
            result=result*num;
        }
        System.out.print(result);
    }
}




# another approach
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your number here : ");
    int num=sc.nextInt();
    System.out.print("Enter power here : ");
    int pow=sc.nextInt();
    int result=1;
    for(int i=1;i<=pow;i++){
      result*=num;
    }
    System.out.println(result);
  }
}
