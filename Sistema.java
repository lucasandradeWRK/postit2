
import java.util.ArrayList;

public class Sistema implements User{
	
	private ArrayList<Post_it> postit = new ArrayList<Post_it>();
	private ArrayList<Post_it> arquivado = new ArrayList<Post_it>();
	
	
	public void arquivar(Post_it postit){
		this.postit.remove(postit);
		this.arquivados.add(postit);
	}

	
	public Post_simp criarsimp() {
		Post_simp postsimp;
		postsimp= new Post_simp("Café" ,"tomar café com os amigos", "café");
		
		postits.add(postsimp);
		
		return postsimp;
	}

	
	public Post_taf criartarefa() {
		Post_taf postaf;
		postaf= new Post_taf("Livro de açăo", "Lembrar de Ler", "8min");
		
		postits.add(postaf);
		
		return postaf;
	}

	public void ver_arq() {
		for(int i = 0; i < arquivados.size(); i++) {
			Post_it postit = arquivados.get(i);
			System.out.println("===============");
			System.out.println("Descriçăo do Post it: " + postit.getDescricao());
			System.out.println("Tags: " + postit.getTags());
		}
	}

	public void buscar(String tag) throws Exception {
		int postitsComTag = 0;
		
		for(int i = 0; i < postits.size(); i++) {
			Post_it postit = postits.get(i);

			if(postit.getTags().contains(tag)) {
				postitsComTag++;
				
				System.out.println("===============");
				System.out.println("Descriçăo do Post it: " + postit.getDescricao());
				System.out.println("Tags: " + postit.getTags());
			}
		}
		
		if(postitsComTag == 0) {
			throw new Exception("Năo há nenhum Post it com a tag informada.");
		}
	}

	
	public void visualizar() {
		for(int i = 0; i < postits.size(); i++) {
			Post_it postit = postits.get(i);
			System.out.println("===============");
			System.out.println("Descriçăo do Post it: " + postit.getDescricao());
			System.out.println("Tags: " + postit.getTags());
		}
	}

}
