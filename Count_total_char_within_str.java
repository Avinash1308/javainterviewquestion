class Main{
  public static void main(String[] args){
   String name="       Avinash        Ananda      Kedar     ";
    String name1=name.replaceAll("\\s+"," ");
    String name2=name1.trim();
   String [] words=name2.split(" ");
    int count=0;
    for(int i=0;i<words.length;i++){
      String word=words[i];
      for(int j=0;j<word.length();j++){
        count++;
      }
    }
    System.out.println(count);
  }
}
