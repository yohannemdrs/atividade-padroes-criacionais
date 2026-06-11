package br.edu.ifpb.ads.padroes.atv1.rpg.fabricas;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.FabricaEquipamentosOrc;

public class FabricaOrc implements FabricaPersonagem{
    private final FabricaEquipamentos fabEquip;

    public FabricaOrc() {
        this.fabEquip = new FabricaEquipamentosOrc();
    }

    public FabricaOrc(FabricaEquipamentos fabEquip) {
        this.fabEquip = fabEquip;
    }

    @Override
    public Personagem criarPersonagem(String nome, String classe) {
        return switch (classe) {
            case "Guerreiro" -> new PersonagemBuilder()
                    .nome(nome).raca("Orc").classe("Guerreiro")
                    .atributos(20, 6, 8, 150, 20)
                    .equipamentos(fabEquip.criarArmaGuerreiro(), fabEquip.criarArmaduraGuerreiro())
                    .habilidades("Fúria", "Pancada Devastadora")
                    .build();

            case "Mago" -> new PersonagemBuilder()
                    .nome(nome).raca("Orc").classe("Mago")
                    .atributos(10, 14, 6, 100, 120)
                    .equipamentos(fabEquip.criarArmaMago(), fabEquip.criarArmaduraMago())
                    .habilidades("Magia Sombria", "Invocação")
                    .build();

            case "Arqueiro" -> new PersonagemBuilder()
                    .nome(nome).raca("Orc").classe("Arqueiro")
                    .atributos(14, 8, 12, 120, 40)
                    .equipamentos(fabEquip.criarArmaArqueiro(), fabEquip.criarArmaduraArqueiro())
                    .habilidades("Tiro Brutal", "Intimidação")
                    .build();

            default -> throw new IllegalArgumentException(
                    "Classe inválida para Orc: " + classe);
        };
    }
}
