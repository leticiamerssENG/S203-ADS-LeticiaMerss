package state.artigo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ZzzArtigo {

	private String estado;

	private List <String> logHistorico = new ArrayList<>();
	
	public ZzzArtigo() {
		this.estado = "RASCUNHO"; //estado inicial
	}
	
	public String getEstado() {
		return estado;
	}

	public List<String> getLogHistorico() {
		return logHistorico;
	}

	public void publicar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			if(seguranca.ehUsuarioAutor()) {
				this.estado = "REVISANDO";
				this.logHistorico.add("Transitando para REVISANDO em " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(seguranca.ehUsuarioModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Transitando para APROVADO em " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		//codigo apenas por motivos didáticos
		if ("APROVADO".equals(this.estado)) {
			//faz nada
			return;
		}
		
	}
	
	public void reprovar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			if(seguranca.ehUsuarioModerador()) {
				this.estado = "RASCUNHO";
				this.logHistorico.add("Transitando para Rascunho em " + LocalDateTime.now());
				return;
			} else {
				throw new RuntimeException("Usuário não tem permissão para reprovar");
			}
		}
		
		if("APROVADO".equals(this.estado)) {
			//faz nada
			return;
		}
	}
}
