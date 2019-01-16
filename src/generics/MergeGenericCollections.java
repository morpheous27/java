package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeGenericCollections {
	public static void main(String[] args) {

		List<ElementParent> list = new ArrayList<>();
		ElementParent e1 = new Element("one",1);
		ElementParent e2 = new Element("two",2);
		ElementParent e3 = new Element("three",3);
		ElementParent e4 = new Element("four",4);
		ElementParent e5 = new Element("zour",4);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Merger<ElementParent> merger = new Merger<>();
		System.out.println((merger.sortAndmerge(list)));
	}
}

class Merger<T extends Comparable<? super T>> {

	public List<T> sortAndmerge(List<T> t) {
		
		Collections.sort(t);

		return t;
	}

}

class Element extends ElementParent  {

	Element(String name, int i) {
		this.name = name;
		this.i = i;
	}

	@Override
	public int compareTo(ElementParent o) {
		if (i == o.i)
			return name.compareTo(o.name);
		else
			return i - o.i;
	}
	
	public String toString()
	{
		return "i= "+i+" name="+name;
	}

}

class ElementParent implements Comparable<ElementParent>{

	protected int i = 0;
	protected String name = "name";

	public void print() {
		System.out.println("");
	}

	@Override
	public int compareTo(ElementParent o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
