public class Main{
  public static void main(String[] arg){
    int n=4;
    int spaces=n-1;
    int star=1;
    int count=1;
    for (int i=1;i<=n;i++){
      for(int j=1;j<=spaces;j++){
        System.out.print(' ');
        
      }
      for(int j=1;j<=star;j++){
        System.out.print(count+" ");
        count++;
      }
      System.out.println();
      spaces-=1;
      star+=1;
    }
  }
}


// output
//    1 
//   2 3 
//  4 5 6 
// 7 8 9 10 
