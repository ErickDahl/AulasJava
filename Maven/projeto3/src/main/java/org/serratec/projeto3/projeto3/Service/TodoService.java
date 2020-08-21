package org.serratec.projeto3.projeto3.Service;

import java.util.ArrayList;
import java.util.List;

import org.serratec.projeto3.projeto3.Domain.Todo;
import org.serratec.projeto3.projeto3.Exception.TodoNotFoundException;
import org.serratec.projeto3.projeto3.Exception.ValidarIdException;
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

    public Todo getTodo(Integer id) throws TodoNotFoundException, ValidarIdException {
        boolean encontrado = false;
        Todo todoEncontrado = null;
        validarId(id);
        for (Todo todo : cache) {
            if (todo.getId() == id) {
                encontrado = true;
                todoEncontrado = todo;
                break;
            }
        }
        if(!encontrado) throw new TodoNotFoundException(id);

        return todoEncontrado;     
    }

    public Todo addTodo(Todo todo) throws ValidarIdException {
        validarId(todo.getId());
        todo.setId(nextId);
        cache.add(todo);
        nextId++;
        return todo;
    }

    public Todo updateTodo(Todo todo) throws TodoNotFoundException, ValidarIdException {
        validarId(todo.getId());
        Todo todoFound = getTodo(todo.getId());
        if (null == todoFound) {
            return null;
        }

        if(!"".equals(todoFound.getTitulo())) todoFound.setTitulo(todo.getTitulo());
        if(!"".equals(todoFound.getDescricao())) todoFound.setDescricao(todo.getDescricao());
        if(!"".equals(todoFound.isCompletada())) todoFound.setCompletada(todo.isCompletada());

        return todoFound;
    }

    public void deleteTodo(Integer id) throws TodoNotFoundException, ValidarIdException {
        validarId(id);
        Todo todo = getTodo(id);
        cache.remove(todo);
    }

    public void validarId(Integer id) throws ValidarIdException {
        if(id < 0){
            throw new ValidarIdException(id);
        }
    }
}