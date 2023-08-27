package br.com.cmach.empresa.modelos;

public class Estoque extends Funcionarios{
    private boolean permissãoDePegarCarga;

    public boolean isPermissãoDePegarCarga() {
        return permissãoDePegarCarga;
    }

    public void setPermissãoDePegarCarga(boolean permissãoDePegarCarga) {
        this.permissãoDePegarCarga = permissãoDePegarCarga;
    }
}
