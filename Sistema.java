import java.util.ArrayList;
public class Sistema implements User{
	
	private ArrayList<Post_it> postit = new ArrayList<Post_it>();
	private ArrayList<Post_it> arquivado = new ArrayList<Post_it>();
	
	
	public void arquivar(Post_it postit){
		this.postit.remove(postit);
		this.arquivado.add(postit);
	}

	
	public Post_simp criarSimp() {
		Post_simp postsimp;
		postsimp= new Post_simp("Café" ,"tomar café com os amigos", "café");
		
		postits.add(postsimp);
		
		return postsimp;
	}

	
	public Post_tarefa criarTarefa() {
		Post_tarefa postarefa;
		postarefa= new Post_tarefa("Tomar Café", "Se reunir na cafeteria", "30m");
		
		postit.add(postarefa);
		
		return postarefa;
	}

	public void ver_arquivados() {
		for(int c = 0; c < arquivado.size(); c++) {
			Post_it postit = arquivado.get(c);
			System.out.println("titulo-->" + postit.gettitulo());
			System.out.println("Descriçăo-->" + postit.getdescricao());
			System.out.println("Tag-->" + postit.gettags());
		}
	}

	public void buscar(String tag){
		int resultados = 0;
		
		for(int rs = 0; rs < postit.size(); rs++) {
			Post_it postit = postit.get(rs);

			if(postit.gettag().contains(tag)/*"vefifica se a tag está dentro do array"*/) {
				resultados = resultados+1;
				System.out.println("titulo-->" + postit.gettitulo())
				System.out.println("Descriçăo--> " + postit.getdescricao());
				System.out.println("Tag-->" + postit.gettag());
			}
		}
		
		if(postitsComTag == 0) {
			System.out.println("Năo há nenhum Post it com a tag informada.");
		}
	}

	
	public void visualizar() {
		for(int rs = 0; rs < postit.size(); rs++) {
			Post_it postit = postit.get(rs);
			System.out.println("titulo-->" + postit.gettitulo())
			System.out.println("Descriçăo-->" + postit.getdescricao());
			System.out.println("Tag-->: " + postit.gettags());
		}
	}

}
