package trabalho;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.printf("Euro: %.2f%n" , this.valor);
	}

	@Override
	public double converter() {
		return this.valor * 6.10; //no momento atual, 1 real é 6.10 euros
	}

	

}
