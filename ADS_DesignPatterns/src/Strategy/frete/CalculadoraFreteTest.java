package Strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

    @Test
	void deveCalcularFreteParaDHL() {
		
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorObtido = calculadora.calcularValor("dhl",10.0);
        double valorEsperado = 100.0;
		
		assertEquals(valorObtido, valorEsperado);		
	}

    @Test
    void deveCalcularFreteParaSedex() {
		
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorObtido = calculadora.calcularValor("sedex",15.0);
        double valorEsperado = 70.0;
		
		assertEquals(valorObtido, valorEsperado);			
	}

    @Test
    void deveCalcularFreteParaJadLog() {
		
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorObtido = calculadora.calcularValor("jadlog",40.0);
        double valorEsperado = 150.0;
		
		assertEquals(valorObtido, valorEsperado);			
	}

    @Test
    void deveLancarExceptionParaServicoDesconhecido(){
        try{
			CalculadoraFrete calculadora = new CalculadoraFrete();
		    double valorObtido = calculadora.calcularValor("desconhecido",40.0);
            
			fail("Devia ter lançado exception");
			
		}catch (IllegalStateException e){
			e.printStackTrace();
		}
    }
}