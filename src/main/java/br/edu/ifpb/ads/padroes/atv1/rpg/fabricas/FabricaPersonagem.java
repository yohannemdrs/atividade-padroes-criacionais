package br.edu.ifpb.ads.padroes.atv1.rpg.fabricas;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;

public interface FabricaPersonagem {
    Personagem criarPersonagem(String nome, String classe);
    default Personagem criarPersonagemEspecial(String nome, String classe) {
        return criarPersonagem(nome, classe)
                .clone()
                .comNome(nome + " [Especial]");
    }
}
