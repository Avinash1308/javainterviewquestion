public class Main{
  public static void main(String[]arg){
    
    String one="AvinashAnandakedar";
    int count=0;
    
    char [] arr={'a','e','i','o','u','A','E','I','O','U'};
    
    for (int i=0;i<arr.length;i++){
      
      for(int j=0;j<one.length();j++){
        
        if(one.charAt(j)==(arr[i])){
          
          count++;
        }
        
      } 
      
    }
    System.out.print(" Number of Vowels present in String : " + count);
    
  }
  
}
