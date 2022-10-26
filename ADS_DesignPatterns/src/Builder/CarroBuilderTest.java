package Builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	private CarroBuilder carroBuilder;

	@Test
	void deveConstruirUmCarro() {
		
		//partes validas
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas	= {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosh = new FreioABS();
		
		//invocando CarroBuilder
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(computadorBordoSiemens);
		builder.buildFreioABS(freioBosh);
		
		Carro carroPronto = builder.getCarro();
		
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getMotor());
		assertNotNull(carroPronto.getPortas());
		assertNotNull(carroPronto.getComputadorBordo());
		assertNotNull(carroPronto.getFreioABS());
		assertEquals(carroPronto.getPortas().length, 2);	
		
		
		
	}
	
	//Atalhos eclipse ctrl+1

}
