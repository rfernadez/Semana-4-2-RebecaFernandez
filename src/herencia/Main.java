/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vegetal vege1= new Vegetal("Maceta", 100, "flores");
		vege1.mostrarse();
		vege1.setTipo("arbusto");
		System.out.println(vege1.toString());
		
		Arbol arb1= new Arbol("Manzano", 1500, "Manzanas", "El romero", "Manzanus", 20);
		arb1.florear();
		arb1.setMarca("La Arboleda");
		System.out.println(arb1.toString());
		
		Arbusto arbus1= new Arbusto("Cipres", 5000, "semillas", "El romero", "Cipresus", 100);
		arbus1.desaparecer();
		arbus1.setCantidadhojas(200);
		System.out.println(arbus1.toString());
		
		Vehiculo veh1= new Vehiculo("Hyundai", 2012, "Azul");
		veh1.acelerando();
		veh1.setColor("Negro");
		System.out.println(veh1.toString());
		
		Coche coch1= new Coche("Toyota", 2012, "Azul", "Doble traccion", 1500, "Gasolina");
		coch1.detenido();
		coch1.setAtributo3("Diesel");
		System.out.println(coch1.toString());
		
		Bici bici1= new Bici("Giant", 2020, "Gris", "MTB", "Cross", "Negro");
		bici1.frenar();
		bici1.setTiporuedas("pista");
		System.out.println(bici1.toString());
		
		Profesor profe1= new Profesor("Juan", 113080544, 34, "prueba@gmail.com", 5, 2020.2);
		profe1.darclases();
		profe1.setExperiencia(10);
		System.out.println(profe1.toString());
		
		Estudiante estud1= new Estudiante("Pedro", 1154587, 40, "Maria", "Perez", 10);
		estud1.estudiando();
		estud1.setNivel(6);
		System.out.println(estud1.toString());
		
		//polimorfismo
		
		Persona profe= new Profesor("Pablo", 52365584, 50, "prueba1@gmail.com", 15, 5000.2);
		profe.divertir();
		
		Objetoinerte coche= new Coche("Audi", 2021, "gris", "Deportivo", 2000, "Descapotable");	
		coche.mover();
	}
		
}
