import java.util.*;
class Main{
  public static void main(String arg[]){
    TreeSet <Integer> ts= new TreeSet<>();
    ts.add(1);
    ts.add(6);
    ts.add(3);             // add elements
    ts.add(2);
    ts.add(1);                                       // duplicate not allowed

    
    System.out.println(ts); // output [1,2,3,6]    ascending order
    
    
    ts.remove(3);
    System.out.println(ts);// output [1,2,6]  

    
    System.out.println(ts.first());// output 1 print 1st elements
    
    System.out.println(ts.last());// output 6 print last elements


    System.out.println(ts.contains(6)); // output true  check whether the specified value present or not

    ts.clear();
    System.out.println(ts);// output []  clear all the elements and it empty
    
  }
}
