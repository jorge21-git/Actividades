public class Llamada {
    public static void main(String[] args) throws Exception {
    
       double llamada=8;
        double coste =0;
        double adicional=0.05;
        
       if (llamada<=3) {
         coste=0.20;
       }
       else{
        double dif=llamada-3;
        coste = 0.20+ (adicional*dif);
        }
       
       
       System.out.println(" El coste de la llamada con duracion de "+llamada+" minutos es de "+coste+" euros ");



    }
}
