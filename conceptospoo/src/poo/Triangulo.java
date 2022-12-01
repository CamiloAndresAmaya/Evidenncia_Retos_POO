package poo;

public class Triangulo extends Figura{

    //Atributos
    private float base,altura;

    //Metodos Accesores
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Metodos Constructores

    public Triangulo(){
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodos Propios
    @Override
    public void calcularArea() {
        float area=(base*altura)/2;
        System.out.println("El area del Triangulo con base "+base+" y altura "+altura+" es "+area);
        
    }
    
}
