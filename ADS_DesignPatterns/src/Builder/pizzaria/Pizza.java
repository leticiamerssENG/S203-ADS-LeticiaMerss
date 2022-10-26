package Builder.pizzaria;

public class Pizza {
	
	private Integer size = 0;
	
	private Boolean flagCheese = false;
	
	private Boolean flagPepperoni = false;
	
	
	//acessorios
	public Boolean getFlagPepperoni() {
		return flagPepperoni;
	}

	public void setFlagPepperoni(Boolean flagPepperoni) {
		this.flagPepperoni = flagPepperoni;
	}

	public Boolean getFlagCheese() {
		return flagCheese;
	}

	public void setFlagCheese(Boolean flagCheese) {
		this.flagCheese = flagCheese;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	

}
