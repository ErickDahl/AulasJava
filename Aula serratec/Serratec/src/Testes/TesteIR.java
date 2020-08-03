package Testes;

import Herenca.PessoaFisica;
import Herenca.PessoaJuridica;

public class TesteIR {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Erick", 10000, "123456", "12345678");

        System.out.println(pf.getNome() + " " + pf.getRendimento() + " " + pf.getCpf() + " " + pf.getRg());
        System.out.println("Valor de desconto do rendimento: " + pf.CalculoIr());

        PessoaJuridica pj = new PessoaJuridica("JeanStore", 10000, "1234567", "12345678");

        System.out.println(pj.getNome() + " " + pj.getRendimento() + " " + pj.getCnpj() + " " + pj.getInscEstadual());
        System.out.println("Valor de desconto do rendimento: " + pj.CalculoIr());
    }
}