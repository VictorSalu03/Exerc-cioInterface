package Programa;

//import Classes.Circulo;
import Classes.Quadrado;
import Interfaces.FormaGeometrica;

public class Programa {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = new Quadrado();

        formaGeometrica.calcularArea();
        formaGeometrica.explicarCalculo();
    }
    
}
