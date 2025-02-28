package reposGit;

/**
 *  Clase principal del programa
 */
public class Main {
/**
 * El autor de la clase Main y del programa soy yo, Javier. El programa y la clase son de la versión 1.0,
 * muy reciente, y está desde la versión 1.0. Los parámetros son genéricos.
 * @author Javier
 * @version 1.0
 * @param args
 * @since 1.0
 */
	public static void main(String[] args) {

		/**
		 * He creado dos perros y tres gatos, con su identificador (int id) y su nombre (String nombre)
		 * @author Javier
		 * @version 1.0
		 * @deprecated Perro p2
		 * @see Perro p1, Gato g1
		 */
		Perro p1 = new Perro(1, "Max");
		Gato g1 = new Gato(1, "Max");
		Perro p2 = new Perro(2, "Gus");
	}

}
