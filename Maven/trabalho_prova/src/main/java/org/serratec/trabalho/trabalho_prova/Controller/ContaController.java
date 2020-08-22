package org.serratec.trabalho.trabalho_prova.Controller;

import org.serratec.trabalho.trabalho_prova.Domain.Conta;
import org.serratec.trabalho.trabalho_prova.Domain.Operacao;
import org.serratec.trabalho.trabalho_prova.Exeception.ContaNotFoundExeception;
import org.serratec.trabalho.trabalho_prova.Exeception.ValidarNumeroException;
import org.serratec.trabalho.trabalho_prova.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/conta" })
public class ContaController {

    @Autowired
    private ContaService contaService;


    @GetMapping
    public ResponseEntity<?> getContas() {
        HttpHeaders cabecalho = new HttpHeaders();
        cabecalho.add("Residencia software", "2020");
        return new ResponseEntity<>(contaService.listarContas(), cabecalho, HttpStatus.OK);
    }

    @GetMapping("/{numero}")
    public ResponseEntity<?> getConta(@PathVariable Integer numero)  throws ContaNotFoundExeception, ValidarNumeroException {

            Conta conta = contaService.getConta(numero);
            return ResponseEntity.status(HttpStatus.OK).body(conta);
    }

    @PostMapping
    public ResponseEntity<?> addConta(@RequestBody Conta conta) throws ValidarNumeroException {

            return ResponseEntity.status(HttpStatus.CREATED).body(contaService.addConta(conta));    
    }

    @PostMapping("/operacao")
    public ResponseEntity<?> DebitoConta(@RequestParam String operacao,Integer valor, Integer numero) throws ValidarNumeroException, ContaNotFoundExeception {
            Operacao operacao2 = new Operacao(operacao, valor);
            return ResponseEntity.status(HttpStatus.CREATED).body(contaService.OperacaoConta(operacao2, numero));    
    }
    
    @PutMapping("/atualizar")
    public ResponseEntity<?> updateTodo(@RequestBody Conta conta) throws ValidarNumeroException, ContaNotFoundExeception {

            Conta ContaAtualizado = contaService.updateConta(conta);
            return ResponseEntity.status(HttpStatus.OK).body(ContaAtualizado);
    }

    @DeleteMapping("/{numero}")
    public ResponseEntity<?> delete(@PathVariable Integer numero) throws ValidarNumeroException, ContaNotFoundExeception {
        
            contaService.deleteConta(numero);
            return ResponseEntity.status(HttpStatus.OK).build();   
     } 
}