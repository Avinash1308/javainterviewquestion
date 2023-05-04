// in java 
import java.util.*;
import java.lang.Math;
public class Main{                                        // it is the main function 
  public static void main(String[] arg){
    int num=34;
    int cls_prime=closest_prime(num);
    System.out.print(cls_prime);
    
  }
    
    
                                                                              
  public static boolean is_prime(int num){                // this function check whether the give number is prime of not 
    boolean prime=true;
    for(int j=2;j<(Math.sqrt(num))+1;j++){
      if(num % j==0){
        prime=false;
        
      }
      
    }
    return prime;
  }
    
    
    
    
  public static int closest_prime(int num){                         // function find the closest prime number
    
      
    if(is_prime(num)){                                     // here is_prime function is called, it is true then it return number means the given number is prime itself.
      return num;
    }
    int lower=num-1;               
    while(is_prime(lower)==false){                         // this loop will find lower primary number 
      lower-=1;
    }
    int higher=num+1;
    while(is_prime(higher)==false){                       // this loop search for the higher primary number 
      higher+=1;
    }
    if(num-lower<=higher-num){                           // this statement find the closest  prime number
      return lower;
    }else{
      return higher;
    }
    
  }
}





























// in python 

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def nearest_prime(num):
    if is_prime(num):
        return num

    lower_num = num - 1
    while not is_prime(lower_num):
        lower_num -= 1

    higher_num = num + 1
    while not is_prime(higher_num):
        higher_num += 1

    if num - lower_num <= higher_num - num:
        return lower_num
    else:
        return higher_num


print(nearest_prime(4))
            

            
            
            
            
            
            





