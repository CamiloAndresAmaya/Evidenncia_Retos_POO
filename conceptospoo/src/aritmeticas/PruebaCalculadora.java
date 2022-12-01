package aritmeticas;

public class PruebaCalculadora {
    public static void main(String[] args) {
        Calculadora Usuario=new Calculadora();
        
        int num1=52,num2=43;

        Usuario.sumarNumeros();

        System.out.println("La resta entre los Numeros 40 y 37 es "+Usuario.restarNumeros(40, 37) );

        Usuario.numeroMayor(40, 83);

        Usuario.menor(9, 15);

        System.out.println(Usuario.potenciación(5, 4));

    }
}
