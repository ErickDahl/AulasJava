package org.serratec.projeto3.projeto3.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import org.serratec.projeto3.projeto3.Domain.Todo;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private List<Todo> cache;
    private int nextId = 0;

    public TodoService() {
        cache = new ArrayList<Todo>();
        cache.add(new Todo(1, "baixar apostila", "Baixar a apostila mais recente", true));
        cache.add(new Todo(2, "baixar eclipse", "Baixar a versão mais atual do eclipse", false));
        cache.add(new Todo(3, "baixar jdk", "Baixar a versão 8 do java developer kit", false));
        cache.add(new Todo(4, "instalar jdk", "Descompactar o arquivo e configurar o path e java_path no windows",
                false));
        cache.add(new Todo(5, "testar eclipse", "Descompactar o eclipse e verificar se ele encontra o java", false));
        nextId = 6;
    }

    public List<Todo> listarTodos() {
        return cache;
    }

    public Todo getTodo(Integer id) {
        for (Todo todo : cache) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    public Todo addTodo(Todo todo) {
        todo.setId(nextId);
        cache.add(todo);
        nextId++;
        return todo;
    }

    public Todo updateTodo(Todo todo) {
        Todo todoFound = getTodo(todo.getId());
        if (null == todoFound) {
            return null;
        }

        todoFound.setTitulo(todo.getTitulo());
        todoFound.setDescricao(todo.getDescricao());
        todoFound.setCompletada(todo.isCompletada());

        return todo;
    }

    public boolean deleteTodo(Integer id){
        Todo todo = getTodo(id);
        if(null == todo){
            return false;
        }
        cache.remove(todo);
        return true;
    }
}