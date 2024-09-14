package gj.infnet.petfriendspedidosgj.command;

import gj.infnet.petfriendspedidosgj.domain.Pedido;

public class CriarPedidoCommand extends Comando<Long> {

    public Pedido.PedidoStatus status;

    public CriarPedidoCommand(Long id) {
        super(id);
        this.status= Pedido.PedidoStatus.NOVO;
    }
}
