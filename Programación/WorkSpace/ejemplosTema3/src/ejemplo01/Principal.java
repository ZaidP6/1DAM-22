package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alum1 = new Alumno("Zaid",24,8.36,false);
		
		Alumno alum2 =  new Alumno("Garfil", 19, 7.3, true);
		
		Alumno alum3 =  new Alumno("Acosta", 21, 5.2, false);
		
		System.out.println("El nombre es: "+alum1.nombre+"y la edad es: "+alum1.edad+"años, la nota media es "+alum1.mediaNotas+". ¿Es repetidor? "+alum1.repetidor);
		
		
		
	}

}
