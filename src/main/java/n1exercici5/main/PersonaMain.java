package n1exercici5.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import n1exercici5.beans.Persona;

public class PersonaMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Persona persona1 = new Persona("Joan", "Puig", 30);
		FileOutputStream fos = new FileOutputStream("src/main/resources/persona.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(persona1);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("src/main/resources/persona.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Persona persona2 = (Persona) ois.readObject();
		System.out.println(persona2.toString());
		ois.close();
		fis.close();
	}

}
