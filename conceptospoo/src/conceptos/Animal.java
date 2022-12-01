package conceptos;

public class Animal{
    public int edad;

    //Atributos
    private String nombre;

    //metodo sin valor de retorno sin parametros
    public void cambiarNombre(String newname){
        nombre=newname;
        System.out.println("El nuevo nombre es "+nombre);
    }

    public int calcularEdad(int añoNacimiento){
        edad=2022-añoNacimiento;
        return edad;
    }




    //Metodos

}