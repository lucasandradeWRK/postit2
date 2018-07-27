public interface User {
	public Post_simp criarSimp();

	public Post_taf criarTarefa();

	public void arquivar(Post_it postit);
	
	public void ver_arquivados();

	public void buscar(String tag);
	
	public void visualizar();
}
