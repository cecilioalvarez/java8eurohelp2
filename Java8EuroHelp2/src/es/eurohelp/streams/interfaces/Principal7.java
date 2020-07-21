package es.eurohelp.streams.interfaces;

import java.util.stream.IntStream;

public class Principal7 {

	public static void main(String[] args) {

		
		System.out.println(IntStream.range(0, 1000).summaryStatistics().getCount());
		
	}
}
