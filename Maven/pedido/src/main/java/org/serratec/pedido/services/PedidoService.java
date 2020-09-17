package org.serratec.pedido.services;

import java.util.ArrayList;
import java.util.List;

import org.serratec.pedido.domain.Item;
import org.serratec.pedido.domain.Pedido;
import org.serratec.pedido.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

	private List<Pedido> listaPedidos;
	private Integer nextNumeroPedido = 1;
	public PedidoService() {
		System.out.println("PedidoService created...");
		List<Item> itensPedido = new ArrayList<Item>();
		itensPedido.add(new Item(1, "Entrada", "Salada simples", 10.0));
		itensPedido.add(new Item(2, "Bebida", "coca-cola", 5.0));
		listaPedidos = new ArrayList<Pedido>();
		listaPedidos.add(new Pedido(nextNumeroPedido, 10, itensPedido, "Seu zé"));
		nextNumeroPedido = 2;
		
	}

	public List<Pedido> listarPedidos() {
		return listaPedidos;
	}

	public Pedido detalharPedido(Integer numero) throws NotFoundException {
		
		Pedido pedidoEncontrado = null; 
		for (Pedido pedido : listaPedidos) {
			if (numero == pedido.getNumero()) {
				pedidoEncontrado = pedido;
				break;
			}		
		}
		
		if(pedidoEncontrado == null) {
			throw new NotFoundException(numero, "Pedido não encontrado!");
		}
		
		return pedidoEncontrado;	
		
	}

	public Pedido fazerPedido(Pedido pedidoSolicitado) {
		pedidoSolicitado.setNumero(nextNumeroPedido);
		listaPedidos.add(pedidoSolicitado);
		nextNumeroPedido++;
		return pedidoSolicitado;
		
	}

	public Pedido mudarPedido(Pedido pedido) throws NotFoundException {		
		listaPedidos.remove(detalharPedido(pedido.getNumero()));
		listaPedidos.add(pedido);
		return pedido;
	}

	public Pedido transferirMesa(Integer numeroPedido, Integer mesa) throws NotFoundException {
		Pedido pedidoMesaTransferida = detalharPedido(numeroPedido);
		pedidoMesaTransferida.setMesa(mesa);
		return pedidoMesaTransferida;
	}
	
	public Pedido transferirGarcon(Integer numeroPedido, String nomeGarcon) throws NotFoundException {
		Pedido pedidoMesaTransferida = detalharPedido(numeroPedido);
		pedidoMesaTransferida.setNomeGarcon(nomeGarcon);
		return pedidoMesaTransferida;
	}

	public void cancelarPedido(Integer numero) throws NotFoundException {
		listaPedidos.remove(detalharPedido(numero));
	}
}
