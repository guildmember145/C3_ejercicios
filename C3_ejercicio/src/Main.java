
    public class Main {
        public static void main(String[] args) {
            int resultado = sumar(5,20,50);

            System.out.println(resultado);

            Coche miCoche = new Coche();
            miCoche.CantidadPuertas();

            System.out.println(miCoche.puertas);



}
    public static int sumar(int a, int b, int c) {
            return a+b+c;
    }


}


    class Coche{
        public int puertas = 0;

        public void CantidadPuertas() {
            this.puertas++;
        }
    }
