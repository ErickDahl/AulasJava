package Testes;

import Herenca.Cidade;
import Herenca.Contato;
import Herenca.Endereco;
import Herenca.Estado;
import Herenca.Telefone;

public class TesteContato {
    public static void main(String[] args) {

        Contato contato1 = new Contato("Erick", new Endereco("rui Barbosa", "agriões", "12345", new Cidade("Teresópolis", new Estado("Rio de janeiro", "RJ"))),new Telefone[1]);
        Telefone telefone1 = new Telefone("123456");
        
        contato1.InserirTelefone(telefone1);
        contato1.mostrarTelefones();
    }
}