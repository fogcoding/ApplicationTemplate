package com.fogcoding.XMLinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main1(String[] args) {
		String[] locations = {"file:D:\\workspace\\tmp\\ApplicationTemplate\\config\\application.xml"};

		ApplicationContext context = new ClassPathXmlApplicationContext(locations);
		Animal animal = (Animal) context.getBean("animal1");
		System.out.println(animal.getName());
		System.out.println(animal.getPrice());

		Animal animal2 = (Animal) context.getBean("animal2");
		System.out.println(animal2.getName());
		System.out.println(animal2.getPrice());

		Human human1 = (Human) context.getBean("human1");
		System.out.println(human1.toString());
		Human human2 = (Human) context.getBean("human2");
		System.out.println(human2.toString());

		Stocks stocks = (Stocks) context.getBean("stocks");
		System.out.println("animal 1 :"+stocks.getAnimal1().getName());
		System.out.println("animal 1 :"+stocks.getAnimal1().getPrice());
		System.out.println("animal 2 :"+stocks.getAnimal2().getName());
		System.out.println("animal 2 :"+stocks.getAnimal2().getPrice());

		ListDemo listDemo = (ListDemo) context.getBean("list");
		System.out.println(listDemo.getStrs().toString());
		System.out.println(listDemo.getAnimals().toString());

		MapDemo mapDemo = (MapDemo) context.getBean("map");
		System.out.println(mapDemo.getMaps().toString());
		System.out.println(mapDemo.getAnimalMap().toString());

		SetDemo setDemo = (SetDemo) context.getBean("set");
		System.out.println(setDemo.getSets().toString());




	}


}
