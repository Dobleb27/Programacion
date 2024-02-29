package programacion;

public class Carrera {
    
    private int numeroDeVueltas, kmTotales;
    private programacion.Coche corredor2;
    private programacion.Coche corredor1;
    private programacion.Coche ganador;
    

  

    Carrera(programacion.Coche participante1, programacion.Coche participante2, int numeroDeVueltas, int kmTotales){
        this.numeroDeVueltas=numeroDeVueltas;
        this.kmTotales=kmTotales;
        this.corredor1 = participante1;
        this.corredor2 = participante2;
        
    }
        
        
    public void inicializarCarrera(){

        System.out.println("Participante1");
        corredor1.datosParticipante();
        System.out.println("Participante2");
        corredor2.datosParticipante();
        System.out.println("La carrera va a empezar, el circuito tiene las siguientes caracteristicas " + numeroDeVueltas + " vueltas y " + kmTotales + "km." );

        for (int i = 0; i < numeroDeVueltas; i++) {
            corredor1.acelerar(kmTotales);
            corredor2.acelerar(kmTotales);

            if (corredor1.getKmRecorridos() >= kmTotales || corredor2.getKmRecorridos() >= kmTotales) {
                break;
            }
        }

        if (corredor1.getKmRecorridos() >= kmTotales) {
            ganador = corredor1;
        } else if (corredor2.getKmRecorridos() >= kmTotales) {
            ganador = corredor2;
        }

        System.out.println("El ganador ha sido el coche con matrícula: " + ganador.getmatricula());
    }   
        
    
    
}

        
            


    

    

    




