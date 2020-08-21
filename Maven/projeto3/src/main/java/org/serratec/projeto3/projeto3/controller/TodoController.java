package org.serratec.projeto3.projeto3.controller;

import org.serratec.projeto3.projeto3.Domain.Todo;
import org.serratec.projeto3.projeto3.Exception.TodoNotFoundException;
import org.serratec.projeto3.projeto3.Exception.ValidarIdException;
import org.serratec.projeto3.projeto3.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/todo"})
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public ResponseEntity<?> getTodos(){
        HttpHeaders cabecalho = new HttpHeaders();
        cabecalho.add("Residencia software", "2020");
        return new ResponseEntity<>(todoService.listarTodos(), cabecalho, HttpStatus.OK); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTodo(@PathVariable Integer id) throws TodoNotFoundException, ValidarIdException {

            Todo todo = todoService.getTodo(id);
            return ResponseEntity.status(HttpStatus.OK).body(todo);
    }
    
    @PostMapping
    public ResponseEntity<?> addTodo(@RequestBody Todo todo) throws ValidarIdException {

            return ResponseEntity.status(HttpStatus.CREATED).body(todoService.addTodo(todo));    
    }

    @PutMapping("/atualizar")
    public ResponseEntity<?> updateTodo(@RequestBody Todo todo) throws TodoNotFoundException, ValidarIdException {

            Todo todoAtualizado = todoService.updateTodo(todo);
            return ResponseEntity.status(HttpStatus.OK).body(todoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) throws TodoNotFoundException, ValidarIdException 
    {
            todoService.deleteTodo(id);
            return ResponseEntity.status(HttpStatus.OK).build();   
     }

     @Value("${minha-propriedade}")
     private String propriedadeCustomizada;

     @GetMapping("/teste")
     public String  retornarMinhaProiedade(){
        return propriedadeCustomizada;
     }
}