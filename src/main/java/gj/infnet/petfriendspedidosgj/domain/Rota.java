package gj.infnet.petfriendspedidosgj.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    private List<String> enderecos;

    @ElementCollection
    private List<String> paradas;

}
