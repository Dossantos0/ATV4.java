public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João de Arievacuxe", 25, "123.456.789-00", "São Cipris, Rua A, 123", "11999999999", "joaoA@mail.com", 1.75, 70.5, "Brasileiro", "Masculino");
        Pessoa pessoa2 = new Pessoa("Maria de Padilha", 30, "987.654.321-00", " Cohab 1,Rua B, 456", "11988888888", "mariaP@mail.com", 1.65, 60.0, "Brasileira", "Feminino");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Peso: " + pessoa1.getPeso());
        System.out.println("Nacionalidade: " + pessoa1.getNacionalidade());
        System.out.println("Gênero: " + pessoa1.getGenero());

        System.out.println("\nNome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("CPF: " + pessoa2.getCpf());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Telefone: " + pessoa2.getTelefone());
        System.out.println("Email: " + pessoa2.getEmail());
        System.out.println("Altura: " + pessoa2.getAltura());
        System.out.println("Peso: " + pessoa2.getPeso());
        System.out.println("Nacionalidade: " + pessoa2.getNacionalidade());
        System.out.println("Gênero: " + pessoa2.getGenero());
    }
}