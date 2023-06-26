import java.util.Map;
import java.util.HashMap;
class Main{
  public static void main(String[] args){
    Map <Integer,String>map=new HashMap<Integer,String>(); // create generic hashmap
    map.put(1,"avinash");                                  // add key value pair to hashmap
    map.put(2,"sumit");
    map.put(3,"vansh");
    map.remove(2);                                        // remove value of specified key
    map.clear();                                          // clear the whole map's data
    map.put(4,"yogesh");
    // iterator itr=map.iterator();
    for(Map.Entry m: map.entrySet()){                       // use Entry sub interface of map to iterator through
      System.out.println(m.getKey()+" "+m.getValue());         // print data ie (key value pairs)
    }
      
    
  }
}
