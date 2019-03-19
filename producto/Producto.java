public class Producto implements Explicate{
  private int productoId, piezas;
  private String descripcion;

  public Producto(int productoId, int piezas, String descripcion){
      this.productoId = productoId;
      this.piezas = piezas;
      this.descripcion = descripcion;
  }

  @Override
  public String dameDescripcion(){
    return descripcion;
  }

}
