package gj.infnet.petfriendspedidosgj.controller;


import gj.infnet.petfriendspedidosgj.domain.Pedido;
import gj.infnet.petfriendspedidosgj.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor
public class PedidoCommandController {

    private final PedidoService pedidoService;

    @PostMapping
    public String criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }
}
