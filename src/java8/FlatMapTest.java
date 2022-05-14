package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        Developer o1 = new Developer();
        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");

        List<Developer> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);

        List<String> res = list.stream().flatMap(x -> x.getBook().stream()).filter(x -> x.contains("Java")).collect(Collectors.toList());
        //System.out.println(res);
        mergeMapsTest();

    }


    static void mergeMapsTest(){
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("one",1);
        m1.put("two",2);
        m1.put("three",3);
        Map<String,Integer> m2 = new HashMap<>();
        m2.put("one",11);
        m2.put("four",4);
        m2.put("five",5);
        Map<String,Integer> out = Stream.of(m1,m2).flatMap(x -> x.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(k1,k2) -> { return k1 > k2 ? k1 : k2;}));
        out.entrySet().stream().forEach(System.out::println);
    }

    static class Developer {

        private Integer id;
        private String name;
        private Set<String> book;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<String> getBook() {
            return book;
        }

        public void setBook(Set<String> book) {
            this.book = book;
        }
//getters, setters, toString

        public void addBook(String book) {
            if (this.book == null) {
                this.book = new HashSet<>();
            }
            this.book.add(book);
        }
    }
}
