package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabricas.FabricaElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabricas.FabricaHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabricas.FabricaOrc;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabricas.FabricaPersonagem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste de configuração - Singleton ");
        ConfiguracaoJogo config = ConfiguracaoJogo.getInstance();
        config.setNivelDificuldade(3);
        System.out.println(config);

        ConfiguracaoJogo outraRef = ConfiguracaoJogo.getInstance();
        if (config != outraRef) {
            throw new IllegalStateException("FALHA: Singleton retornou instâncias diferentes!");
        }
        System.out.println("Intâncias iguais? Sim!\n");

        System.out.println("Testando as fábricas de personagens");

        FabricaPersonagem fabHumano = new FabricaHumano();
        FabricaPersonagem fabElfo   = new FabricaElfo();
        FabricaPersonagem fabOrc    = new FabricaOrc();

        Personagem guerreiroHumano = fabHumano.criarPersonagem("Arthur", "Guerreiro");
        Personagem magoElfo        = fabElfo.criarPersonagem("Legolas", "Mago");
        Personagem arqueiroOrc     = fabOrc.criarPersonagem("Gruk", "Arqueiro");

        System.out.println(guerreiroHumano);
        System.out.println(magoElfo);
        System.out.println(arqueiroOrc);

        System.out.println("\nTestando Prototype");

        Personagem especialHumano = fabHumano.criarPersonagemEspecial("Arthur", "Guerreiro");
        System.out.println(especialHumano);
        System.out.println("Habilidades: " + Arrays.toString(especialHumano.getHabilidades()));

        Personagem especialElfo = fabElfo.criarPersonagemEspecial("Thranduil", "Mago");
        System.out.println(especialElfo);

        Personagem base  = fabOrc.criarPersonagem("Gruk", "Guerreiro");
        Personagem clone = base.clone().comNome("Gruk o Brutal").comHabilidadeExtra("Sede de Sangue");
        System.out.println("\nOriginal : " + base.getNome()  + " | habs: " + Arrays.toString(base.getHabilidades()));
        System.out.println("Clone    : " + clone.getNome() + " | habs: " + Arrays.toString(clone.getHabilidades()));
    }
}
