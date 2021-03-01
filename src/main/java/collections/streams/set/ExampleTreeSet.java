package collections.streams.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
  public static void main(String[] args) {
    /*
     * Crie um Set executando as seguintes operações:
     * - Adicione 5 elementos inteiros: 3, 88, 20, 44, 3;
     * - Navegue no Set exibindo cada número no console;
     * - Remova o primeiro item do Set;
     * - Adicione um novo número no Set: 23;
     * - Verifique o tamanho no Set;
     * - Verifique se o Set está vazio;
     * */

    TreeSet<Integer> treeNumber = new TreeSet<>();

    // Adicione 5 elementos inteiros

    treeNumber.add(3);
    treeNumber.add(88);
    treeNumber.add(20);
    treeNumber.add(44);
    treeNumber.add(3);

    // Navegue no Set exibindo cada número no console

    Iterator it = treeNumber.iterator();
    while (it.hasNext()){
      System.out.println(it.next());
    }

    // Remova o primeiro item do Set

    treeNumber.pollFirst();

    // Adicione um novo número no Set: 23

    treeNumber.add(23);

    // Verifique o tamanho no Set

    System.out.println(treeNumber.size());

    // Verifique se o Set está vazio

    System.out.println(treeNumber.isEmpty());
  }
}
