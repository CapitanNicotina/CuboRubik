
public class Caras {
	int id;
	String color;
	static String[][] cara = new String [3][3];
	/**
	 * 
	 * @param id
	 * @param color
	 * @param cara
	 */
	public Caras(int id, String color, String[][] cara) {
		super();
		this.id = id;
		this.color = color;
		Caras.cara = cara;
	}
	public void organizada() {
		for (int c = 0; c >cara.length;c++){
			for (int i = 0; i >cara.length;i++) {
				cara[c][i] = "blanco";
			}
		}
	}
	public void desorganada() {
		
		
	}
	
	 
}


	