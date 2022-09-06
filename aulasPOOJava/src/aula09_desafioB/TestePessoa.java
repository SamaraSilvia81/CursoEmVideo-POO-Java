package aula09_desafioB;

public class TestePessoa {
	
	public static void main(String[] args) {
		
			
		Pessoa [] p = new Pessoa[2];
		Livro [] book = new Livro[3];
		
		p[0] = new Pessoa("Samara", 22,"F");
		p[1] = new Pessoa("Thomas",42,"M");
		
		book[0] = new Livro("A Cabana","William P.Young",240,p[0]);
		book[1] = new Livro("A Travessia","William P.Young",340,p[1]);
		book[2] = new Livro("Eva","William P.Young",540,p[0]);
		
		book[0].abrir();
		book[0].folhear(400);
		System.out.println(book[0].detalhes());
		
		
	
	}

}
