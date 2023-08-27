import br.com.cmach.empresa.calculos.CalcularFuncionarios;
import br.com.cmach.empresa.modelos.AnalistasDeTi;
import br.com.cmach.empresa.modelos.Diretoria;
import br.com.cmach.empresa.modelos.Estoque;
import br.com.cmach.empresa.modelos.Funcionarios;

public class MainPessoas {
    public static void main(String[] args) {
        Estoque estoquista1 = new Estoque();
        Estoque estoquista2 = new Estoque();
        Estoque estoquista3 = new Estoque();
        estoquista1.setNome("César ");
        estoquista1.setPermissãoDePegarCarga(true);
        estoquista1.setCodigoDoFuncionario(1);
        estoquista2.setNome("Alison ");
        estoquista2.setPermissãoDePegarCarga(true);
        estoquista2.setCodigoDoFuncionario(2);
        estoquista3.setNome("Dodo ");
        estoquista3.setCodigoDoFuncionario(3);
        estoquista3.setPermissãoDePegarCarga(true);

        Diretoria diretor = new Diretoria();
        diretor.setAtivo(true);
        diretor.setNome("Eloah");
        diretor.setCodigoDoFuncionario(4);

        AnalistasDeTi programador = new AnalistasDeTi();
        programador.setProgramador(true);
        programador.setNome("Elisa");
        programador.setCodigoDoFuncionario(5);

//        System.out.println(estoquista1.getNome() + estoquista2.getNome() + estoquista3.getNome());

        CalcularFuncionarios calculadora = new CalcularFuncionarios();
        calculadora.contando(estoquista1);
        calculadora.contando(estoquista2);
        calculadora.contando(estoquista3);
        calculadora.contando(diretor);
        calculadora.contando(programador);
        System.out.println(calculadora.getFuncionarios());


    }

}
