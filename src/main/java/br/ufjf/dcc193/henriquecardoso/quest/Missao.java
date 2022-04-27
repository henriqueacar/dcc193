package br.ufjf.dcc193.henriquecardoso.quest;

public class Missao {
    private Cavaleiro cavaleiro;
    public Missao(Cavaleiro cavaleiro){
        System.out.println("O Rei criou uma nova missão!");
        setCavaleiro(cavaleiro);

    }
    public Missao(){
        this(null);

    }

    public void iniciar(){
        System.out.println("A missão teve início");
    }
    public void concluir(){
        cavaleiro.agir();
        System.out.println("A missão chegou ao fim");
    }
    public Cavaleiro getCavaleiro() {
        return cavaleiro;
    }
    public void setCavaleiro(Cavaleiro cavaleiro) {
        this.cavaleiro = cavaleiro;
    }

}
