package Factory;

import Pizzaria.Pizza;

public interface AbstractFactory {
	public Pizza buildPizza(String flavor);
}
