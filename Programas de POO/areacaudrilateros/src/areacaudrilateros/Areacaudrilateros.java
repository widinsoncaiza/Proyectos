
package areacaudrilateros;

import javax.swing.JOptionPane;

public class Areacaudrilateros {
private float lado1;
private float lado2;
//constructor cuadrilatero
    public Areacaudrilateros(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
//constructor cuadrado
    public Areacaudrilateros(float lado1) {
        this.lado1 =  this.lado2=lado1;
    }
public float getpermietro(){
    float perimetro= (lado1*lado2)*2;
    return perimetro;
}
public float getarea(){
    float area= lado1*lado2;
    return area;
}
    public static void main(String[] args) {
        Areacaudrilateros c1;
        float lado1,lado2;
       lado1=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));
lado2=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));
if(lado1==lado2){
    c1=new Areacaudrilateros(lado1);
}else{
    c1= new Areacaudrilateros(lado1,lado2);
}
System.out.println ("El perimetro es:"+c1.getpermietro());
System.out.println ("El area es:"+c1.getarea());


    }
    
          
    
}
