package br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaEquipamentosElfo implements FabricaEquipamentos {
    @Override public Arma criarArmaGuerreiro()       { return new Arma("Lâmina Élfica", 22, "Espada"); }
    @Override public Arma criarArmaMago()             { return new Arma("Cajado da Natureza", 18, "Cajado"); }
    @Override public Arma criarArmaArqueiro()         { return new Arma("Arco Longo Élfico", 28, "Arco"); }

    @Override public Armadura criarArmaduraGuerreiro(){ return new Armadura("Cota de Malha Élfica", 15, "Média"); }
    @Override public Armadura criarArmaduraMago()     { return new Armadura("Mantos Élficos", 10, "Leve"); }
    @Override public Armadura criarArmaduraArqueiro() { return new Armadura("Armadura de Couro Élfico", 14, "Média"); }
}
