public class Main{
  public static void main(String[]arg){
    String one="we are reversing words in string";
    String[] words_arr=one.split(" ");
    for(int i=0;i<words_arr.length;i++){
      String word=words_arr[i];
      for(int j=word.length()-1;j>=0;j--){
        System.out.print(word.charAt(j));
      }
      System.out.print(" ");
    }
  }
}
