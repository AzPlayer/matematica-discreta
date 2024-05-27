import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class test {
    public static void main(String[] args) {
        // |(a u b) × (a \ c)|
        System.out.println(exercici1(
          new int[] { 0, 1, 2 },
          new int[] { 1, 2, 3 },
          new int[] { 0, 3 }
        ));
    }
    
    static int exercici1(int[] a, int[] b, int[] c) {
      int cont=0;
      ArrayList<Integer> union=new ArrayList<Integer>();
      for (int i=0;i<a.length;i++){
        union.add(a[i]);
      }
      for (int i=0;i<b.length;i++){
        if (!union.contains(b[i])) {
          union.add(b[i]);
        }
      }

      ArrayList<Integer> quitado=new ArrayList<Integer>();
      ArrayList<Integer> respaldo=new ArrayList<Integer>();

      for (int i=0;i<c.length;i++){
        respaldo.add(c[i]);
      }

      for(int i:a){
        if (!respaldo.contains(a[i])) {
          quitado.add(a[i]);
        }
      }

      for(int i:union){
        for(int q:quitado){
          cont++;
        }
      }
      return cont;
    }
}
