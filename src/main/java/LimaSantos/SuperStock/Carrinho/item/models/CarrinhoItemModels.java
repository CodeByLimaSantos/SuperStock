package LimaSantos.SuperStock.Carrinho.item.models;

import LimaSantos.SuperStock.Product.models.ProductModel;
import jakarta.persistence.*;

@Table(name = "carrinho_item")
public class CarrinhoItemModels {
    private long id;

    @ManyToOne
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // caracteristicas do carrinho
    private ProductModel product;
    private Integer quantity;
    private double subtotal;

    //get and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }



public void calculateSubtotal() {
    if (product != null && quantity != null) {
        this.subtotal = product.getSellprice() * quantity;
    }
}
}
