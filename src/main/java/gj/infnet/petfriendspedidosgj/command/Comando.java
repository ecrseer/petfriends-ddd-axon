package gj.infnet.petfriendspedidosgj.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class Comando<T> {

    @TargetAggregateIdentifier
    public T id;

    public Comando(T id) {
        this.id = id;
    }

}
