package PrincipalReto2;

import SaludReto2.PersonaReto2;

public class InicioReto2 {

    public static void main(String[] args) {
        PersonaReto2 Camilo=new PersonaReto2();
        String Resultado;
        Double ResultadoIndice;

        Camilo.pedirDatos();

        Camilo.mostrarPersona();

        ResultadoIndice=Camilo.indiceMasaCorporal;

        if (ResultadoIndice<20.0){
            Resultado=Camilo.calcularImc();
            System.out.println(Resultado);
        }
        else if(ResultadoIndice>20.0 && ResultadoIndice<=25.0){
            Resultado=Camilo.calcularImc();
            System.out.println(Resultado);
        }
        else{
            Resultado=Camilo.calcularImc();
            System.out.println(Resultado);
        }

        Camilo.mayorEdad();
  }
}
