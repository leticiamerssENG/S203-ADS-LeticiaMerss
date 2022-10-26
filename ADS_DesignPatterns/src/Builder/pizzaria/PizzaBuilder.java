package Builder.pizzaria;

public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder(){
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder setSize(Integer size) {
		pizza.setSize(size);
		return this;
	}
	
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	
	public Pizza getPizza(){
		validarIngredientes();
		validarTamanho();
		return pizza;
	}
	
	
	private void validarIngredientes() {
		if(pizza.getFlagCheese() == false && pizza.getFlagPepperoni() == false){
			throw new  IllegalStateException("Sem ingredientes");
		}
	}
	
	
	private void validarTamanho() {
		Integer tamanhoPizza = pizza.getSize();
		
		if(tamanhoPizza < 1 || tamanhoPizza > 3) {
			throw new IllegalStateException("Tamanho da pizza invalido: "+tamanhoPizza);
		}
	}

}
