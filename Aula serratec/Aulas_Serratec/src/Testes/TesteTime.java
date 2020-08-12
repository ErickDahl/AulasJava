package Testes;

import Herenca.Atleta;
import Herenca.Time;

public class TesteTime {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Erick", 21, "ataque");
        Atleta atleta2 = new Atleta("Jean", 20, "defesa");
        Atleta atleta3 = new Atleta("Jorginho", 22, "meio");

        Time time1 = new Time("Kabum", "Tixinha", new Atleta[3]);

        time1.adicionaAtleta(atleta1);
        time1.adicionaAtleta(atleta2);
        time1.adicionaAtleta(atleta3);

        time1.mostrarAtletas();

    }
}