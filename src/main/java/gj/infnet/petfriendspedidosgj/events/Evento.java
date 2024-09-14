package gj.infnet.petfriendspedidosgj.events;

import gj.infnet.petfriendspedidosgj.infra.IdUnico;

public class Evento {

    private String id;

    public Evento(){
        this.id=IdUnico.criar();
    }
    public Evento(String id){
        this.id = id;
    }
}
