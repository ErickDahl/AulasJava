package Herenca;

public class Contato {
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;

    public Contato(String nome, Endereco endereco, Telefone[] telefones) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void InserirTelefone(Telefone telefone) {
        for (int i = 0; i < telefones.length; i++) {
            if (telefones[i] == null) {
                telefones[i] = telefone;
                return;
            }
        }
    }

    public void mostrarTelefones() {
        for (int i = 0; i < telefones.length; i++) {
            System.out.println(telefones[i].getNumero());
        }
    }
}