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
