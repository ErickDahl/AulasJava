package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        List<Cliente> Clientes = new ArrayList<Cliente>();

        boolean continuar = true;

        System.out.println("Insira um cliente");
        System.out.println("---------------------------");
        do{
            System.out.println("Insira o id do Cliente");
            int id = dados.nextInt();
            System.out.println("Insira o nome do Cliente");
            String nome = dados.next();
            System.out.println("Insira a idade do Cliente");
            int idade = dados.nextInt();
            System.out.println("Insira o telefone do Cliente");
            String telefone = dados.next();
            System.out.println("Deseja inserir outro cliente?   true/false");
             continuar = dados.nextBoolean();
            
            Cliente cliente = new Cliente(id, nome, idade, telefone);
            Clientes.add(cliente);
            System.out.println("\n");

            if(continuar){
                System.out.println("Insira mais um Cliente");
                System.out.println("---------------------------");
            }
        }while(continuar);

        System.out.println("---------------------------");
        for(Cliente c : Clientes){
            System.out.println(" Id do cliente: " + c.getId());
            System.out.println(" Nome do cliente: " + c.getNome());
            System.out.println(" Idade do cliente:" + c.getIdade());
            System.out.println(" Telefone do cliente: " + c.getTelefone());
            System.out.println("---------------------------");
        }
        dados.close();
    }  
}