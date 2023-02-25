package livros.model;

public class MeusLivros extends Livro {

	private String dataAluguel;
	private String dataDevolucao;

	public MeusLivros(String nomeLivro, String autor, int ano, String dataAluguel, String dataDevolucao) {
		super(nomeLivro, autor, ano);
		this.dataAluguel = dataAluguel;
		this.dataDevolucao = dataDevolucao;
	}

	public String getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(String dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

}
