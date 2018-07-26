
public class Post_tarefa extends Post_it {
	private String data;

    public void Post_tarefa(String descricao, String tag, String data){
    	super(descricao, tag);
    	this.data = data;
    }
 
public String getdata() {
		return data;
	}

public void setdata(String tags) {
		this.data = data;
	}

}
