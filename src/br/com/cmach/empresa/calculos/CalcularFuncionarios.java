package br.com.cmach.empresa.calculos;

import br.com.cmach.empresa.modelos.Funcionarios;

public class CalcularFuncionarios {
    private int funcionarios;

    public int getFuncionarios() {
        return funcionarios;
    }

    public void contando(Funcionarios funcionario) {
        this.funcionarios += funcionario.getCodigoDoFuncionario();

    }
}
