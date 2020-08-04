package Interface_Abstrato;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(3500, "Erick");
        Poupanca poupanca1 = new Poupanca(3600, "Jean");
        Conta conta2 = new Cdb("Ana", 1250, 3);   

        conta1.depositarConta(100);
        poupanca1.sacarConta(200);
        conta2.depositarConta(300);

        System.out.println(conta1);
        System.out.println(poupanca1);
        System.out.println(conta2);
    }
}