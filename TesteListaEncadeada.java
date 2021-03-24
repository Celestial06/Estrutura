package segundalista;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TesteListaEncadeada testaListaEncadeada = new TesteListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		testaListaEncadeada.addDisciplinas(listaEncadeada);
		System.out.println("Todos as disciplinas foram adicionados com sucesso!!");
		System.out.println("Você tem as seguintes disciplinas adicionados: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
		System.out.println("Agora vamos remover!!");
		
		testaListaEncadeada.removerDisciplinas(listaEncadeada);
		System.out.println("Disciplinas removidas removidos");
		System.out.println("A lista ficou assim: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
		
	}
	
	public void addDisciplinas(ListaEncadeada listaEncadeada) {
	    Contato contato1 = new Contato(1, "poo", "prof mario"); //valor1
	    Contato contato2 = new Contato(2, "rede", "prof marcos"); //valor 2
	    Contato contato3 = new Contato(3, "gorv", "prof fernando"); //valor3
	  
		
		listaEncadeada.adicionar(contato1);  
		listaEncadeada.adicionar(contato2); 
		listaEncadeada.adicionar(contato3);
	}
	
	public void removerDisciplinas(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
		listaEncadeada.remover();
		
		
	}

}

