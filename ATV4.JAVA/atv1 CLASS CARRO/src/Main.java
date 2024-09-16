public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.mostrarInformacoes();
        carro1.ligar();
        carro1.acelerar(50);
        carro1.frear();
        carro1.desligar();

        Carro carro2 = new Carro("Al Capone Cadillac", "Cadillac", 1928);
        carro2.mostrarInformacoes();
        carro2.abastecer(50);
        carro2.ligar();
        carro2.acelerar(80);
        carro2.alterarPreco(1000000);
    }
}