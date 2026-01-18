public class Llamada {
    public static void main(String[] args) throws Exception {
    
       double llamada=8;
        double coste =0;
        double adicional=0;


       if (llamada<3) {
         coste=0.20;
       }
       else{
        for(int i=0;i<llamada+1;i++){
            coste=0.20;
            if (i>3) {
                adicional=adicional+0.05;
            }
        }
         
       }
       coste = coste + adicional;
       System.out.println(" El coste de la llamada con duracion de "+llamada+" minutos es de "+coste+" euros ");



    }
}
