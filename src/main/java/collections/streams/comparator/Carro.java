package collections.streams.comparator;

public class Carro implements Comparable<Carro> {

  private String modelo;
  private String marca;
  private Integer portas;

  public Carro(String modelo, String marca, int portas) {
    this.modelo = modelo;
    this.marca = marca;
    this.portas = portas;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Integer getPortas() {
    return portas;
  }

  @Override
  public String toString() {
    return "carro: " + this.modelo + ", marca: " + this.marca;
  }

  @Override
  public int compareTo(Carro o) {
    return this.modelo.compareTo(o.getModelo());
  }
}
