package gj.infnet.petfriendspedidosgj.service;

import lombok.RequiredArgsConstructor;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PedidoQueryServiceImpl {

    private final EventStore eventStore;

    public List<Object> listarEventosPorId(String id){
        var streamEventos = eventStore.readEvents(id,0)
                .asStream();
        return streamEventos.map(evento->evento.getPayload())
                .collect(Collectors.toList());
    }

}
