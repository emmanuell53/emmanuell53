package herenciamultiple2209;

import ico.fes.academia.ProfesorDeProgramacion;

/**
 *
 * @author Emmanuell
 */
public class HerenciaMultiple2209 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProfesorDeProgramacion profe= new ProfesorDeProgramacion(20,"Java","Ico",17,"Jesus",44);
        profe.dormir();
        profe.comer();
        profe.asistir();
        profe.dictarClase();
        profe.programar();
        profe.probarCodigo();
        System.out.println(profe);    
    }
    
}
