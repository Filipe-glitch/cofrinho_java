package trabalho;
import java.util.ArrayList;
public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	
	public ArrayList<Moeda> getListaMoedas() {
	    return this.listaMoedas;
	}
	
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}
	
	public void listagemMoedas() {
		if (listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio");
		}
		else {
			System.out.println("Cofrinho não esta vazio");
			for(Moeda m: listaMoedas) {
				m.info();
			}
		}
	}
	public double calculoTotalConvertido() {
		double total = 0;
		
		for(Moeda m: listaMoedas) {
			total += m.converter();
		}
		return total;
	}
}
