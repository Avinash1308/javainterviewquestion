class Main{
  public static void main(String[] arg){
    int arr[]={1,2,3,4,5,6,7,8,9};
    int pos=-1;
    int ele=4;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==ele){
        pos=i;
      
      }
    }
    if(pos==-1){
      System.out.print("not found");
    }
    else{
      System.out.print("Element found at :"+pos);
    }
    
  }
}
