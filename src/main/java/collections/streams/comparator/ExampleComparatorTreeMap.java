package collections.streams.comparator;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ExampleComparatorTreeMap {
  public static void main(String[] args) {
    TreeMap<Carro, Integer> mapCar = new TreeMap(new SortCarro());

    mapCar.put(new Carro("A3", "Audi", 4), 1);
    mapCar.put(new Carro("Palio", "Fiat", 4), 2);
    mapCar.put(new Carro("Sandero", "Renault", 4), 3);
    mapCar.put(new Carro("Ka", "Ford", 4), 4);
    mapCar.put(new Carro("Onix", "GM", 4), 5);

    Carro carEntry;
    for (Map.Entry car: mapCar.entrySet()){
      carEntry = (Carro) car.getValue();
      System.out.println(car.getKey() + " -- " + carEntry);
    }
  }
}
