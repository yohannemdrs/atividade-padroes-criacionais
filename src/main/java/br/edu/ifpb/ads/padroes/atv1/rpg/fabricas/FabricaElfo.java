package br.edu.ifpb.ads.padroes.atv1.rpg.fabricas;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.FabricaEquipamentosElfo;


public class FabricaElfo implements FabricaPersonagem {
    private final FabricaEquipamentos fabEquip;

    public FabricaElfo() {
        this.fabEquip = new FabricaEquipamentosElfo();
    }

    public FabricaElfo(FabricaEquipamentos fabEquip) {
        this.fabEquip = fabEquip;
    }

    @Override
    public Personagem criarPersonagem(String nome, String classe) {
        return switch (classe) {
            case "Guerreiro" -> new PersonagemBuilder()
                    .nome(nome).raca("Elfo").classe("Guerreiro")
                    .atributos(12, 14, 16, 100, 60)
                    .equipamentos(fabEquip.criarArmaGuerreiro(), fabEquip.criarArmaduraGuerreiro())
                    .habilidades("Dança das Lâminas", "Agilidade Élfica")
                    .build();

            case "Mago" -> new PersonagemBuilder()
                    .nome(nome).raca("Elfo").classe("Mago")
                    .atributos(4, 20, 14, 70, 180)
                    .equipamentos(fabEquip.criarArmaMago(), fabEquip.criarArmaduraMago())
                    .habilidades("Magia da Natureza", "Teleporte")
                    .build();

            case "Arqueiro" -> new PersonagemBuilder()
                    .nome(nome).raca("Elfo").classe("Arqueiro")
                    .atributos(8, 16, 20, 90, 100)
                    .equipamentos(fabEquip.criarArmaArqueiro(), fabEquip.criarArmaduraArqueiro())
                    .habilidades("Tiro Múltiplo", "Camuflagem")
                    .build();

            default -> throw new IllegalArgumentException(
                    "Classe inválida para Elfo: " + classe);
        };
    }
}
