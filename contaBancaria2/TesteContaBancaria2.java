package contaBancaria2;

import java.util.Scanner;

public class TesteContaBancaria2 {
		public static void menu(){
	       
    	//System.out.println("\nChatBoot - O que deseja?");
        System.out.println("\n0. Fim");
        System.out.println("1. Criar");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Status");
        System.out.print("Opcao:");
    }
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Conta c = new Conta();
		
		 String tipoConta = null;
		 String nomeDono;
		 double saque = 0.0;
		 double deposito = 0.0;
		 int numConta;
		
		 int opcao;

	        System.out.println("\tConta Bancária");

	        do{
	            menu();
	            opcao = entrada.nextInt();
	            
	            switch(opcao){
	            case 1:
	            	
		               System.out.println("\n#Preencha os dados corretamente");
		     		   System.out.println("Conta Corrente - cc e Conta Poupança - cp\n");
		     		   
		     		   System.out.print("Tipo da Conta: ");
		     		   tipoConta = entrada.next();
		     		   
		     		   System.out.print("Nome do Dono: ");
		     		   nomeDono = entrada.next();		     		   
		     		   
		     		   System.out.print("Número da Conta: ");
		     		   numConta = entrada.nextInt();

		     		   //c.setTipo(tipoConta);
	
		     		   c.abrirConta(tipoConta);   
		     		   c.numConta = numConta;			     		   
		     		   c.setNomeDono(nomeDono);
	               
	                break;
	                
	            case 2:
	            
	            	c.sacar(c.getStatus(),saque);
	            	  
	                if(c.getStatus()) {
	                	System.out.print("\nValor do Saque: ");
		                saque = entrada.nextDouble();
	                }
	                
	                break;
	                
	            case 3:
	            	
	                c.depositar(c.getStatus(),c.setDeposito(deposito));
	                
	                if(c.getStatus()) {
	                	System.out.print("\nValor do Depósito: ");
		                deposito = entrada.nextDouble();
	                }
	        
	                break;
	                
	            case 4:
	            	
	            	System.out.println("Tipo da Conta: " + c.getTipo());
	        		System.out.println("Dono: " + c.getNomeDono());
	        		System.out.println("Número: " + c.getNumConta());
	        		System.out.println("Saldo: " + c.getSaldo());
	        		System.out.println(c.getSaldo());
	        		System.out.println("Depósito Atual: " + c.getDeposito());
	        		System.out.println("Saque Atual: " + c.getSaque());
	        		System.out.println("Taxa Mensal: " + c.getTaxaMensal());

	                break;
	            
	            default:
	                System.out.println("Opção inválida.");
	            }
	        } while(opcao != 0);
	    }
}
