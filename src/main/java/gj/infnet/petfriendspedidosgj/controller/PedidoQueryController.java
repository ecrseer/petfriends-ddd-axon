package gj.infnet.petfriendspedidosgj.controller;


import gj.infnet.petfriendspedidosgj.service.PedidoQueryServiceImpl;
import gj.infnet.petfriendspedidosgj.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedido/eventos")
@RequiredArgsConstructor
public class PedidoQueryController {

    private final PedidoQueryServiceImpl pedidoService;

    @GetMapping("/{id}/eventos")
    public List<Object> obterTodosEventos(@PathVariable(value = "id") String id){
        return pedidoService.listarEventosPorId(id);
    }
}
