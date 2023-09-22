
public class Reclamacoes {
	private int codigo;
	private String reclamacao;
	private String autor;
	private String data;
	private String titulo;
	
	public Reclamacoes(int codigo, String reclamacao, String autor, String data, String titulo) {
		this.codigo = codigo;
		this.reclamacao = reclamacao;
		this.autor = autor;
		this.data = data;
		this.titulo = titulo;
	}

	public Reclamacoes(int codigo, String reclamacao) {
		this.codigo = codigo;
		this.reclamacao = reclamacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getReclamacao() {
		return reclamacao;
	}

	public void setReclamacao(String reclamacao) {
		this.reclamacao = reclamacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
