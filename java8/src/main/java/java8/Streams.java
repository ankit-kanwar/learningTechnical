package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Streams {

	public static void main(String[] args) {
		
		IntStream.range(1, 10)
				 .forEach(System.out::print);
		
		System.out.println();
		
		IntStream.range(1, 10)
		         .skip(6)
		         .forEach( i -> System.out.println(i));
		
		System.out.println(IntStream.range(1, 10)
		         .sum());
		
		Stream.of("Falguni","Hamir","Jammy")
		      .sorted()
		      .findFirst()
		      .ifPresent(System.out::println);
		
		String[] names = {"A1","Ankit","Kushal","Brent",
				"Sarika","Amanda","Hans","Shivika","Ask Me"};
		
		Arrays.stream(names)
		      .filter( name -> name.matches("[a|A].*"))
		      .sorted()
		      .forEach(System.out::println);
		
		Arrays.stream( new int[] {2,4,6,8,10} )
		      .map(num -> num*num)
		      .average()
		      .ifPresent(System.out::println);
		System.out.println("----");
		List<String> names1 = Arrays.asList("A1","Ankit","Kushal","Brent",
				"Sarika","Amanda","Hans","Shivika","Ask Me");
		
		names1.stream()
		      .map(String::toLowerCase)
		      .filter( name -> name.startsWith("a"))
		      .forEach(System.out::println);
		System.out.println("----");
		try {
			Stream<String> bands = Files.lines(Paths.get("bands.txt"));
			bands.filter( band -> band.length() > 13)
			     .sorted()
			     .forEach(System.out::println);
			
			System.out.println("----");
			List<String> bands2 = Files.lines(Paths.get("bands.txt"))
			     .filter( band -> band.contains("jit") )
			     .collect( Collectors.toList());
			     
			bands2.forEach(System.out::println);
			
			bands.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Stream<String> rows = Files.lines(Paths.get("data.txt"));
			int rowCount = (int) rows
			     .map( row -> row.split(",") )
			     .filter(row -> row.length == 3)
			     .count();
			System.out.println("rowcount is :"+rowCount);
			
			Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
			rows2
			.map( row -> row.split(","))
			.filter( row -> row.length == 3)
			.filter( row -> Integer.parseInt(row[1]) > 15)
			.forEach( row -> System.out.println(row[0]+" "+row[1]+" "+row[2]));
			
			
			Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
			Map<String,Integer> map = rows3
			    .map(row -> row.split(","))
			    .filter(row -> row.length == 3)
			    .filter(row -> Integer.parseInt(row[1]) > 15)
			    .collect( Collectors.toMap(row -> row[0], row -> Integer.parseInt(row[1])));
			
			map.forEach((k,v) -> {
				System.out.printf("%s : %d%n",k,v);
			});
			
			
			rows.close();
			rows2.close();
			rows3.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//reduction
		double total = Stream.of(7.3,1.5,4.8)
		      .reduce(0.0, (Double a,Double b) -> a+b);
		
		System.out.println(total);
		
		
		IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10).summaryStatistics();
		System.out.println(summary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	   

	}

}
