package collections.streams.optional;

import java.util.Optional;

public class ExampleOptional {
  public static void main(String[] args) {
    /*
    * Crie um Optional com um determinado tipo de dado:
    * * Crie com estado vazio, estado presente, e com null;
    * * Se presente, exiba o valor no console;
    * * Se vazio, lançe uma exceção IlegalStateException;
    * * Se vazio, exiba "Optional vazio" no console;
    * * Se presente, transforme o valor e exiba no console;
    * * Se presente, pegue o valor do optional e atribua em uma variável;
    * */


    // * Crie com estado vazio, estado presente, e com null;
    Optional<String> optPresent, optVazio, optNull;

    optPresent = Optional.of("Presente");
    optNull = Optional.ofNullable(null);
    optVazio = Optional.empty();

    // *Se presente, exiba o valor no console;
    optPresent.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio."));
    optNull.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio."));
    optVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio."));

    optPresent.orElseThrow(IllegalStateException::new);
    //optNull.orElseThrow(IllegalStateException::new);
    //optVazio.orElseThrow(IllegalStateException::new);

    if(optPresent.isPresent()) {
      String valor = optPresent.get();
      System.out.println(valor);
      optPresent.map((value) -> "--- ".concat(value).concat(" ---")).ifPresent(System.out::println);
    }


  }
}
