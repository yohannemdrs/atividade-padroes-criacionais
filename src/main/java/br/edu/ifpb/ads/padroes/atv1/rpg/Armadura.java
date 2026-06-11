package br.edu.ifpb.ads.padroes.atv1.rpg;

public final class Armadura {

    private String nome;
    private int defesa;
    private String tipo;

    public Armadura(String nome, int defesa, String tipo) {
        this.nome = nome;
        this.defesa = defesa;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public int getDefesa() {
        return defesa;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format("%s (%d defesa, %s)", nome, defesa, tipo);    }

}
