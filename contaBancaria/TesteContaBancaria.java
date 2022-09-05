package contaBancaria;

public class TesteContaBancaria {
	
public static void main(String[] args) {
		
		Conta c = new Conta();
		
		System.out.println("MINHA CONTA BANCÁRIA");
		
		c.abrirConta("cp");
		c.numConta = 123;	
		c.setNomeDono("Samara");
		//c.depositar(true,20);
		//c.sacar(true,10);
		//c.pagarMensal("cp");
		
		
		System.out.println("Conta: " + c.getTipo());
		System.out.println("Dono: " + c.getNomeDono());
		System.out.println("Número: " + c.getNumConta());
		System.out.println("Saldo: " + c.getSaldo());
		System.out.println("Depósito Atual: " + c.getDeposito());
		System.out.println("Saque Atual: " + c.getSaque());
		System.out.println("Taxa Mensal: " + c.getTaxaMensal());
		// System.out.println("Depósito total: " + c.getDepositoTotal());
		// System.out.println("Saque total: " + c.getSaqueTotal());
	
		
	}
}
