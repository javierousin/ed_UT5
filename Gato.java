package reposGit;

public class Gato {

	/**
	 * Constructor de la clase Gato
	 * 
	 * @param id
	 * @param nombre
	 */
	public Gato(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	/**
	 * Atributos de la clase Gato
	 */
	private int id;
	private String nombre;
	/**
	 * Método getId() que se dedica a obtener el identificador (int id) 
	 * de los objetos de la clase gato
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método setId(int id) que se dedica a definir el identificador (int id) 
	 * de los objetos de la clase gato
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Método getNombre() que se dedica a obtener el identificador (int id) 
	 * de los objetos de la clase gato
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método setNombre(String nombre) que se dedica a definir el identificador (int id) 
	 * de los objetos de la clase gato
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
