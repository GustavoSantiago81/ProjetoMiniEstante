package livros.model;

public class LivrosDisponíveis extends Livro {

	public int quantidade;

	public LivrosDisponíveis(String nomeLivro, String autor, int ano, int quantidade) {
		super(nomeLivro, autor, ano);
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
