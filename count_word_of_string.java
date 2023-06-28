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




//another  approach
class Main{
  public static void main(String[] args){
   String name="       Avinash        Ananda      Kedar     ";
    String name1=name.replaceAll("\\s+"," ");
    String name2=name1.trim();
   String [] words=name2.split(" ");
    System.out.println(words.length);
  }
}
