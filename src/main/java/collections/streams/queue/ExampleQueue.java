package collections.streams.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class ExampleQueue {
  public static void main(String[] args) {

    /*
    * Crie uma fila e execute as seguintes operações:
    * - Adicione cinco nomes: Juliana, Pedro, Carlos, Larissa e João;
    * - Navegue na fila exibindo cada nome no console;
    * - Retorne o primeiro item da fila, sem removê-lo;
    * - Retorne o primeiro item da fila, removendo o mesmo;
    * - Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila;
    * - Retorne o tamanho da lista;
    * - Verifique se a lista está vazia;
    * - Verifique se o nome Carlos está na lista.
    * */

    Queue<String> fila = new LinkedBlockingDeque<>();

    // - Adicione cinco nomes: Juliana, Pedro, Carlos, Larissa e João;

    fila.add("Juliana");
    fila.add("Pedro");
    fila.add("Carlos");
    fila.add("Larissa");
    fila.add("João");
    System.out.println(fila);

    // - Navegue na fila exibindo cada nome no console;

    Iterator it = fila.iterator();

    while (it.hasNext()) {
      System.out.println("-> " + it.next());
    }

    // - Retorne o primeiro item da fila, sem removê-lo;

    try {
      System.out.println("O próximo da fila é " + fila.element());
    } catch (NoSuchElementException e) {
      System.out.println("A fila está vazia.");
    }

    // - Retorne o primeiro item da fila, removendo o mesmo;

    final String mensagemNomeRemovido = String.format("%s foi removido(a) da fila.", fila.poll());
    System.out.println(mensagemNomeRemovido);
    System.out.println(fila);

    // - Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila;

    fila.add("Daniel");
    int count = 0;
    it = fila.iterator();
    while (it.hasNext()) {
      if (it.next() == "Daniel") {
        System.out.println("Daniel se encontra na posição: " + count);
      }
      count++;
    }

    // - Retorne o tamanho da lista;

    System.out.println("O tamanho da fila é " + fila.size());

    // - Verifique se a lista está vazia;

    if (fila.isEmpty()) {
      System.out.println("A fila está vazia");
    } else {
      System.out.println("A fila não está vazia");
    }

    // - Verifique se o nome Carlos está na lista.

    if (fila.contains("Carlos")) {
      System.out.println("Carlos está na fila.");
    } else {
      System.out.println("Carlos não está na fila.");
    }

  }
}
