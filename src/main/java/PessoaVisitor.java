public class PessoaVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirTutor(Tutor tutor) {
        return "Tutor{" +
                "cpf=" + tutor.getCpf() +
                ", nome='" + tutor.getNome() + '\'' +
                ", animal=" + tutor.getNomeAnimal() +
                '}';
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "cpf=" + cliente.getCpf() +
                ", nome='" + cliente.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
