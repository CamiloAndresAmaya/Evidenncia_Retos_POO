package Principal;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona Camilo=new Persona();

        Camilo.pedirDatos();

        Camilo.mostrarPersona();

        Camilo.calcularImc();

        Camilo.mayorEdad();
    }
}