import java.lang.Math;
public class Radix {
  public static int nth(int n, int col){
    if (n<0){
      n = n * -1;
    }
    return(((int)(n/Math.pow(10, col)))%10);
  }

  public static int length(int n){
    if (n<0){
      n = n * -1;
    }
    return((int)(Math.log10(n)+1));
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[]buckets){
    for (int i = 0; i < buckets.length; i++){
      original.extend(buckets[i]);
    }
  }
  public static void radixSortSimple(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0; i < 10; i ++){
      buckets[i] = new SortableLinkedList();
    }

    boolean cont = true;
    int max = data.size();
    int rep = 0;

    while (cont){
      while (data.size() > 0){
        int x = data.remove(0);
        buckets[nth(x, rep)].add(x);
      }
      if (buckets[0].size() == max){
        cont = false;
      }
      merge(data, buckets);
      rep ++;
    }
  }

}
