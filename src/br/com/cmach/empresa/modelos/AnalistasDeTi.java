package br.com.cmach.empresa.modelos;

public class AnalistasDeTi extends Funcionarios {
    private boolean programador;

    public boolean isProgramador() {
        return programador;
    }

    public void setProgramador(boolean programador) {
        this.programador = programador;
    }
}
