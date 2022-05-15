
package triangiso;


public class trianisose {
    private float base;
    private float altura;

    public trianisose(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public double Area(){
        double area= (base*altura)/2;
        return area;
    }
    public double perimetro(){
        double perime= (base*altura)*2/2;
        return perime;       
    }
    public static void main(String[] args){
        float base=9; 
          float altura=8; 
          trianisose rt=new trianisose(base,altura);
          System.out.println("el area es"+rt.Area());
          System.out.println("el perimetro es"+rt.perimetro());
    }
}


    
