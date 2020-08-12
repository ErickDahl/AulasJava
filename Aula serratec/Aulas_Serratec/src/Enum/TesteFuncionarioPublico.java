package Enum;

public class TesteFuncionarioPublico {
    public static void main(String[] args) {
        FuncionarioPublico funcionario1 = new FuncionarioPublico("Erick", 1000, "solteiro", "2020-08-05");
        FuncionarioPublico funcionario2 = new FuncionarioPublico("Jean", 1000, "solteiro", "2020-05-31");
        FuncionarioPublico funcionario3 = new FuncionarioPublico("Rodrigo", 1000, "casado", "2020-03-20");

        funcionario1.adicionaSalario(100);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);

        System.out.println("O total pago a todos os funcionários é: " +  String.format("%.2f", FuncionarioPublico.getTotalPago()));
    } 
}