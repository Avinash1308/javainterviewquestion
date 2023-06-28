class Main{
  public static void main(String[] args){
    String city="BangalBore";
    String low=city.toLowerCase();
    int count=0;
    for(int i=0;i<city.length();i++){
      if(low.charAt(i)=='b'){
        count++;
      }
    }
    System.out.println(count);
  }
}



