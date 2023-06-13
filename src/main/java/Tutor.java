public class Tutor implements Pessoa {
    private String cpf;
    private String nome;
    private Animal animal;

    public Tutor(String cpf, String nome, Animal animal) {
        this.cpf = cpf;
        this.nome = nome;
        this.animal = animal;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeAnimal() {
        return this.animal.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirTutor(this);
    }
}
