package org.serratec.projeto3.projeto3.controller;

import java.util.List;

import org.serratec.projeto3.projeto3.Domain.Todo;
import org.serratec.projeto3.projeto3.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping({"/todo"})
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodos(){
        return todoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodo(@PathVariable Integer id){
        Todo todo = todoService.getTodo(id);

        if(null == todo){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(todo);
    }
    
    @PostMapping
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
       return ResponseEntity.status(HttpStatus.CREATED).body(todoService.addTodo(todo));
        
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo){
        Todo newTodo = todoService.updateTodo(todo);
        if(null == newTodo){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(newTodo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        if(!todoService.deleteTodo(id)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
}