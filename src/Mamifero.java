public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comprimento, int numPatas, String cor, double velocidade, String alimento) {
        super(nome, comprimento, numPatas, cor, "terra", velocidade);
        this.alimento = alimento;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Alimento: " + alimento);
    }
}