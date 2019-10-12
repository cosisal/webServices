package test.enumeration;

class EnumClass {
	enum Members {
		HOBBITS(48), ELVES(74), DWARVES(50);
		int height;

		Members(int h) {
			height = h;
		}

		int getHeight() {
			return height;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(Members.HOBBITS.getHeight());
		
		
	}
}
