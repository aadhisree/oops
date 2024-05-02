import java.util.*;
public class Linkedlist {
 public static void main(String[] args){

  System.out.println("\tAditya Suresh\n\t23mca004\n\t15/04/2024");

 LinkedList<String> L=new LinkedList<>();
 L.add("Gold");
 L.add("Silver");
 L.add("Bronze");
 L.add(0,"Olympics Medals");
 System.out.println(L);
 L.remove("Bronze");
 System.out.println(L);
 L.remove(2);
 System.out.println(L);
 L.removeLast();
 System.out.println(L);
 L.removeFirst();
 System.out.println(L);
 }
}
