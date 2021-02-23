/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public class Profesor extends Persona {
	
	private String correo;
	private int experiencia;
	private double salario;


	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * 
	 */
	public Profesor(String nombre, int cedula, int edad,String correo, int experiencia, double salario) {
		super();
		super.nombre= nombre;
		super.cedula= cedula;
		super.edad= edad;
		this.correo = correo;
		this.experiencia = experiencia;
		this.salario = salario;		
		// TODO Auto-generated constructor stub
	}

	public void planear() {
		System.out.println("Estoy planeando");
	}
	
	public void darclases() {
		System.out.println("Dando clases");
	}
	
	public void revisando() {
		System.out.println("Estoy revisando tarea");
	}
	
	@Override
	public String toString() {
		return "El profesor tiene esta informacion:" + "correo=" + " "+ correo + " "+ "experiencia=" + " "+ experiencia + " "+ "salario=" + " "+ salario + " "+ "nombre="
				+ " "+ nombre + " "+ "cedula=" + " "+ cedula + " "+ "edad=" + " "+ edad;
	}

	

}
