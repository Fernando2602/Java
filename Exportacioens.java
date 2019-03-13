public class Exportaciones{
  public static void main(String[] args){
    Explicate[] contenedor = new Explicate[3];
    contenedor[0] = new Juguete(5, 3, "Juguete raro", 12, true);
    contenedor[1] = new Plastico(5, 3, "plastico toxico", "Verde", false);
    contenedor[2] = new Ropa(5, 3, "Ropa bonita", true);

    for (Explicate producto : contenedor){
      System.out.printf(producto.dameDescripcion());
    }
  }
}
