package atelier10;

import java.io.File;

public class testLireTouUnTexte {


	public static void main(String[] args) {
		
		LireToutUnTexte lt = new LireToutUnTexte(new File("livres/adelaide.txt"));
		System.out.println(lt.Chercher("Hautcastel"));
	}

}
