public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligado);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligado);

        smartTv.desligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligado);

        smartTv.mudarCanal(30);
        System.out.println("Novo status -> Canal: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume: " + smartTv.volume);
    }
}
