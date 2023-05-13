public class Main{
    public static void main(String[] arg){
        int num=100;
        for(int j=1;j<=100;j++){
            System.out.println(armstrong(j)+" ");
        }
        
    }
    public static int armstrong(int num){
        int armstrong=0;
        int len=(""+num).length();
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            temp/=10;
            int pow=1;
            for(int i=1;i<=len;i++){
                pow*=digit;
            }
            armstrong+=pow;
        }
         return armstrong;
    }
}
