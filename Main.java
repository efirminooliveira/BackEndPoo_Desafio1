public class Main {
  public static void main(String[] args) {
    Endereco endereco1 = new Endereco("Rua José Moreira da Silva", "344", "Morro do Gama", "Barra do Piraí", "Casa 1");
    Endereco endereco2 = new Endereco("Rua Cristiano Otoni", "129", "Centro", "Barra do Piraí", "Apt. 103");
    Endereco endereco3 = new Endereco("Travessa Alfredo Mansur", "200", "Morro do Gama", "Barra do Piraí", "N/A");

    Pessoa pessoa1 = new Vendedor("Luis", "123.456.789-01", "(24)99812-7162", "Masculino", endereco1);
    Pessoa pessoa2 = new Cliente("Maria", "987.654.321-00", "(24)9945-1625", "Feminino", endereco2);
    Pessoa pessoa3 = new Vendedor("Carlos", "555.666.777-00", "(24)99377-9981", "Masculino", endereco3);

    pessoa1.seApresentar();
    pessoa2.seApresentar();
    pessoa3.seApresentar();
  }
}