package trabalho;

public class Real extends Moeda{

	public Real(double valor) { //Herança de Moeda conforme pedido e conforme necessário
		super(valor);
	}
    // abaixo implementei os métodos através dos atalhos ditos em aula. 
	// source depois Override/implement methods
	@Override
	public void info() {
		System.out.printf("R$: %.2f%n", this.valor);
	}

	@Override
	public double converter() {
		return this.valor;
	}
   //utilizei this para evitar confusões com atributos valor de outras classes e dizer "ESTE VALOR DEFINIDO AQUI"
	
}
