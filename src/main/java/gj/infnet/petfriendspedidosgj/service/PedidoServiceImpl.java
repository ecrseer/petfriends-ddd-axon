package gj.infnet.petfriendspedidosgj.service;

import gj.infnet.petfriendspedidosgj.domain.Pedido;
import org.springframework.stereotype.Service;


@Service
public class PedidoServiceImpl implements PedidoService {

    @Override
    public String criarPedido(Pedido pedido) {
        return "criado";
    }
}
