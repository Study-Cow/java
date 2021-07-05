package ch8.sunmin.item52;

import java.util.List;

public class WineCollection {

	static class Wine {
	    String name() { return "포도주"; }
	}
	
	static class SparklingWine extends Wine {
	    @Override String name() { return "발포성 포도주"; }
	}
	
	static class Champagne extends SparklingWine {
	    @Override String name() { return "샴페인"; }
	}
	
    public static void main(String[] args) {
        List<Wine> wineList = List.of(
                new Wine(), new SparklingWine(), new Champagne());

        for (Wine wine : wineList)
            System.out.println(wine.name());
    }
	
}
