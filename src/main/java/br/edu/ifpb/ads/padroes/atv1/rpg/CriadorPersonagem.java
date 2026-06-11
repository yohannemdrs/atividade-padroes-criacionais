package br.edu.ifpb.ads.padroes.atv1.rpg;

public class CriadorPersonagem {

    public static Personagem criarPersonagem(String nome, String raca, String classe) {

        int forca = 0, inteligencia = 0, agilidade = 0, vida = 0, mana = 0;
        Arma arma = null;
        Armadura armadura = null;
        String[] habilidades = null;

        if (raca.equals("Humano")) {
            if (classe.equals("Guerreiro")) {
                forca = 15;
                inteligencia = 8;
                agilidade = 10;
                vida = 120;
                mana = 30;

                arma = new Arma("Espada de Ferro", 25, "Espada");
                armadura = new Armadura("Armadura de Placas", 20, "Pesada");
                habilidades = new String[]{"Investida", "Bloqueio"};

            } else if (classe.equals("Mago")) {
                forca = 6;
                inteligencia = 18;
                agilidade = 8;
                vida = 80;
                mana = 150;
                arma = new Arma("Cajado Mágico", 15, "Cajado");
                armadura = new Armadura("Vestes Mágicas", 8, "Leve");
                habilidades = new String[]{"Bola de Fogo", "Cura"};

            } else if (classe.equals("Arqueiro")) {
                forca = 10;
                inteligencia = 12;
                agilidade = 16;
                vida = 100;
                mana = 70;
                arma = new Arma("Arco Élfico", 20, "Arco");
                armadura = new Armadura("Armadura de Couro", 12, "Média");
                habilidades = new String[]{"Tiro Certeiro", "Chuva de Flechas"};
            }

        } else if (raca.equals("Elfo")) {
            if (classe.equals("Guerreiro")) {
                forca = 12;
                inteligencia = 14;
                agilidade = 16;
                vida = 100;
                mana = 60;
                arma = new Arma("Lâmina Élfica", 22, "Espada");
                armadura = new Armadura("Cota de Malha Élfica", 15, "Média");
                habilidades = new String[]{"Dança das Lâminas", "Agilidade Élfica"};

            } else if (classe.equals("Mago")) {
                forca = 4;
                inteligencia = 20;
                agilidade = 14;
                vida = 70;
                mana = 180;
                arma = new Arma("Cajado da Natureza", 18, "Cajado");
                armadura = new Armadura("Mantos Élficos", 10, "Leve");
                habilidades = new String[]{"Magia da Natureza", "Teleporte"};

            } else if (classe.equals("Arqueiro")) {
                forca = 8;
                inteligencia = 16;
                agilidade = 20;
                vida = 90;
                mana = 100;
                arma = new Arma("Arco Longo Élfico", 28, "Arco");
                armadura = new Armadura("Armadura de Couro Élfico", 14, "Média");
                habilidades = new String[]{"Tiro Múltiplo", "Camuflagem"};
            }

        } else if (raca.equals("Orc")) {
            if (classe.equals("Guerreiro")) {
                forca = 20;
                inteligencia = 6;
                agilidade = 8;
                vida = 150;
                mana = 20;
                arma = new Arma("Machado de Guerra", 30, "Machado");
                armadura = new Armadura("Armadura Brutal", 25, "Pesada");
                habilidades = new String[]{"Fúria", "Pancada Devastadora"};

            } else if (classe.equals("Mago")) {
                forca = 10;
                inteligencia = 14;
                agilidade = 6;
                vida = 100;
                mana = 120;
                arma = new Arma("Cajado Tribal", 12, "Cajado");
                armadura = new Armadura("Vestes Xamânicas", 6, "Leve");
                habilidades = new String[]{"Magia Sombria", "Invocação"};

            } else if (classe.equals("Arqueiro")) {
                forca = 14;
                inteligencia = 8;
                agilidade = 12;
                vida = 120;
                mana = 40;
                arma = new Arma("Arco de Osso", 24, "Arco");
                armadura = new Armadura("Couro de Besta", 16, "Média");
                habilidades = new String[]{"Tiro Brutal", "Intimidação"};
            }
        }

        if (arma == null) {
            System.out.println("Combinação inválida: " + raca + " " + classe);
            return null;
        }

        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade,
                vida, mana, arma, armadura, habilidades);
    }

    public static Personagem criarPersonagemEspecial(String nome, String raca, String classe) {
        Personagem base = criarPersonagem(nome, raca, classe);
        if (base == null) return null;

        if (raca.equals("Humano") && classe.equals("Guerreiro")) {
            return new Personagem(nome + " o Lendário", raca, classe,
                    18, 10, 12, 140, 40,
                    new Arma("Excalibur", 35, "Espada"),
                    new Armadura("Armadura do Rei", 30, "Pesada"),
                    new String[]{"Investida", "Bloqueio", "Liderança"});
        }

        return base;
    }

}
