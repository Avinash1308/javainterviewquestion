class Main{
  public static void main(String args[]){
    int arr[]={1,4,6,4,8,23,35,74,45};
    int max=0;
    int sec_max=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        sec_max=max;
        max=arr[i];
      }else if(arr[i]>sec_max && arr[i]<max){
        sec_max=arr[i];
      }
    }System.out.print(sec_max);
    
  }
}
