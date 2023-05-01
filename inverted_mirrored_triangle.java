public class Main{
  public static void main(String[] arg){
    int n=5;
    for(int i=n;i>0;i--){
      for(int j=1;j<=n-i;j++){
        System.out.print(' ');
        
      }
      for(int j=1;j<=i;j++){
        System.out.print('*');
      }
      System.out.println();
    }
  }
}





// another method

public class Main{
  public static void main(String[] arg){
    for(int i=5;i>=1;i--){
      for(int j=1;j<=5;j++){
        if((i+j)<=5){
          System.out.print(' ');
        }else{
          System.out.print('*');
        }
      }
      System.out.println();
    }
  }
}
