public class Main{
    public static void main(String[]args){
        //Declaro mis variables
        // POBLACIONDEZOMBIE INICIA DESDE 10 ZOMBIE
        int poblacionZombies = 10;
        int poblacionActual = poblacionZombies;
        //VARIABLE DESDE EL DIA DE INICIO Y QUE TRANSCURRE
        int diasTranscurridos = 0;
        
        //VEMOS POR LA CONSOLA CUANTOS ZOMBIES TENEMOS DESDE EL COMIENZO
        System.out.println(poblacionZombies);
        
        //DECLARAMOS MI LOOP WHILE
        //POBLACIONACTUAL ES <1000
        // INCREMENTAMO ++ DIASTRANSCURRIDO
        
        while(poblacionActual < 1000){
            diasTranscurridos++;
        
        //DEVUELVE NUMERO ALEATORIOS DE ZOMBIES CON LA SUMA DEL 1% DE CADA DIA
            double crecimiento = (Math.random() * 99 ) +1;

            // LA POBLACION CRECE EL 100%
            poblacionActual += (int) (poblacionActual * (crecimiento / 100) );

            //HACEMOS UN PRINT Y CONCATENAMOS DIASTRANSCURRIDOS Y POBLACION ACTUAL
            System.out.println("Día número " +  diasTranscurridos  + ": La poblacion de zombis " + poblacionActual );

        }
        System.out.println("Se necesito " + diasTranscurridos + " días para alcanzar 1000 zombis.");

        System.out.println("vamos a morir!!! :c ");
    }
}