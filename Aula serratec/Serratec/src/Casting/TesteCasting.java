package Casting;

public class TesteCasting {
    public static void main(String[] args) {
        Veiculo v1 = new Caminhao("Scania","ABC-123");   
        Object obj1 = new VeiculoPasseio("Ford", "BCA-123");

        Veiculo v2 = (Veiculo) obj1;

        System.out.println(v2.getModelo());

        Veiculo v3 = new Caminhao("KLC", "DCA-123");
        Caminhao c1 = (Caminhao) v3;

        VeiculoPasseio vp = (VeiculoPasseio) obj1;

    }
}