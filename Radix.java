import java.lang.Math;
public class Radix {
  public static int nth(int n, int col){
    if (n<0){
      n = n * -1;
    }
    return(((int)(n/Math.pow(10, col)))%10);
  }

  public static int length(int n){}

  public static void merge(MyLinkedList original,MyLinkedList[]buckets){}
}
