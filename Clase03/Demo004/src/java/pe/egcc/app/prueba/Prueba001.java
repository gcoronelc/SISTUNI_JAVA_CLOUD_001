package pe.egcc.app.prueba;

import pe.egcc.app.dao.espec.DaoCrudEmpleado;
import pe.egcc.app.dao.impl.DaoEmpleadoImpl;
import pe.egcc.app.domain.Empleado;

public class Prueba001 {
  
  public static void main(String[] args) {
    DaoCrudEmpleado dao = new DaoEmpleadoImpl();
    Empleado bean = dao.validar("creyes", "linda");
    if( bean == null ){
      System.err.println("No existe");
    } else {
      System.out.println("Hola " + bean.getNombre());
    }
  }

}
