package Aulas;

public class Medico {
    private int crm;
    private String nome;
    private double salario;
    private double valorConsulta;
    private static int cont;
    
    public Medico(int crm, String nome, double salario, double valorConsulta) {
        super();
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorConsulta = valorConsulta;
        cont++;
    }

    public void pagamento(){
        salario += valorConsulta;
    }

    public void pagamentoPlanoSaude(){
        salario += valorConsulta * 0.7;
    }

    public static int getCont() {
        return cont;
    }

    @Override
    public String toString() {
        
        return "Médico " + "Crm: " + crm + " Nome: " + nome + " Salário: " + salario + " Valor da Consulta: " + valorConsulta; 
    }
}