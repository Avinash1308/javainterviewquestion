class Main{
  public static void main(String[] arg){
    int num=13082001;
    int rev=0;
    while(num>0){
      int digit=num%10;
      rev=(rev*10)+digit;
      num=num/10;
    }
    System.out.print(rev);
  }
}
