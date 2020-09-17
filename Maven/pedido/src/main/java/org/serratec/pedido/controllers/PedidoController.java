package org.serratec.pedido.controllers;

import java.util.List;

import org.serratec.pedido.domain.Pedido;
import org.serratec.pedido.exceptions.NotFoundException;
import org.serratec.pedido.services.PedidoService;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> listarPedidos() {
		return ResponseEntity.ok(pedidoService.listarPedidos());
	}
	
	@GetMapping("/{numero}")
	public ResponseEntity<Pedido> detalharPedido(@PathVariable Integer numero) throws NotFoundException{
		Pedido pedido = pedidoService.detalharPedido(numero);
		return ResponseEntity.ok(pedido);
	}
	
	@PostMapping
	public ResponseEntity<Pedido> fazerPedido(@RequestBody Pedido pedido){
		Pedido novoPedido = pedidoService.fazerPedido(pedido);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoPedido);
	}
	
	@PutMapping()
	public ResponseEntity<Pedido> mudarPedido(@RequestBody Pedido pedido) throws NotFoundException{
		Pedido pedidoModificado = pedidoService.mudarPedido(pedido);
		return ResponseEntity.ok(pedidoModificado);
	}
	
	@PutMapping("/{numero}/transferirMesa/{mesa}")
	public ResponseEntity<Pedido> transferirMesa(@PathVariable Integer numero, @PathVariable Integer mesa) throws NotFoundException{
		Pedido pedidoTransferido = pedidoService.transferirMesa(numero, mesa);
		return ResponseEntity.ok(pedidoTransferido);
	}
	
	@PutMapping("/{numero}/transferirGarcon/{nomeGarcon}")
	public ResponseEntity<Pedido> transferirGarcon(@PathVariable Integer numero, @PathVariable String nomeGarcon) throws NotFoundException{
		Pedido pedidoTransferido = pedidoService.transferirGarcon(numero, nomeGarcon);
		return ResponseEntity.ok(pedidoTransferido);
	}
	
	@DeleteMapping("{numero}")
	public ResponseEntity<?> cancelarPedido(@PathVariable Integer numero) throws NotFoundException{
		pedidoService.cancelarPedido(numero);
		return ResponseEntity.ok().build();
	}
}
