public class Catalogos{
  private String ID, nombreCliente, tipoPago, ciudadEntrega, empresaEnvio;

  public Catalogos(String ID, String nombreCliente, String tipoPago, String ciudadEntrega, String empresaEnvio){
    this.ID = ID;
    this.nombreCliente = nombreCliente;
    this.tipoPago = tipoPago;
    this.ciudadEntrega = ciudadEntrega;
    this.empresaEnvio = empresaEnvio;
  }

  public String getID(){
    return ID;
  }

  public String getNombreCliente(){
    return nombreCliente;
  }

  public String getTipoPago(){
    return tipoPago;
  }

  public String getCiudadEntrega(){
    return ciudadEntrega;
  }

  public String getEmpresaEnvio(){
    return empresaEnvio;
  }

  public String toString(){
    return String.format("%s %s %s %s %s", ID, nombreCliente, tipoPago, ciudadEntrega, empresaEnvio);
  }
}
