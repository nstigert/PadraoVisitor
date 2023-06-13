import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirTutor() {
        Tutor tutor = new Tutor("11111111111", "Nathalia", new Animal("Marie"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Tutor{cpf=11111111111, nome='Nathalia', animal=Marie}", visitor.exibir(tutor));
    }

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente("22222222222", "Marco");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cliente{cpf=22222222222, nome='Marco'}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }
}