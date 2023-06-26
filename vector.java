import java.util.*;
class Main{
  public static void main(String arg[]){
    Vector<Integer> vc=new Vector<>();
    vc.add(1);
    vc.add(5);
    vc.add(2);
    vc.add(4);
    vc.add(3);
    vc.add(1);        // allow duplicate
    System.out.println(vc); //output [1,5,2,4,3,1] follows insertion order
    vc.remove(0);                   // remeove element from specified index
    System.out.println(vc);
    System.out.println(vc.size()); // output 5
    System.out.println(vc.capacity()); // 10 default capacity of vector is 10
    vc.set(0,100);                 // set specified element at specified index
    System.out.println(vc);//[100,2,4,3,1]
    vc.toArray();
    System.out.println(vc);  //[100,2,4,3,1]
    vc.toString();
    System.out.println(vc);
    vc.trimToSize();
    System.out.println(vc);
      
    
    
    
  }
}
