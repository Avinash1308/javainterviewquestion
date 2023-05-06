public class Main{
  public static void main(String[]  arg){
    for(char i=65;i<=69;i++){
      for(char j=65;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}





// another approach
public class Main{
  public static void main(String[]  arg){
    for(char i='a';i<='d';i++){
      for(char j='a';j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
