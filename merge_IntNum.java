import java.util.Arrays;
public class Main{
  public static void main(String[] arg){
    int n1=5;
    int n2=2;
    String n3=Integer.toString(n1);
    String n4=Integer.toString(n2);
    System.out.print(n3+n4);
  }
}


// output --> 52


// another way
import java.util.Arrays;
public class Main{
  public static void main(String[] arg){
    int n1=5;
    int n2=2;
    int merge_num=Integer.parseInt(String.valueOf(n1)+String.valueOf(n2));
    System.out.print(merge_num);
  }
}

// output --> 52
