package collections.streams.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
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

    Set<Integer> setInteiros = new HashSet<>();

    // Adicione 5 elementos inteiros
    setInteiros.add(3);
    setInteiros.add(88);
    setInteiros.add(20);
    setInteiros.add(40);
    setInteiros.add(3);

    // Navegue no Set exibindo cada número no console

    Iterator it = setInteiros.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // Remova o primeiro item do Set

    setInteiros.remove(3);
    System.out.println(setInteiros);

    // Adicione um novo número no Set: 23

    setInteiros.add(23);
    System.out.println(setInteiros);

    // Verifique o tamanho no Set

    System.out.println(setInteiros.size());

    // Verifique se o Set está vazio
    
    System.out.println(setInteiros.isEmpty());


  }
}
