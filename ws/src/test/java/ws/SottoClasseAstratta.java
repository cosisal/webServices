package ws;

public abstract class SottoClasseAstratta extends ClasseNonAstratta {
	public  String scrivoQualcosa(String qualcosa) {
		System.out.println(qualcosa);
		return qualcosa;
	};
	public abstract String scrivoQualcosa1(String qualcosa);
	public abstract String scrivoQualcosa2(String qualcosa);
	public abstract String scrivoQualcosa3(String qualcosa);
}
