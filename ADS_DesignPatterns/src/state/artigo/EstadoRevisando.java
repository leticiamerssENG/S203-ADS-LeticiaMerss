package state.artigo;

public class EstadoRevisando implements Estado {
	
	private ZzzArtigo artigo;

	public EstadoRevisando(ZzzArtigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		
	}

	@Override
	public void reprovar() {
		
	}

}
