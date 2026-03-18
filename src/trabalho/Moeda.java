package trabalho;

public abstract class Moeda {
   protected double valor;
   
   public Moeda(double valor) {
	   this.valor = valor;
   }
   
   public double getValor() {
	    return this.valor;
	}

	public void setValor(double valor) {
	    this.valor = valor;
	}
   
	public abstract void info(); //método para informações sobre as moedas
   
   public abstract double converter(); //método para conversão para real
}