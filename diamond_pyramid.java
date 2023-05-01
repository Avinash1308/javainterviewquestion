public class Main{
  public static void main(String[] arg){
    int n=5;
    int spaces=n-1;
    int star=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=spaces;j++){
        System.out.print(' ');
      }
      for(int j=1;j<=star;j++){
        System.out.print('*');
      }
      System.out.println();
      spaces--;
      star+=2;
    }
    spaces=1;
    star=n*2-3;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=spaces;j++){
        System.out.print(' ');
      }
      for(int j=1;j<=star;j++){
        System.out.print('*');
      }
      System.out.println();
      spaces++;
      star-=2;
    }
  }
}
