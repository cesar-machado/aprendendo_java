package br.com.cmach.empresa.modelos;

public class Funcionarios {
    private String nome;
    private double salario;
    private String cargo;
    private String setor;
    private boolean licensa;
    private int codigoDoFuncionario;

    public int getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(int codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isLicensa() {
        return licensa;
    }

    public void setLicensa(boolean licensa) {
        this.licensa = licensa;
    }
}
