import java.util.ArrayList;
import java.util.Scanner;

public class CatalogosTest{
  public static void main(String[] args){
    ArrayList<Catalogos> datos = new ArrayList<Catalogos>();
    Scanner scan = new Scanner(System.in);
    String ID, nombreCliente, tipoPago, ciudadEntrega, empresaEnvio;

    for (int i = 0; i < 2; i++){
      System.out.printf("Linea %d%n", i + 1);
      System.out.print("Introduce el ID: ");
      ID = scan.nextLine();
      System.out.print("Introduce el nombreCliente: ");
      nombreCliente = scan.nextLine();
      System.out.print("Introduce el tipoPago: ");
      tipoPago = scan.nextLine();
      System.out.print("Introduce el ciudadEntrega: ");
      ciudadEntrega = scan.nextLine();
      System.out.print("Introduce el empresaEnvio: ");
      empresaEnvio = scan.nextLine();

      Catalogos catalogo = new Catalogos(ID, nombreCliente, tipoPago, ciudadEntrega, empresaEnvio);

      datos.add(catalogo);
    }

    for (Catalogos dato : datos)
      System.out.printf("%s %n", dato);
  }
}
