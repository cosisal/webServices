package test.override;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class C extends B {
	int i = 30;

	int m1() {
		return i;
	}
	
	Set m2() throws Exception{
		return null;
	}
}