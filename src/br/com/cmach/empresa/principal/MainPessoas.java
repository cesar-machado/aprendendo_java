package br.com.cmach.empresa.principal;

import br.com.cmach.empresa.calculos.CalcularFuncionarios;
import br.com.cmach.empresa.modelos.AnalistasDeTi;
import br.com.cmach.empresa.modelos.Diretoria;
import br.com.cmach.empresa.modelos.Estoque;

public class MainPessoas {
    public static void main(String[] args) {
        Estoque estoquista1 = new Estoque("César ", "Estoquista");
        Estoque estoquista2 = new Estoque("César ", "Estoquista");
        Estoque estoquista3 = new Estoque("César ", "Estoquista");

        estoquista1.setPermissaoDePegarCarga(true);
        estoquista1.setCodigoDoFuncionario(1);

        estoquista2.setPermissaoDePegarCarga(true);
        estoquista2.setCodigoDoFuncionario(2);

        estoquista3.setCodigoDoFuncionario(3);
        estoquista3.setPermissaoDePegarCarga(true);

        Diretoria diretor = new Diretoria("Eloah", "ceo");
        diretor.setAtivo(true);
        diretor.setCodigoDoFuncionario(4);

        AnalistasDeTi programador = new AnalistasDeTi("Elisa", "programador");
        programador.setProgramador(true);
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
