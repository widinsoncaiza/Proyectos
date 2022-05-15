
import javax.swing.JOptionPane;

public class operacion {
 
    public int sumar (int num1,int num2,int num3){
  int sum = num1+num2+num3;
   return sum;
    }
    public int rest (int num1,int num2,int num3) {
   int rest = num1+num2-num3;
   return rest;
}
    public int mult (int num1,int num2,int num3){
  int mult = num1*num2*num3;
   return mult;
    }
    public int div (int num1,int num2,int num3) {
   int div = (num2/num3)/num1;
   return div;
   
    }
    public void mostrarResultador (int sum, int rest, int mult, int div) {
    JOptionPane.showMessageDialog(null, "la suma es"+sum);
    JOptionPane.showMessageDialog(null, "la resta"+rest);
    JOptionPane.showMessageDialog(null, "la multiplicacion"+mult);
    JOptionPane.showMessageDialog(null, "la div"+div);
    }
}

