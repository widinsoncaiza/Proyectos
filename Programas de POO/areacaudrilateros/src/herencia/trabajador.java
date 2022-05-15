
package herencia;
public class trabajador extends persona{
       private double salario;
      private  String tiposangre;

    public trabajador(double salario, String tiposangre, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
        this.tiposangre = tiposangre;
    }
      
   

    public void mostrardatos() {
        System.out.println("EL NOMBRE ES\n"+ getNombre()+"\n"
                +salario+"\n"+tiposangre);
        
    }
     
 
   }

