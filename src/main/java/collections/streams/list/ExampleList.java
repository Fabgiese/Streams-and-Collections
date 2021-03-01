package collections.streams.list;

import java.util.*;

public class ExampleList {
  public static void main(String[] args) {

    /*
    * 1 - Crie uma lista e execute  as seguintes operações:
    * --> Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João;
    * --> Navegue na lista exibindo cada nome no console;
    * --> Substitua o nome Carlos por Roberto;
    * --> Retorne o nome da posição 1;
    * --> Remova o nome da posição 4;
    * --> Remova o nome João;
    * --> Retorne a quantidade de itens na lista;
    * --> Verifique se o nome Juliano existe na lista;
    * --> Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista
    * criada;
    * --> Ordene os itens da lista por ordem alfabética;
    * --> Verifique se a lista está vazia.
    * */

    // Criando a lista com os nomes
    List<String> names = new ArrayList<>();

    names.add("Juliana");
    names.add("Pedro");
    names.add("Carlos");
    names.add("Larissa");
    names.add("João");


    // Navegando pela lista
    Iterator<String> iterator = names.iterator();

    while (iterator.hasNext()){
      System.out.println("---> " + iterator.next());
    }

    // Substituir Carlos por Roberto.
    names.set(2, "Roberto");
    System.out.println(names);

    // Retorne o nome da posição 1;
    System.out.println("Nome da posição 1: " + names.get(1));

    // Remova o nome da posição 4;
    names.remove(4);
    System.out.println(names);

    // Remova o nome João;
    names.add("João");
    System.out.println(names);
    names.remove("João");
    System.out.println(names);

    // Retorne a quantidade de itens na lista;
    System.out.println("Tamanho da lista é: " + names.size());

    // Verifique se o nome Juliano existe na lista;
    System.out.println(names.contains("Juliano"));

    // Crie uma nova lista com os nomes: Ismael e Rodrigo. Add todos os itens da nova lista na primeira lista criada;
    List<String> newNames = new ArrayList<>();
    newNames.add("Ismael");
    newNames.add("Rodrigo");
    names.addAll(newNames);
    System.out.println(names);

    // Ordene os itens da lista por ordem alfabética;
    Collections.sort(names);
    System.out.println(names);

    // Verifique se a lista está vazia.
    System.out.println(names.isEmpty());
  }
}
