public class Main{
    public static void main(String[] arg){
        System.out.print(numberToWord(123));
    }
    public static String numberToWord(int num ){
        
        
        
        String[] ones={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        
        
        String[] tens={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        
        
        if(num==0){
            return "zero";
        }
        
        String word="";
        if(num/100>0){
            word+=ones[num/100]+" "+"hundred"+" ";
            num%=100;
        }
        if(num>=20){
            word+=tens[num/10]+" ";
            num%=10;
            
        }
        if(num>0){
            word+=ones[num];
        }
        
        return word.trim();
    
        
    }
}
