public class Carro {
    String modelo;
    String marca;
    int ano;
    String cor;
    double preco;
    boolean ligado;
    double velocidadeAtual;
    double combustivel;

    public Carro() {
        this.modelo = "SW4";
        this.marca = "Toyota Motor";
        this.ano = 2024;
        this.cor = "preto";
        this.preco = 379.990;
        this.ligado = false;
        this.velocidadeAtual = 0.0;
        this.combustivel = 80.0;
    }

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = "Preto";
        this.preco = 379.990;
        this.ligado = false;
        this.velocidadeAtual = 0.0;
        this.combustivel = 80.0;
    }

    public Carro(String modelo, String marca, int ano, String cor, double preco, boolean ligado, double velocidadeAtual, double combustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.ligado = ligado;
        this.velocidadeAtual = velocidadeAtual;
        this.combustivel = combustivel;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        ligado = false;
        velocidadeAtual = 0;
        System.out.println("Carro desligado.");
    }

    public void acelerar(double velocidade) {
        if (ligado) {
            velocidadeAtual += velocidade;
            System.out.println("Carro acelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Carro está desligado. Não pode acelerar.");
        }
    }

    public void frear() {
        if (ligado && velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            System.out.println("Carro desacelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void abastecer(double litros) {
        combustivel += litros;
        System.out.println("Carro abastecido com " + litros + " litros.");
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Ligado: " + ligado);
    }

    public void alterarPreco(double novoPreco) {
        preco = novoPreco;
        System.out.println("Novo preço do carro: " + preco);
    }
}