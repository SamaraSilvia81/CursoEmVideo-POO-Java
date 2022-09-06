package aula09_desafioB;

public class Livro implements Publicacao {
	
	private String titulo, autor;
	private int totalPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public Livro(String titulo, String autor, int totalPaginas, boolean aberto, int pagAtual, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totalPaginas=" + totalPaginas + ", pagAtual="
				+ pagAtual + ", aberto=" + aberto + ", leitor=" + leitor + "]";
	}

	@Override
	public void abrir() {
		this.setAberto(true);
		System.out.println("O livro está aberto");
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		System.out.println("O livro está fechado");
	}

	@Override
	public void folhear(int p) {
		
		if(this.getAberto()) {
			this.pagAtual = p;		
			System.out.println("Estou folheando...");
			System.out.println("Página atual: " + this.getPagAtual());
		} else {
			System.out.println("O livro precisa estar aberto");
		}
	}

	@Override
	public void avancarPag() {
		
		if(this.getAberto()) {
			this.setPagAtual(pagAtual+1);
			System.out.println("Você avançou uma página");
		}else {
			System.out.println("O livro precisa estar aberto");
		}
	}

	@Override
	public void voltarPag() {
		
		if(this.getAberto()) {
			this.setPagAtual(pagAtual-1);
			System.out.println("Você retornou uma página");
		}else {
			System.out.println("O livro precisa estar aberto");
		}
	
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotalPaginas() {
		return totalPaginas;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public int getPagAtual() {
		return pagAtual;
	}
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public boolean getAberto() {
		return aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Pessoa getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	

}
