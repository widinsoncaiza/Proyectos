
public class persona {
    String nombre;
    int edad;
String ci;
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public persona(String ci) {
        this.ci = ci;
    }
    //metodo correr
    public void correr(){
        System.out.println ("Soy "+nombre+", tengo "+edad+" años y  estoy estudiando :v ");
    }
    public void correr(int km){
    System.out.println ("He corrido "+km+" kilometros");}
}

