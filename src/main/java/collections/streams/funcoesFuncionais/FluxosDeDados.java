package collections.streams.funcoesFuncionais;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FluxosDeDados {
  public static void main(String[] args) {

    /*
    * Utilize uma lista com um Objeto complexo (estudante por exemplo, e realize as seguintes operações.
    * - Transforme cada objeto em uma string com os atributos do objeto;
    * - Conte quantos estudantes contém a lista;
    * - Filtre estudantes com idade igual ou superior a 18 anos;
    * - Exiba cada elemento no console;
    * - Retorne estudantes com nome que possui a letra B;
    * - Retorne se existir ao menos um estudante com a letra D no nome;
    * - Retorne o estudante mais velho (maior idade) da coleção. Retorne o mais novo também.
    * */

    List<Student> estudantes = new ArrayList<>();

    estudantes.add(new Student("Marina", 19, 7));
    estudantes.add(new Student("Carlos", 20, 9));
    estudantes.add(new Student("Mario", 13, 8));
    estudantes.add(new Student("Francisco", 7, 1));
    estudantes.add(new Student("Yago", 6, 1));
    estudantes.add(new Student("Maria", 9, 3));
    estudantes.add(new Student("Barbara", 21, 9));
    estudantes.add(new Student("Diane", 21, 9));

    System.out.println(estudantes.stream().map(student -> student.getName()
            .concat(" - ")
            .concat(String.valueOf(student.getAge()))
            .concat(" - ")
            .concat(String.valueOf(student.getGrade()))
    ).collect(Collectors.toList()));

    System.out.println("________________________");

    System.out.println("Quantidade de estudantes: " + estudantes.stream().count());

    System.out.println("________________________");

    estudantes.stream().map(student -> student.getName()
    .concat(" - ")
    .concat(String.valueOf(student.getAge()))
    .concat(" - ")
    .concat(String.valueOf((student.getGrade()))))
    .forEach(s -> System.out.println(s));

    System.out.println("________________________");

    estudantes.stream()
            .filter(student -> student.getAge() > 17)
            .map(student -> student.getName()
                    .concat(" - ")
                    .concat(String.valueOf(student.getAge()))
                    .concat(" - ")
                    .concat(String.valueOf((student.getGrade()))))
            .forEach(s -> System.out.println(s));

    System.out.println("________________________");

    estudantes.stream()
            .filter(student -> student.getName().contains("B"))
            .map(student -> student.getName()
                    .concat(" - ")
                    .concat(String.valueOf(student.getAge()))
                    .concat(" - ")
                    .concat(String.valueOf((student.getGrade()))))
            .forEach(s -> System.out.println(s));
    System.out.println("________________________");

    System.out.println(estudantes.stream().anyMatch(student -> student.getName().contains("D")));

    System.out.println("________________________");

    estudantes.stream().max((Comparator.comparingInt(value -> value.getAge()))).ifPresent(student -> System.out.println(student.getName() + " - " + student.getAge()));
    estudantes.stream().min((Comparator.comparingInt(value -> value.getAge()))).ifPresent(student -> System.out.println(student.getName() + " - " + student.getAge()));

  }
}
