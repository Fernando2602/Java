public class Juguete extends Producto{
  private int edadRecomendada;
  private boolean plomo;

  public Juguete(int productoId, int piezas, String descripcion, int edadRecomendada, boolean plomo){
    super(int productoId, int piezas, String descripcion);

    this.edadRecomendada = edadRecomendada;
    this.plomo = plomo;
  }
}
