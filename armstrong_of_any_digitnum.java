public class Main{
    public static void main(String[] arg){
        int num=1634;                               
        int len=(""+num).length();                // convert num into string and calculate the length of num    
        int amstrong=0;
        int temp=num;                           // create temparory variable which store the value of num 
        while(temp>0){                         // loop until num becomes 0
            int digit=temp%10;                 // calculate each digit of the num
            temp/=10;                          // derive the num after removing current last digit
            int pow=1;
            for(int i=1;i<=len;i++){           // for loop start from 1 to length of num to calculate digit pow len
                pow=pow*digit;                 // power is calculated i.e digit**pow
            }
            amstrong+=pow;                     // armstrong for the given number is calculated  
        }
        if(num==amstrong){                          // condition check for if num is equal to the calculated armstrong
        System.out.print("it is a amstrong number");}
        else{
            System.out.print("not amstrong");
        }
    }
}
