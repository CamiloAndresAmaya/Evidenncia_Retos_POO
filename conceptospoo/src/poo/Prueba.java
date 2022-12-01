package poo;
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {
        String Repetir="s";
        Scanner leer=new Scanner(System.in);
        float valorLado,valorAltura,valorBase,Radio;

        Cuadrado calculadoraAreas=new Cuadrado();
        Triangulo calculadoraAreas2=new Triangulo();
        Rectangulo calculadoraAreas3=new Rectangulo();
        Circulo calculadoraAreas4=new Circulo();

        while (Repetir.equalsIgnoreCase("s")){

            System.out.println("A cual figura geometrica desea calcular el área: \n 1. Cuadrado \n 2. Triangulo \n 3. Rectangulo \n 4. Circulo");
            int opcionesAreas=leer.nextInt();
            switch ( opcionesAreas )
            {
                case 1:
                    System.out.println("Escriba el Lado Del Cuadrado");
                    valorLado=leer.nextFloat();
                    calculadoraAreas.setLado(valorLado);

                    calculadoraAreas.calcularArea();
                    break;
                case 2:
                    System.out.println("Escriba la altura Del Triangulo");
                    valorAltura=leer.nextFloat();
                    calculadoraAreas2.setAltura(valorAltura);
                    System.out.println("Escriba la base Del Triangulo");
                    valorBase=leer.nextFloat();
                    calculadoraAreas2.setBase(valorBase);
                    calculadoraAreas2.calcularArea();
                    break;
                case 3:
                 System.out.println("Escriba la altura Del Rectangulo");
                    valorAltura=leer.nextFloat();
                    calculadoraAreas3.setAltura(valorAltura);
                 System.out.println("Escriba la base Del Rectangulo");
                 valorBase=leer.nextFloat();
                    calculadoraAreas3.setBase(valorBase);
                    calculadoraAreas3.calcularArea();
                    break;
                case 4:
                    System.out.println("Escriba El Radio Del Circulo");
                    Radio=leer.nextFloat();
                    calculadoraAreas4.setRadio(Radio);
                    calculadoraAreas4.calcularArea();
                    break;
            }
            System.out.println("Si desea volver a elegir una figura geometrica digite s, o n para salir");
            Repetir=leer.next();
        }

        leer.close();


    }
}
