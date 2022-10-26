package Builder;

public class CarroBuilder {

	private Carro carro;
	
	public CarroBuilder() {
		carro = new Carro();
		
	}
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	
	public void buildMotor(Motor m) {
		carro.setMotor(m);
	}
	
	public void buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
	}
	
	public void buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
	}
	
	
	// devolve o carro...
	public Carro getCarro() {
		validarPortas();
		validarMotor();
		
		return carro;
	}
	
	// Teste validacao construcao do carro
	private void validarPortas() {
		if(carro.getPortas() == null) {
			throw new  IllegalStateException("Sem porta");
		}
		
		int numPortas = carro.getPortas().length;
		
		if (numPortas != 2 && numPortas != 4) {
			throw new IllegalStateException("Número inválido de portas: " + numPortas);
		}
	}
	
	private void validarMotor() {
		if (carro.getMotor() == null) {
			throw new IllegalStateException ("Nenhum motor foi adicionado");
			
		}
	}
	
}
