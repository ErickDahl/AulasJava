package org.serratec.trabalho.trabalho_prova.Service;

import java.util.ArrayList;
import java.util.List;

import org.serratec.trabalho.trabalho_prova.Domain.Conta;
import org.serratec.trabalho.trabalho_prova.Domain.Operacao;
import org.serratec.trabalho.trabalho_prova.Exeception.ContaNotFoundExeception;
import org.serratec.trabalho.trabalho_prova.Exeception.ValidarNumeroException;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    private List<Conta> cache;
    private int nextConta = 0;

    public ContaService(){
        cache = new ArrayList<Conta>();

        cache.add(new Conta(1, "Erick", 1000));
        cache.add(new Conta(2, "Jean", 2000));
        cache.add(new Conta(3, "Rodrigo", 3000));
        cache.add(new Conta(4, "Sergio", 4000));
        cache.add(new Conta(5, "Luana", 5000));
        nextConta = 6;
    }

    public List<Conta> listarContas(){
        return cache;
    }
    
    public Conta getConta(Integer numero) throws ContaNotFoundExeception, ValidarNumeroException {
        boolean encontrado = false;
        Conta ContaEncontrado = null;
        validarNumero(numero);
        for (Conta conta : cache) {
            if (conta.getNumero() == numero) {
                encontrado = true;
                ContaEncontrado = conta;
                break;
            }
        }
        if(!encontrado) throw new ContaNotFoundExeception(numero);

        return ContaEncontrado;     
    }

    public Conta addConta(Conta conta) throws ValidarNumeroException {

        conta.setNumero(nextConta);
        cache.add(conta);
        nextConta++;
        return conta;
    }

    public Conta updateConta(Conta conta) throws ValidarNumeroException, ContaNotFoundExeception {
        validarNumero(conta.getNumero());
        Conta contaFound = getConta(conta.getNumero());
        if (null == contaFound) {
            return null;
        }
        contaFound.setNumero(conta.getNumero());
        if(!"".equals(contaFound.getTitular())) contaFound.setTitula(conta.getTitular());

        return contaFound;
    }


    public Conta OperacaoConta(Operacao operacao ,Integer numero) throws ValidarNumeroException, ContaNotFoundExeception {
        validarNumero(numero);
        Conta contaFound = getConta(numero);
        if (null == contaFound) {
            return null;
        }
        if(operacao.getOperacao().equals("debito")){
            contaFound.setValor(contaFound.getValor() - operacao.getValor());
        } else if(operacao.getOperacao().equals("credito")){
            contaFound.setValor(contaFound.getValor() + operacao.getValor());
        }
        return contaFound;
    }

    public void deleteConta(Integer numero) throws ValidarNumeroException, ContaNotFoundExeception {
        validarNumero(numero);
        Conta conta = getConta(numero);
        cache.remove(conta);
    }


    public void validarNumero(Integer numero) throws ValidarNumeroException {
        if(numero < 0){
            throw new ValidarNumeroException(numero);
        }
    }
}