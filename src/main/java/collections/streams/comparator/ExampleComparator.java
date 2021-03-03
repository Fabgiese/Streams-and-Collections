package collections.streams.comparator;

import java.util.*;

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

    System.out.println("---------------------");

    // * - Ordene implementando a interface java.util.Comparator no seu objeto complexo;

    Collections.sort(listaCarros);

    for(Carro car:listaCarros){
      System.out.println(car.getModelo());
    }

    System.out.println("---------------------");

    // * - Ordene implementando um novo objeto com a interface java.util.Comparable;

    Collections.sort(listaCarros, new SortCarro());

    for(Carro car:listaCarros){
      System.out.println(car.getModelo());
    }

    System.out.println("---------------------");

    // * - Ordene usando uma expressão lambda na chamada de suaLista.sort();

    Comparator<Carro> compareModelo = (Carro o1, Carro o2) -> (int) (o1.getMarca().compareTo(o2.getMarca()));

    Collections.sort(listaCarros, compareModelo);

    for (Carro car: listaCarros) {
      System.out.println(car);
    }
  }
}
