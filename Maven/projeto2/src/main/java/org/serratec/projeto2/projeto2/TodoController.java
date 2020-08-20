package org.serratec.projeto2.projeto2;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @RequestMapping("/todo")
    public List<Todo> getTodos(){
        return Arrays.asList(
            new Todo(1, "Compras", "Comprar"),
            new Todo(2, "Remédio", "compra remédio"),
            new Todo(3, "Aula", "Assistir aula") 
        );
    } 
}