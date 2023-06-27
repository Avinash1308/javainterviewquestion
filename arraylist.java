import java.util.ArrayList;
class Main{
  public static void main(String args[]){
    ArrayList<Integer>arrli=new ArrayList<Integer>();
    arrli.add(1);
    arrli.add(5);
    arrli.add(3);
    arrli.add(4);
    arrli.add(2);
    arrli.add(1);
    
    System.out.println(arrli);[1,5,3,4,2,1]
    arrli.remove(4);                 // remove element from specified index position
    System.out.println(arrli);[1,5,3,4,1]

    
  }
}
