package br.com.cmach.empresa.modelos;

public class Diretoria extends Funcionarios {
    private boolean ceo;

    private boolean ativo;

    public Diretoria(String nome, String cargo) {
        super(nome, cargo);
    }

    public boolean isCeo() {
        return ceo;
    }

    public void setCeo(boolean ceo) {
        this.ceo = ceo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
