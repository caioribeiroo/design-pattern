package Pizzaria;

import Factory.PizzaFactory;
import Pizzaria.Pizza;
import Pizzaria.Pizzaria;

public class Main {
	public static void main(String[] args) {
		Pizza pizza;
		Pizzaria pizzeria = new Pizzaria();
		
		pizza = new PizzaFactory().buildPizza("Pepperoni");
		pizzeria.changeStatusOrder("Doing", pizza);
		
		System.out.println("Name -> " + pizza.getName());
		System.out.println("Size -> " + pizza.getSize());
		System.out.println("Tomato -> " + pizza.isTomato());
		System.out.println("Onion -> " + pizza.isOnion());
		System.out.println("Pepper -> " + pizza.isPepper());
		System.out.println("Status Order -> " + pizza.getStatusOrder());
	}
}
