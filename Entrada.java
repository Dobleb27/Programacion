package programacion;

public class Entrada {

 public static void main(String[] args) {
    
  programacion.Coche corredor1 = new programacion.Coche("opel", "gsi", "000gsi", 16,1600, 0);
  programacion.Coche corredor2 = new programacion.Coche("bmw", "m1", "0003m1", 180, 2400, 0);

  programacion.Carrera gp = new programacion.Carrera(corredor1, corredor2, 20, 5000);

  
  
  gp.inicializarCarrera();
  
 }
 
    
}
