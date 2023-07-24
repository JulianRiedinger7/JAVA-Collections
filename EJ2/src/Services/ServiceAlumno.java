package Services;

import Entities.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceAlumno {

    private Scanner input;
    private List<Alumno> alumnosList;

    public ServiceAlumno() {
        this.alumnosList = new ArrayList();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }


    public List<Alumno> getAlumnosList() {
        return alumnosList;
    }

    public void crearAlumno() {
        char opcion;
        do {
            Alumno a = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            a.setNombre(input.next());

            List<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i+1) + " del alumno " + a.getNombre());
                notas.add(input.nextInt());
            }
            a.setNotas(notas);

            alumnosList.add(a);

            System.out.println("Quiere ingresar otro alumno? S/N");
            opcion = input.next().toUpperCase().charAt(0);
        } while (opcion == 'S');
    }

    public double notaFinal(String nombreAlumno) {
        double promedio = 0;
        boolean encontrado = false;

        for (Alumno alumno: alumnosList) {
            if(alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                for (Integer nota: alumno.getNotas()) {
                    promedio += nota;
                }
                promedio /= alumno.getNotas().size();
                encontrado = true;
                break;
            }
        }

        if(!encontrado) System.out.println("Alumno no encontrado");

        return promedio;
    }
}
