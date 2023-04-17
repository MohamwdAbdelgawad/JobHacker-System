
package week2;

public class divisableByThree {
     public static void main(String[] args) {
     divisableByThree(1, 100);
 }
 public static void divisableByThree(int lowNumber, int highNumber){
 for(int i=lowNumber; i<=highNumber; i++)
 {
     if(i%3==0) System.out.println(i);
 }
 }
}
