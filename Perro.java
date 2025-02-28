package reposGit;

public class Perro {

	/**
	 * Constructor de la clase Perro
	 * @param id
	 * @param nombre
	 */
	public Perro(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	/**
	 * Atributos de la clase Perro
	 * 
	 */
	private int id;
	private String nombre;
	/**
	 * Método getId() que se dedica a obtener el identificador (int id) 
	 * de los objetos de la clase perro
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método setId(int id) que se dedica a definir el identificador (int id) 
	 * de los objetos de la clase perro
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Método getNombre() que se dedica a obtener el identificador (int id) 
	 * de los objetos de la clase perro
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método setNombre(String nombre) que se dedica a definir el identificador (int id) 
	 * de los objetos de la clase perro
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
