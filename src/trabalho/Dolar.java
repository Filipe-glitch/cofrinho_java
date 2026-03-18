package trabalho;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
	    System.out.printf("Dolár: %.2f%n", this.valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.30; //5 reais e 30 centavos é o valor atual do dólar em reais
	}

}
