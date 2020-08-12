package Herenca;

public class Time {
    private String nome;
    private String tecnico;
    private Atleta[] atletas;

    public Time(String nome, String tecnico, Atleta[] atletas) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = atletas;
    }

    @Override
    public String toString() {
        return  "Nome=" + nome + " Técnico=" + tecnico;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    public void adicionaAtleta(Atleta atleta){
        for(int i = 0; i < atletas.length; i++){
            if(atletas[i] == null){
                atletas[i] = atleta;
                return;
            }
        }
    }

    public void mostrarAtletas(){
        for(int i = 0; i < atletas.length; i++){
            System.out.println(atletas[i].getNome());
        }
    }
   
}