package br.ufjf.dcc193.henriquecardoso.quest;

public class Missao {
    private Cavaleiro cavaleiro;
    public Missao(){
        System.out.println("O Rei criou uma nova missão!");
        this.cavaleiro = new Cavaleiro();

    }

    public void iniciar(){
        System.out.println("A missão teve início");
    }
    public void concluir(){
        cavaleiro.agir();
        System.out.println("A missão chegou ao fim");
    }

}
