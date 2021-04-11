package Classes;

import Interfaces.FormaGeometrica;

public class Quadrado implements FormaGeometrica{

@Override
public void calcularArea() {
    System.out.println("Cáculo: lado * lado");
    
}

@Override
public void explicarCalculo() {
    System.out.println("--> Para executar o cálculo da área do quadrado, você deve multiplicar o lado por ele mesmo");
    
}
    
}
