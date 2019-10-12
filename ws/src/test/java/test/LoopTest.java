package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoopTest {
	int numeroClicli = 0;
	
	@Before
	public void setNumeroCicli() {
		this.numeroClicli = 15;
	} 
	
	@Test
	public void testCounter() {
		int counter = 0;
		outer: for (int i = 0; i < numeroClicli; i++) {
			middle: for (int j = 0; j < 3; j++) {
				boolean a = true;
				boolean b = false;
				inner: for (int k = 0; k < 3; k++) {
					
					if (a=b) {
						System.out.println("Porcata");
					}else {
						b = true;
					}
					
					if (k - j > 0) {
						break middle;
					}
					counter++;
				}
			}
		}
		Assert.assertEquals(15, counter);
		System.out.println(counter);
	}
	
	@After
	public void resetNUmeroCicli() {
		this.numeroClicli=0;
	}
	
	
	public static void main(String args[]) {
		int counter = 0;
		outer: for (int i = 0; i < 3; i++) {
			middle: for (int j = 0; j < 3; j++) {
				boolean a = true;
				boolean b = false;
				inner: for (int k = 0; k < 3; k++) {
					
					
					
					if (a=b) {
						System.out.println("Porcata");
					}else {
						b = true;
					}
					
					if (k - j > 0) {
						break middle;
					}
					counter++;
				}
			}
		}
		Assert.assertEquals(10, counter);
		System.out.println(counter);
	}
}
