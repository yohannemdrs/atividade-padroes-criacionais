package br.edu.ifpb.ads.padroes.atv1.rpg;

public final class Arma {

    private String nome;
    private int dano;
    private String tipo;

    public Arma(String nome, int dano, String tipo) {
        this.nome = nome;
        this.dano = dano;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Dano: %d, Tipo: %s", nome, dano, tipo);
    }
}
