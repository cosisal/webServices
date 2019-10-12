package test.more.classes.in.a.file;

class IoSonoUnIntruso{
	
	final class Fkalkdla{}
}
class IoSonoUnIntruso2{
	
	abstract class Gdjkajdlak{}
}
class IoSonoUnIntruso3{
	
	class Gdahdkjas{}
}
class IoSonoUnIntruso4{
	
	private class Sdjajda{}
}
class IoSonoUnIntruso5{
	
	public class Ddjakl{}
}

public class MoreClassesInAFile {
	
	public class ioSonounIntrusoInternoAllaClasse{}
	
	public static void main(String[] args) {
		
		IoSonoUnIntruso a = new IoSonoUnIntruso();
		
		System.out.println("Tutte le classi definite nello stesso file non possono essere pubbliche si lascia il modificatore d'accesso di default");
		System.out.println("Tutte le classi definite nelle classi possono avere qualsiasi modificatore d'accesso");
	}
}
