package LimaSantos.SuperStock.Caixa.models;

import LimaSantos.SuperStock.Carrinho.item.models.CarrinhoItemModels;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Carrinho")
public class CarrinhoModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private List<CarrinhoItemModels> itens;

    private double total;


//formula do total do carrinho
    public void calculateTotal() {
        if (itens != null) {
            this.total = itens.stream()
                        .mapToDouble(CarrinhoItemModels::getSubtotal)
                        .sum();
        } else {
            this.total = 0.0;
        }
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
