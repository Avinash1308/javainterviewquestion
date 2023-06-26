import java.util.*;
class Main{
  public static void main(String args[]){
    HashSet<Integer> hs=new HashSet<Integer>();
    hs.add(6);
    hs.add(2);
    hs.add(3);
    hs.add(1);
    hs.add(4);
    hs.add(4); // not allow duplicat is is unorder
    hs.add(5);
    System.out.println(hs);
    
}
