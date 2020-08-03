package Testes;

import Aulas.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
           Pessoa pessoa1 = new Pessoa();
           Pessoa pessoa2 = new Pessoa();

           pessoa1.setIdPessoa(1);
           pessoa1.setNome("Erick");
           pessoa1.setPeso(53);
           pessoa1.setAltura(1.70);

           pessoa2.setIdPessoa(2);
           pessoa2.setNome("Tainara");
           pessoa2.setPeso(54);
           pessoa2.setAltura(1.55);

           System.out.println(pessoa1.getNome() + " " + pessoa1.getPeso() + " " + pessoa1.getAltura() + " " + pessoa1.MostraImc());
           System.out.println(pessoa2.getNome() + " " + pessoa2.getPeso() + " " + pessoa2.getAltura() + " " + pessoa2.MostraImc());
    }
}