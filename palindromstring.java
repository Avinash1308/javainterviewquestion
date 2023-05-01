public class Main{
  public static void main(String[] arg){
    String s="nitin";
    String s1="";
    for(int i=s.length()-1;i>=0;i--){
      s1=s1+s.charAt(i);
    }
    if(s.equals(s1)){
      System.out.print("It is palindrom string");
    }else{
      System.out.print("It is not palindrom string");
    }
  }
}
