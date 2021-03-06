package collections.streams.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
  public static void main(String[] args) {
    /*
    * Crie um Map e execute as seguintes operações:
    * - Adicione os 26 estados Brasileiros no map, e onde a sigla será a chave e o nome do estado o valor;
    * - Remova o estado de Minas Gerais;
    * - Adicione o Distrito Federal;
    * - Verifique o tamanho do mapa;
    * - Remova o estado de Mato Grosso do Sul usando o nome;
    * - Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA);
    * - Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC);
    * - Verifique se o estado do Maranhão existe no map buscando por seu nome.
    * */

    Map<String, String> states = new HashMap<>();

    // * - Adicione os 26 estados Brasileiros no map, e onde a sigla será a chave e o nome do estado o valor

//    Acre 	AC
//    Alagoas 	AL
//    Amapá 	AP 	Localizado na Região Norte
//    Amazonas 	AM 	Localizado na Região Norte
//    Bahia 	BA 	Localizado na Região Nordeste
//    Ceará 	CE 	Localizado na Região Nordeste
//    Distrito Federal 	DF 	Localizado na Região Centro-Oeste
//    Espírito Santo 	ES 	Localizado na Região Sudeste
//    Goiás 	GO 	Localizado na Região Centro-Oeste
//    Maranhão 	MA 	Localizado na Região Nordeste
//    Mato Grosso 	MT 	Localizado na Região Centro-Oeste
//    Mato Grosso do Sul 	MS 	Localizado na Região Centro-Oeste
//    Minas Gerais 	MG 	Localizado na Região Sudeste
//    Pará 	PA 	Localizado na Região Norte
//    Paraíba 	PB 	Localizado na Região Nordeste
//    Paraná 	PR 	Localizado na Região Sul
//    Pernambuco 	PE 	Localizado na Região Nordeste
//    Piauí 	PI 	Localizado na Região Nordeste
//    Rio de Janeiro 	RJ 	Localizado na Região Sudeste
//    Rio Grande do Norte 	RN 	Localizado na Região Nordeste
//    Rio Grande do Sul 	RS 	Localizado na Região Sul
//    Rondônia 	RO 	Localizado na Região Norte
//    Roraima 	RR 	Localizado na Região Norte
//    Santa Catarina 	SC 	Localizado na Região Sul
//    São Paulo 	SP 	Localizado na Região Sudeste
//    Sergipe 	SE 	Localizado na Região Nordeste
//    Tocantins 	TO 	Localizado na Região Norte

    states.put("AC", "Acre");
    states.put("AL", "Alagoas");
    states.put("AP", "Amapá");
    states.put("AM", "Amazonas");
    states.put("TO", "Tocantins");
    states.put("SE", "Sergipe");
    states.put("SP", "São Paulo");
    states.put("SC", "Santa Catarina");
    states.put("BA", "Bahia");
    states.put("CE", "Ceará");
    states.put("ES", "Espírito Santo");
    states.put("GO", "Goiás");
    states.put("MA", "Maranhão");
    states.put("MT", "Mato Grosso");
    states.put("MG", "Minas Gerais");
    states.put("MS", "Mato Grosso do Sul");
    states.put("PA", "Pará");
    states.put("PB", "Paraíba");
    states.put("PR", "Paraná");
    states.put("PE", "Pernambuco");
    states.put("PI", "Piaui");
    states.put("RJ", "Rio de Janeiro");
    states.put("RN", "Rio Grade do Norte");
    states.put("RS", "Rio Grande do Sul");
    states.put("RO", "Rondônia");
    states.put("RR", "Roraima");

    System.out.println(states);

    // * - Remova o estado de Minas Gerais

    states.remove("MG");
    System.out.println(states);

    // * - Adicione o Distrito Federal

    states.put("DF", "Distrito Federal");
    System.out.println(states);

    // * - Verifique o tamanho do mapa

    System.out.println(states.size());

    // * - Remova o estado de Mato Grosso do Sul usando o nome

    System.out.println(states.remove("RS", "Rio Grande do Sul"));

    // * - Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)

    for (Map.Entry<String, String> state: states.entrySet()){
      System.out.println(state.getValue() + " (" + state.getKey() + ")");
    }

    // * - Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)

    System.out.println(states.containsKey("SC"));

    // * - Verifique se o estado do Maranhão existe no map buscando por seu nome

    System.out.println(states.containsValue("Maranhão"));
  }
}
