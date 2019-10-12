package ws;

public class TestGame {
	public static void main(String[] args) throws Exception {
		Game g = new Soccer();
		// 1
		Soccer s = (Soccer) g;
		// 2
		
		g = s;
		
		g.play();
		
		s.play("pallone");
		
		}
}
