package test.statics.members;

public class TestStaticMembers {

	
	public static int anni = 18;
	
	public void possoChiamarlo() {
		System.out.println(anni);
	}
	
	public static void main(String[] args) {
		TestStaticMembers a = new TestStaticMembers();
		
		System.out.println(a.anni);
		
		System.out.println(anni);
		
		System.out.println(TestStaticMembers.anni);
	}
}
