package br.edu.ifpb.ads.padroes.atv1.rpg;

public final class PersonagemBuilder {
    private String   nome;
    private String   raca;
    private String   classe;
    private int      forca;
    private int      inteligencia;
    private int      agilidade;
    private int      vida;
    private int      mana;
    private Arma     arma;
    private Armadura armadura;
    private String[] habilidades = new String[0];

    public PersonagemBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonagemBuilder raca(String raca) {
        this.raca = raca;
        return this;
    }

    public PersonagemBuilder classe(String classe) {
        this.classe = classe;
        return this;
    }

    public PersonagemBuilder atributos(int forca, int inteligencia,
                                       int agilidade, int vida, int mana) {
        this.forca        = forca;
        this.inteligencia = inteligencia;
        this.agilidade    = agilidade;
        this.vida         = vida;
        this.mana         = mana;
        return this;
    }

    public PersonagemBuilder equipamentos(Arma arma, Armadura armadura) {
        this.arma     = arma;
        this.armadura = armadura;
        return this;
    }

    public PersonagemBuilder habilidades(String... habilidades) {
        this.habilidades = habilidades;
        return this;
    }

    public Personagem build() {
        if (nome == null || nome.isBlank())
            throw new IllegalStateException("Nome do personagem é obrigatório");
        if (raca == null || raca.isBlank())
            throw new IllegalStateException("Raça do personagem é obrigatória");
        if (classe == null || classe.isBlank())
            throw new IllegalStateException("Classe do personagem é obrigatória");
        if (arma == null)
            throw new IllegalStateException("Arma é obrigatória");
        if (armadura == null)
            throw new IllegalStateException("Armadura é obrigatória");

        return new Personagem(
                nome, raca, classe,
                forca, inteligencia, agilidade, vida, mana,
                arma, armadura, habilidades
        );
    }
}
