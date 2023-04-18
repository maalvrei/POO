package _functionales;

import java.util.ArrayList;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		_Supplier<String> s1 = () -> "hola";
		System.out.println(s1.get());
		_Consumer<Integer> c1 = s -> System.out.println(s + " s");;
		c1.accept(1);
		_BiConsumer<Integer, Double> c2 = (i1, i2) -> System.out.println(i1 + " " + i2);
		c2.accept(1, 1.4);
		_Predicate<String> p1 = s -> s.length() > 2;
		System.out.println(p1.test("hola"));
		_BiPredicate <Integer, Double> b1 = (in1, do1) -> in1 * do1 > 4;
		System.out.println(b1.test(2, 2.5));
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("hola");
		al.add("que");
		al.add("tal");
		
		al.stream().filter(s -> s.length() > 3).filter(s -> s.startsWith("h")).forEach(s -> System.out.println(s));
		
		Consumer<String> c3 = s -> System.out.println(s);
		Predicate<String> p2 = i -> i.length() >= 4;
		
		al.forEach(s -> {
			for (int i = 0; i < al.size(); i++) {
			    for (int j = 0; j <= i; j++) {
			        System.out.print(al.get(i) + " ");
			    }
			    System.out.println();
			}
		});
		
		al.forEach(c3);
		al.removeIf(p2);
		al.forEach(c3);
		
		al.forEach(s -> System.out.println(s));
		al.removeIf(i -> i.length() >= 4);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		arr2.add(7);
		arr2.add(8);
		arr2.add(9);
		arr2.add(10);
		arr2.add(11);
		arr2.add(12);
		
		/**arr2.stream().filter(i -> i%2==0).forEach(i -> System.out.println(i + " : " + i*i));
		arr2.stream().filter(i -> i%2!=0).forEach(i -> System.out.println(i + " : " + i*i*i));
		arr2.forEach(i -> {
			if (i %2 ==0)
				System.out.println(i + " : " + i*i);
			else
				System.out.println(i + " : " + i*i*i);
		});*/
		
		//arr2.stream().filter(i -> i%2==0).distinct().map(i->i*i).forEach(i->System.out.println(i));
		arr2.stream().filter(i -> i%2==0).distinct().limit(3).forEach(i->System.out.println(i));
 	}
	
}
