package sena;

import conceptos.Animal;

public class Prueba {
    public static void main(String[] args) {
        Animal juancamilo=new Animal();

        juancamilo.cambiarNombre("Copito");

        juancamilo.calcularEdad(2015);
        System.out.println("La edad del animal es "+juancamilo.edad);

    }

}
