package PizzaFactory;

public abstract  class PizzaStore {
	public Pizza ordePizza(String tipo){
		Pizza pizza=null;
		pizza= createPizza(tipo);
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);

}
