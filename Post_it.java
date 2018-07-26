
public abstract class Post_it {

    private String titulo;
    private String descricao;
    private String tag;
    
    public void  Post_it( titulo, descricao, tag){
    	this.titulo = titulo;
    	this.descricao = descricao;
		this.tag = tag;
    
    
   
}
"get e set"
public String getdescricao() {
		return descricao;
	}

public void setdescricao(String descricao) {
		this.descricao = descricao;
	}

public String gettag() {
		return tag;
	}

public void settag(String tags) {
		this.tag = tag;
	}

public String gettitulo() {
		return titulo;
	}

public void settag(String tags) {
		this.titulo = titulo;
	}

}