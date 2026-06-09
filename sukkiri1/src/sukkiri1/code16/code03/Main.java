package sukkiri1.code16.code03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	ArrayList<String>names = new ArrayList<String>();
	names.add("湊");
	names.add("朝霞");
	names.add("菅原");
	
	List<String>names1 = new ArrayList<String>();
	List<String>names2 = new LinkedList<String>();
	
	
	Iterator<String>it = names.iterator();
	while(it.hasNext()) {
		String e= it.next();
		System.out.println(e);
	}
	System.out.println();
	for(String e:names) {
		System.out.println(e);
	}

}

public static void method(List<String>list) {
	//LinkedList も　ArrayListもどっちもいける
}

}
