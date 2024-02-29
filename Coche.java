package programacion;

public class Coche {

    private String marca, modelo, matricula;
    private int cv, cc, velocidad;
    private double kmRecorridos;
    
    


   Coche (String marca, String modelo, String matricula,int cv,int cc, int velocidad){
      this.marca=marca;
      this.modelo=modelo;
      this.matricula=matricula;
      this.cv=cv;
      this.cc=cc;
      this.velocidad= 0;
      this.kmRecorridos= 0;

   }


   public void datosParticipante (){

      System.out.println("Marca: " + marca);
      System.out.println("Modelo: " + modelo);
      System.out.println("CV: " + cv);
      System.out.println("CC: " + cc);
      System.out.println("Matrícula: " + matricula);
      System.out.println("Velocidad: " + velocidad);
      System.out.println("Km Recorridos: " + kmRecorridos);
            
   }

   public void acelerar(double velocidadAcelerar) {
      double velocidadIncremento;
      if (this.cv < 100) {
          velocidadIncremento = (Math.random() * velocidadAcelerar);
      } else {
          velocidadIncremento = (Math.random() * velocidadAcelerar) + 10;
      }
      this.velocidad += velocidadIncremento;
      this.kmRecorridos += velocidadIncremento * 0.5;
   }

   public double getKmRecorridos(){
      return this.kmRecorridos;

   }
   public String getmatricula(){
      return this.matricula;
   }
 
}
    

