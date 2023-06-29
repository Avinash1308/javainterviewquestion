import java.util.Arrays;
class Main{
  public static void main(String args[]){
    String str1="listen";
    String str2="silent";
    boolean anagram=is_anagram(str1,str2);
    if(anagram){
      System.out.print("strings are anagrams");
    }else{
      System.out.print("Strings are not anagram");
    }
    
    
  }
  public static boolean is_anagram(String str1,String str2){
    str1=str1.toLowerCase().replaceAll("[^a-z0-9]","");
    str2=str2.toLowerCase().replaceAll("[^a-z0-9]","");
    if(str1.length()!=str2.length()){
      return false;
    }
    char [] charArray1=str1.toCharArray();
    char [] charArray2=str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    return Arrays.equals(charArray1,charArray2);
  }
}
