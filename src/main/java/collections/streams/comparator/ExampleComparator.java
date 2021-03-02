package collections.streams.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExampleComparator {
  public static void main(String[] args) {
    /*
    * Crie uma lista de um objeto complexo e execute as seguintes operações.
    * - Adicione elementos nessa lista;
    * - Ordene implementando a interface java.util.Comparator no seu objeto complexo;
    * - Ordene implementando um novo objeto com a interface java.util.Comparable;
    * - Ordene usando uma expressão lambda na chamada de suaLista.sort();
    * - Ordene usando referências de métodos e os métodos estáticos de Comparator;
    * - Ordene coleções TreeSet e TreeMap.
    */

    List<Carro> listaCarros = new ArrayList<>();

    // * - Adicione elementos nessa lista;

    listaCarros.add(new Carro("Logan", "Renault", 4));
    listaCarros.add(new Carro("Palio", "Fiat", 4));
    listaCarros.add(new Carro("A3", "Audi", 4));
    listaCarros.add(new Carro("Ka", "Ford", 4));
    listaCarros.add(new Carro("HB20", "Hyundai", 4));

    for(Carro car:listaCarros){
      System.out.println(car.getModelo());
    }

    // * - Ordene implementando a interface java.util.Comparator no seu objeto complexo;



    // * - Ordene implementando um novo objeto com a interface java.util.Comparable;
    // * - Ordene usando uma expressão lambda na chamada de suaLista.sort();
    // * - Ordene usando referências de métodos e os métodos estáticos de Comparator;
    // * - Ordene coleções TreeSet e TreeMap.

  }
}
