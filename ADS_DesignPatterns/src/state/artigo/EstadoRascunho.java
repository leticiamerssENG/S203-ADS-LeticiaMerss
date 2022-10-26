package state.artigo;

public class EstadoRascunho implements Estado {
	
	private Artigo artigo;

	public EstadoRascunho(Artigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if(seguranca.ehUsuarioAutor())
		
	}

	@Override
	public void reprovar() {	
		
	}

}
