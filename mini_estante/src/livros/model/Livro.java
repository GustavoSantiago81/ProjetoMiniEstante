package livros.model;

public abstract class Livro {

	private String nomeLivro;
	private String autor;
	private int ano;

	public Livro(String nomeLivro, String autor, int ano) {
		super();
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.ano = ano;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
