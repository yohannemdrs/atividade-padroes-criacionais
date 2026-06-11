package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public final class ConfiguracaoJogo {

    private volatile static ConfiguracaoJogo instancia;

    private int     nivelDificuldade = 1;
    private boolean modoDebug        = false;
    private String  versaoJogo       = "1.0.0";
    private int     maxPersonagens   = 4;

    private ConfiguracaoJogo() {}

    public static ConfiguracaoJogo getInstance() {
        if (instancia == null) {
            synchronized (ConfiguracaoJogo.class) {
                if (instancia == null) {
                    instancia = new ConfiguracaoJogo();
                }
            }
        }
        return instancia;
    }

    public int     getNivelDificuldade() { return nivelDificuldade; }
    public boolean isModoDebug()         { return modoDebug; }
    public String  getVersaoJogo()       { return versaoJogo; }
    public int     getMaxPersonagens()   { return maxPersonagens; }

    public void setNivelDificuldade(int nivel) {
        if (nivel < 1 || nivel > 5)
            throw new IllegalArgumentException("Nível deve ser entre 1 e 5");
        this.nivelDificuldade = nivel;
    }

    public void setModoDebug(boolean modoDebug)   { this.modoDebug = modoDebug; }
    public void setMaxPersonagens(int max)         { this.maxPersonagens = max; }

    @Override
    public String toString() {
        return String.format("ConfiguracaoJogo[nivel=%d, debug=%b, versao=%s]",
                nivelDificuldade, modoDebug, versaoJogo);
    }
}
