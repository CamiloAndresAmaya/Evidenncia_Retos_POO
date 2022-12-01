package poo;

public class Cuadrado extends Figura{

    //Atributos
    private float lado;

    //Metodos accesores
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    //Metodos Constructores
    public Cuadrado(){
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    //Metodos Propios
    @Override
    public void calcularArea() {
       float area=lado*lado;
       System.out.println("El area del cuadrado del lado "+lado+" es "+area);

    }

    
    
}
