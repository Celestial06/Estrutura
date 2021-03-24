package segundalista;

public class Contato {

	private Integer id;
	private String nome;
	private String prof;
	
	public Contato(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.prof = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return prof;
	}

	public void setEmail(String email) {
		this.prof = email;
	}

	
	
}
