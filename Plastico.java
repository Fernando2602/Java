public class Plastico extends Producto{
  private String color;
  private boolean admiteMicroonda;
  public Juguete(int productoId, int piezas, String descripcion, String color, boolean admiteMicroonda){
    super(int productoId, int piezas, String descripcion);

    this.color = color;
    this.admiteMicroonda = admiteMicroonda;
  }
}
