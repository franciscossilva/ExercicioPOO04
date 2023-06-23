public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, double comprimento, String cor, double velocidade) {
        super(nome, comprimento, 0, cor, "mar", velocidade);
        this.caracteristicas = "Barbatanas e cauda";
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Características: " + caracteristicas);
    }
}