package br.edu.ifpb.ads.padroes.atv1.rpg.fabricas;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.FabricaEquipamentosHumano;

public class FabricaHumano implements FabricaPersonagem{
    private final FabricaEquipamentos fabEquip;

    public FabricaHumano() {
        this.fabEquip = new FabricaEquipamentosHumano();
    }

    public FabricaHumano(FabricaEquipamentos fabEquip) {
        this.fabEquip = fabEquip;
    }

    @Override
    public Personagem criarPersonagem(String nome, String classe) {
        return switch (classe) {
            case "Guerreiro" -> new PersonagemBuilder()
                    .nome(nome).raca("Humano").classe("Guerreiro")
                    .atributos(15, 8, 10, 120, 30)
                    .equipamentos(fabEquip.criarArmaGuerreiro(), fabEquip.criarArmaduraGuerreiro())
                    .habilidades("Investida", "Bloqueio")
                    .build();

            case "Mago" -> new PersonagemBuilder()
                    .nome(nome).raca("Humano").classe("Mago")
                    .atributos(6, 18, 8, 80, 150)
                    .equipamentos(fabEquip.criarArmaMago(), fabEquip.criarArmaduraMago())
                    .habilidades("Bola de Fogo", "Cura")
                    .build();

            case "Arqueiro" -> new PersonagemBuilder()
                    .nome(nome).raca("Humano").classe("Arqueiro")
                    .atributos(10, 12, 16, 100, 70)
                    .equipamentos(fabEquip.criarArmaArqueiro(), fabEquip.criarArmaduraArqueiro())
                    .habilidades("Tiro Certeiro", "Chuva de Flechas")
                    .build();

            default -> throw new IllegalArgumentException(
                    "Classe inválida para Humano: " + classe);
        };
    }

    @Override
    public Personagem criarPersonagemEspecial(String nome, String classe) {
        Personagem base = criarPersonagem(nome, classe);

        if ("Guerreiro".equals(classe)) {
            return base.clone()
                    .comNome(nome + " o Lendário")
                    .comArma(new Arma("Excalibur", 35, "Espada"))
                    .comHabilidadeExtra("Liderança");
        }

        return base;
    }
}
