package Factory;

import Builder.PizzaBuilder;
import Pizzaria.*;

public class PizzaFactory implements AbstractFactory {
	@Override
	public Pizza buildPizza(String flavor) {
		if(flavor.equalsIgnoreCase("Pepperoni")) {
			return new PizzaBuilder()
					.isName("Pepperoni")
					.hasPepper(false)
					.hasCatupiry(true)
					.hasOnion(false)
					.isSize("M")
					.hasTomato(true)
					.build();
			
		} else if(flavor.equalsIgnoreCase("Mozzarella")) {
			return new PizzaBuilder()
					.isName("Mozzarela")
					.hasPepper(true)
					.hasCatupiry(false)
					.hasOnion(true)
					.isSize("M")
					.hasTomato(false)
					.build();
		}
		
		return new PizzaBuilder()
				.isName("Mozzarela")
				.hasPepper(false)
				.hasCatupiry(false)
				.hasOnion(true)
				.isSize("P")
				.hasTomato(true)
				.build();
	}
}
