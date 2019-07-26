package Aula;

public class ExemplodeCarro {
	public void main(String args[]) {
		Carro car = new Carro(); 
		//EXTANCIA = Classe - Objeto - Operador new - Metodo Construtor
	
	car.cor = "verde";
	car.motor = "V8";
	car.modelo = "Lamborghini";
	
	car.ligar();
	car.acelerar();
	car.mudarMarcha();
	car.brecar();
	car.desligar();
	
	System.out.println("A cor é" + car.cor);
	//Concatenar é dar o resultado mais resultado dentro do resultado
	
	System.out.println("O motor é" + car.motor);
	
	System.out.println("O modelo é" + car.modelo);
	}
}
