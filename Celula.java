package segundalista;

public class Celula {

	private Contato valor;  //  info  prox
	private Celula proximo; // |9999 | | --> | 9999 | | --> | 9999 | | -->
	
	
	public Contato getValor() {
		return valor;
	}
	public void setValor(Contato valor) {
		this.valor = valor;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
}
