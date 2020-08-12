package Testes;

import Aulas.Medico;

public class TesteMedico {
    public static void main(String[] args) {
        Medico medico1 = new Medico(12345, "josé", 0, 300);
        Medico medico2 = new Medico(54321, "Carlos", 0, 600);
        Medico medico3 = new Medico(32145, "josue", 0, 500);

        medico1.pagamento();
        medico2.pagamentoPlanoSaude();
        medico3.pagamentoPlanoSaude();

        System.out.println(medico1);
        System.out.println(medico2);
        System.out.println(medico3);
        System.out.println("O total de médicos é: " + Medico.getCont());
    }    
}