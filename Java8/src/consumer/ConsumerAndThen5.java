package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen5 {

	public static void main(String[] args) {

		List<Crona> list = new ArrayList<Crona>();
		list.add(new Crona("US", 1244302));
		list.add(new Crona("India", 50000));

		Consumer<List<Crona>> printCountryConsumer = listConsumer -> list.forEach(Crona::getCountry);

		Consumer<List<Crona>> printCasesConsumer = listConsumer -> list.forEach(Crona::getTotalCases);
		
		printCountryConsumer.andThen(printCasesConsumer).accept(list);

	}
}

class Crona {

	String country;
	Integer totalCases;

	public Crona(String country, Integer totalCases) {
		super();
		this.country = country;
		this.totalCases = totalCases;
	}

	public String getCountry() {
		System.out.println(country);
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getTotalCases() {
		System.out.println(totalCases);
		return totalCases;
	}

	public void setTotalCases(Integer totalCases) {
		this.totalCases = totalCases;
	}

}
