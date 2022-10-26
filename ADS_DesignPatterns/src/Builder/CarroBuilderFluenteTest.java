package Builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderFluenteTest {

	@Test
	void deveConstruirUmCarroFluente() {
		
		//partes validas
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas	= {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosh = new FreioABS();
		
		//invocando CarroBuilder
		CarroBuilderFluente builder = new CarroBuilderFluente();
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

}
