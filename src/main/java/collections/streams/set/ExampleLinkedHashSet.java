package collections.streams.set;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
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

    LinkedHashSet<Integer> setNumbers = new LinkedHashSet<>();

    // Adicione 5 elementos inteiros

    setNumbers.add(3);
    setNumbers.add(88);
    setNumbers.add(20);
    setNumbers.add(44);
    setNumbers.add(3);

    // Navegue no Set exibindo cada número no console

    Iterator it = setNumbers.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // Remova o primeiro item do Set

    setNumbers.remove(3);

    // Adicione um novo número no Set: 23

    setNumbers.add(23);

    // Verifique o tamanho no Set

    System.out.println(setNumbers.size());

    // Verifique se o Set está vazio

    System.out.println(setNumbers.isEmpty());

  }
}
