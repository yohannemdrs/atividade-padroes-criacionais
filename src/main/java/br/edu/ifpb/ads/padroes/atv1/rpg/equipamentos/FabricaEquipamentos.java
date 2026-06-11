package br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public interface FabricaEquipamentos {
    Arma criarArmaGuerreiro();
    Arma     criarArmaMago();
    Arma     criarArmaArqueiro();
    Armadura criarArmaduraGuerreiro();
    Armadura criarArmaduraMago();
    Armadura criarArmaduraArqueiro();
}
