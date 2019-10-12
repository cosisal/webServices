package test.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String args[]){
	List s1 = new ArrayList( );
	s1.add("a");
	s1.add("b");
	s1.add(1, "c");
	@SuppressWarnings("unchecked")
	List s2 = new ArrayList( s1.subList(1, 2) );
	s1.addAll(s2);
	System.out.println(s1);
	}

}
