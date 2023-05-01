public class Main{
  public static void main(String[] arg){
    String one="          Hello we are        trying to     count     words in given string       ";
    String two=one.replaceAll("\\s+", " "); // remove unneccessary spaces within words
    String three=two.trim();                       // remove  leading and trilling spaces
    int count=1;
    for(int i=0; i<three.length();i++){
      if(three.charAt(i) == ' '){
        count++;
      }
    }
    System.out.println(count);
  }
}
