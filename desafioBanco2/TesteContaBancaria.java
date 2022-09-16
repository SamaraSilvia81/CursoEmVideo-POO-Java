package desafioBanco2;

import java.util.Scanner;

public class TesteContaBancaria {
	
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
		        		
		        		if (c.getStatus() == true && saque < c.getSaldo()) {
		        			
		        			System.out.print("\nValor do Saque: ");
			                saque = entrada.nextDouble();
			                c.sacar(saque);
		        		
		        			break;
		        			
		        		} if (saque > c.getSaldo()){
		        			System.out.println("Atenção - Saque maior que saldo");
		        		} else if (c.getStatus() == false) {
		        			System.out.println("Atenção - Você precisa de uma conta aberta.");
	        			}

	                break;
	                
	            case 3:
	            	
	                if(c.getStatus()) {
	                	System.out.print("\nValor do Depósito: ");
		                deposito = entrada.nextDouble();
		                c.depositar(deposito);
	                } else{
	                	System.out.println("Atenção - Você precisa ter uma conta aberta");
	                }
	        
	                break;
	                
	            case 4:
	            	
	            	System.out.println("Tipo da Conta: " + c.getTipo());
	        		System.out.println("Dono: " + c.getNomeDono());
	        		System.out.println("Número: " + c.getNumConta());
	        		System.out.println("Saldo: " + c.getSaldo());
	        		System.out.println("Valor do Saque: " + saque);
	        		System.out.println("Valor do Depósito: " + deposito);
	        		System.out.println("Taxa Mensal: " + c.getTaxaMensal());

	                break;
	            
	            default:
	                System.out.println("Opção inválida.");
	            }
	        } while(opcao != 0);
	    }
}
