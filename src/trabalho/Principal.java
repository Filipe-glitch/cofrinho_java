package trabalho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//mantive o scanner com nome teclado por estar acsotumado com as aulas
	   Scanner teclado = new Scanner (System.in);
	   Cofrinho cofreuser = new Cofrinho(); //criação do cofrinho onde as moedas serão armazenadas
	   int opcao ;
	   
	   while(true){
		   System.out.println("-".repeat(30));
		   System.out.println("Sistema de cofrinho de moedas");
		   System.out.println("1- Adicionar moeda");
		   System.out.println("2- Remover moeda");
		   System.out.println("3- Lista moeda");
		   System.out.println("4- Valor em reais");
		   System.out.println("-".repeat(30));
		   
		   try {
               opcao = teclado.nextInt();
               } 
		   catch (java.util.InputMismatchException e) {
			   // isso existe para caso o usúario digitar letra ou simbolo
               System.out.println("Entrada inválida, digite um dos números acima por favor");
               teclado.nextLine(); // esse comando limpa a entrada que foi digitada incorretamente
               continue;
		       }
           if (opcao < 1 || opcao > 4) {
        	   System.out.println("Número inválido. Digite um valor entre 1 e 4");
        	   continue;
        	   //no final eu percebi que era possível só deixar para colocar isso no else como opção invalida, porém decidi manter dessa primeira forma
           }
           
           else if(opcao == 1) {
        	   int moedaselecionada = 0;
        	   System.out.println("-".repeat(30));
        	   System.out.println("Escolha a moeda que quer adicionar");
        	   System.out.println("1- Real");
        	   System.out.println("2- Euro");
        	   System.out.println("3- Dolár");
        	   System.out.println("-".repeat(30));
        	   
        	   try {
        		   moedaselecionada = teclado.nextInt();
        	   }
        	   catch(java.util.InputMismatchException e) {
        		   System.out.println("Moeda inválida. Tente novamente");
        		   teclado.nextLine();
        		   continue;
        	   }
        	   System.out.println("Agora, digite o valor o valor que gostaria de guardar no cofrinho");
        	   double valor = 0;
        	   try {
        		   valor = teclado.nextDouble();
        		   if(valor <= 0) {
        			   System.out.println("Valor inválido. Digite novamente o valor");
        			   continue;
        		   }
        	   }
               catch(java.util.InputMismatchException e) {
            	   System.out.println("Inválido");
            	   teclado.nextLine();
            	   continue;
               }
        	   // aqui se cria a moeda de acordo com a escolha do usuário
        	   Moeda moedaadicionada = null;
        	   if(moedaselecionada == 1) {
        		   moedaadicionada = new Real(valor);
        	   }
        	   else if(moedaselecionada == 2) {
        		   moedaadicionada = new Euro(valor);
        	   }
        	   else if(moedaselecionada == 3) {
        		   moedaadicionada = new Dolar(valor);
        	   }
        	   
        	   if(moedaadicionada != null) {
        		   cofreuser.adicionar(moedaadicionada);
        		   System.out.println("Valor adicionado");
        	   }
        	   else {
        		   System.out.println("Não existe");
        	   }
        	   }
           else if(opcao == 2) {
        	   System.out.println("-".repeat(30));
        	   System.out.println("Escolha tipo de moeda que quer remover");
        	   System.out.println("1- Real");
        	   System.out.println("2- Euro");
        	   System.out.println("3- Dolár");
        	   int tipoMoedaRemover = 0;
        	   try {
        		   tipoMoedaRemover = teclado.nextInt();
        	   }
        	   catch(java.util.InputMismatchException e) {
        		   System.out.println("moeda inválida!");
        		   teclado.nextLine();
        		   continue;
        	   }
        	   System.out.println("Agora digite o valor que gostaria de remover dessa moeda");
        	   double valor = 0;
        	   try {
        		  valor = teclado.nextInt();
        		  if (valor <= 0) {
        			  System.out.println("Valor deve ser maior que zero");
        			  continue;
        		  }
        	   }
        	   catch(java.util.InputMismatchException e) {
        		   System.out.println("inválido!");
        		   teclado.nextLine();
        		   continue;
        	   }
        	   
        	   Moeda moedaEncontrada = null;
               for (Moeda m : cofreuser.getListaMoedas()) {
                  boolean mesmaMoeda =
        	      (tipoMoedaRemover == 1 && m instanceof Real) ||
        	      (tipoMoedaRemover == 2 && m instanceof Euro) ||
        	      (tipoMoedaRemover == 3 && m instanceof Dolar);

        	      if (mesmaMoeda) {
        	        if (m.getValor() >= valor) { //aqui é verificado se há saldo para se retirar
        	            m.setValor(m.getValor() - valor); 
        	            moedaEncontrada = m;
        	            break;
        	            } 
        	        else {
        	           System.out.println("Valor insuficiente para remoção.");
        	           moedaEncontrada = m; 
        	            }
        	        }
               }

        	    if (moedaEncontrada == null) {
        	        System.out.println("Moeda não encontrada.");
        	    }
        	    else {
        	        if (moedaEncontrada.getValor() == 0) {
        	            cofreuser.remover(moedaEncontrada);
        	        }
        	        System.out.println("Remoção realizada!");
        	    }
        	}
           else if (opcao == 3) {
				cofreuser.listagemMoedas();
			}
			
		   else if (opcao == 4) {
				System.out.printf("Total convertido para Real: R$ %.2f%n", cofreuser.calculoTotalConvertido());  
	}        //%.2f%n para evitar um número imenso 
}
	   }
	}
