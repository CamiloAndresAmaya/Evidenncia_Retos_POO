package aritmeticas;

import java.util.Scanner;

public class Calculadora {

    Scanner leer=new Scanner(System.in);
    //Atributos

    int num1;
    int num2;

    //Metodos

    //1. Metodo sin valor de retorno que sume los dos números

    public void sumarNumeros(){
        System.out.println("Ingrese el primer numero");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextInt();

        int suma=num1+num2;
        System.out.println("La Suma De Los Numeros "+num1+" Y "+num2+" Es "+suma);
    }

    //2. Metodo con valor de retorno que reste los dos numeros
    
    public int restarNumeros(int n1, int n2) {
       int resta=n1-n2;
       return resta;
    }

    //3. Metodo con valor de retorno que devuelva cual es el numero mayor

    public int numeroMayor(int num1,int num2) {
        int numayor;
        if(num1>num2){
            System.out.println("El Numero "+num1+" Es Mayor A El Numero "+num2);
            numayor=num1;
        }
        else{
            System.out.println("El Numero "+num2+" Es Mayor A El Numero "+num1);
            numayor=num2;
        }
        return numayor;
    }


    //4. Metodo sin valor de retorno que devuelva cual es el numero menor
    public void menor(int num1,int num2) {
        if(num1>num2){
            System.out.println("El Numero "+num2+" Es Menor A El Numero "+num1);
        }
        else if(num2>num1){
            System.out.println("El Numero "+num1+" Es Menor A El Numero "+num2);
        }
        else{
            System.out.println("No Se Que Decirle...");
        }
    }


    //5. Metodo con valor de retorno que eleve cada numero al exponente que sea indicado por el usuario

    public String potenciación(int num1,int num2){
        System.out.println("Ingrese el exponente al que desea elevar los numeros");
        Double exponente=leer.nextDouble();

        Double potencial=Math.pow(num1,exponente);
        Double potencial2=Math.pow(num2,exponente);

        String resultado="Usted elevo los Numeros "+num1+" Y "+num2+" Al Exponente "+exponente+" Por lo tanto, El Resultado De Esta Elevación En El Primer Numero Es "+potencial+" Y El Resultado Del Segundo Numero Es "+potencial2;

        return resultado;
    }

}
