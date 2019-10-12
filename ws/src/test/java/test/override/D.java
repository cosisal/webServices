package test.override;

import java.io.IOException;
import java.util.HashSet;

public abstract class D  extends C {
	abstract int m1();
	
	@SuppressWarnings("rawtypes")
	abstract HashSet m2() throws NullPointerException;
}
