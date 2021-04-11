package Classes;

import Interfaces.FormaGeometrica;

public class Circulo implements FormaGeometrica{

@Override
public void calcularArea() {
    System.out.println("Cálculo : PI * raio * raio");
    
}

@Override
public void explicarCalculo() {
    System.out.println(" --> Para executar o cálculo da área de um círculo, você deve multiplicar o PI = 3,14 pelo raio, e depois novamente por ele mesmo.");
    
}

}
    

