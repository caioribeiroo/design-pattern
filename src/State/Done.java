package State;

import Pizzaria.Pizza;;

public class Done implements StatusOrder {
	private Pizza pizza;
	
	@Override
	public void changeStatusOrder(Pizza pizza) {
		this.pizza = pizza;
		this.pizza.setStatusOrder("Your pizza has been Done!");
	}
}
