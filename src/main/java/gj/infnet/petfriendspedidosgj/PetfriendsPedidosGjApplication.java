package gj.infnet.petfriendspedidosgj;

import gj.infnet.petfriendspedidosgj.domain.Pedido;
import gj.infnet.petfriendspedidosgj.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetfriendsPedidosGjApplication implements CommandLineRunner {

    @Autowired
    PedidoService pedidoService;

    public static void main(String[] args) {
        SpringApplication.run(PetfriendsPedidosGjApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        pedidoService.criarPedido(new Pedido());
        System.out.println("\n-------uepan");
    }
}
