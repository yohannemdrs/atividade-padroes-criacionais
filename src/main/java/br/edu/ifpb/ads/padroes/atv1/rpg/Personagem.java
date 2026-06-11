package br.edu.ifpb.ads.padroes.atv1.rpg;

public class Personagem implements Cloneable {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    Personagem(String nome, String raca, String classe,
               int forca, int inteligencia, int agilidade,
               int vida, int mana,
               Arma arma, Armadura armadura, String[] habilidades) {
        this.nome         = nome;
        this.raca         = raca;
        this.classe       = classe;
        this.forca        = forca;
        this.inteligencia = inteligencia;
        this.agilidade    = agilidade;
        this.vida         = vida;
        this.mana         = mana;
        this.arma         = arma;
        this.armadura     = armadura;
        this.habilidades  = habilidades;
    }

    @Override
    public Personagem clone() {
        try {
            Personagem clone = (Personagem) super.clone();
            clone.habilidades = this.habilidades.clone(); // deep copy necessário
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Nunca deve ocorrer — implementamos Cloneable", e);
        }
    }

    public Personagem comNome(String novoNome) {
        this.nome = novoNome;
        return this;
    }

    public Personagem comArma(Arma novaArma) {
        this.arma = novaArma;
        return this;
    }

    public Personagem comHabilidadeExtra(String habilidade) {
        String[] novas = new String[habilidades.length + 1];
        System.arraycopy(habilidades, 0, novas, 0, habilidades.length);
        novas[habilidades.length] = habilidade;
        this.habilidades = novas;
        return this;
    }

    public String   getNome()         { return nome; }
    public String   getRaca()         { return raca; }
    public String   getClasse()       { return classe; }
    public int      getForca()        { return forca; }
    public int      getInteligencia() { return inteligencia; }
    public int      getAgilidade()    { return agilidade; }
    public int      getVida()         { return vida; }
    public int      getMana()         { return mana; }
    public Arma     getArma()         { return arma; }
    public Armadura getArmadura()     { return armadura; }
    public String[] getHabilidades()  { return habilidades.clone(); }

    @Override
    public String toString() {
        return String.format(
                "%s - %s %s | F:%d I:%d A:%d V:%d M:%d | %s / %s",
                nome, raca, classe,
                forca, inteligencia, agilidade, vida, mana,
                arma.getNome(), armadura.getNome()
        );
    }
}
