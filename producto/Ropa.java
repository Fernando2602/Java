public class Juguete extends Producto{
  private boolean paraMujer;
  public Juguete(int productoId, int piezas, String descripcion, boolean paraMujer){
    super(int productoId, int piezas, String descripcion);

    this.paraMujer = paraMujer;
  }
}
