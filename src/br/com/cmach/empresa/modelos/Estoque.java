package br.com.cmach.empresa.modelos;

public class Estoque extends Funcionarios{
    private boolean permissaoDePegarCarga;

    public Estoque(String nome, String cargo) {
        super(nome, cargo);
    }

    public boolean isPermissãoDePegarCarga() {
        return permissaoDePegarCarga;
    }

    public void setPermissaoDePegarCarga(boolean permissãoDePegarCarga) {
        this.permissaoDePegarCarga = permissãoDePegarCarga;
    }

    @Override
    public String toString() {
        return "Funcionários: " + this.getNome() + " (" + this.getCargo() + ")";
    }
}
