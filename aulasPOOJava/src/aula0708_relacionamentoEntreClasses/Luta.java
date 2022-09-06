package aula0708_relacionamentoEntreClasses;

import java.util.Random;

// Agregação de Classes - Quando uma classe contém outra;

public class Luta {
	
	// Atributos
	
	private Lutador desafiado;  // tipo abstrato
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Métodos
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		
		if(l1.getCategoria() == l2.getCategoria() && (l1 != l2)) {
			
			// l1.getCategoria().equals(l2.getCategoria())
			
			this.setAprovada(true);
			this.desafiado = l1;
			this.desafiante = l2;
			
			System.out.println("Status da Luta: " + this.getAprovada());
			
		} else {
			
			this.setAprovada(false);
			this.desafiado = l1;
			this.desafiante = l2;
			
			System.out.println("Status da Luta: " + this.getAprovada());
		}	
	}
	
	public void lutar() {
		
		if(this.aprovada) {
			
			System.out.println("A luta entre " + desafiado.getNome() + " e " + desafiante.getNome()  + " pode acontecer!\n");
			System.out.println("                      HORA DA LUTA!! \n");
			System.out.print("### DESAFIADO ###");
			System.out.print(" -------------------------------\n");
			desafiado.apresentar();
			System.out.print("\n### DESAFIANTE ###");
			System.out.print(" -------------------------------\n");
			desafiante.apresentar();
			
			Random gerador = new Random();
			int vencedor = gerador.nextInt(3); // 0 1 2
		
			System.out.print("\n## RESULTADO DA LUTA: ");
			
			 switch(vencedor) {
			 	case 0:
			 		System.out.println("Empatou!!");
			 		desafiado.empatarLuta();
			 		desafiante.empatarLuta();
			 		break;
			 	case 1:
			 		System.out.println(desafiado.getNome() + " ganhou!!");
			 		desafiado.ganharLuta();
			 		desafiante.perderLuta();
			 		break;
			 	case 2:
			 		System.out.println(desafiante.getNome() + " ganhou!!");
			 		desafiante.ganharLuta();
			 		desafiado.perderLuta();
			 		break;
			 }
			 
			 System.out.println("-------------------------------------------------");
			 System.out.println("\n              STATUS PÓS LUTA DOS PARTICIPANTES");
			 desafiado.status();
			 desafiante.status();
	
		} else {
			System.out.println("A luta entre " + desafiado.getNome() + " e " + desafiante.getNome()  + " não pode acontecer!");
		}
		
	}

	
	// Métodos Especiais
	
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
}
