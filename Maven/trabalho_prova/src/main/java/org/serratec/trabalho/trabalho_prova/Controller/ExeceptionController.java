package org.serratec.trabalho.trabalho_prova.Controller;

import org.serratec.trabalho.trabalho_prova.Exeception.ContaNotFoundExeception;
import org.serratec.trabalho.trabalho_prova.Exeception.ValidarNumeroException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExeceptionController {

    @ExceptionHandler(ContaNotFoundExeception.class)
    public ResponseEntity<String> tratarTodoNotFound(ContaNotFoundExeception exception){
        String msg = String.format("O Todo com ID %d não foi encontrado", exception.getId());
        return ResponseEntity.notFound()
            .header("x-erro-msg", msg)
            .header("x-erro-code", "TODO_NOT_FOUND")
            .header("x-erro-value", exception.getId().toString())
            .build();
    }   
    
   @ExceptionHandler(ValidarNumeroException.class)
    public ResponseEntity<String> tratarTodoBadRequest(ValidarNumeroException exception){
        String msg = String.format("O Todo com ID %d não pode ser menor que 0", exception.getId());
        return ResponseEntity.badRequest()
            .header("x-erro-msg", msg)
            .header("x-erro-code", "TODO_BAD_REQUEST")
            .header("x-erro-value", exception.getId().toString())
            .build();
    }       
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> tratarTodoNotFound(Exception exception){
        String msg = "Ocorreu uma exceção não esperada";
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .header("x-erro-msg", msg)
            .header("x-erro-code", "GENERIC_EXCEPTION")
            .build();
    }       
    
}