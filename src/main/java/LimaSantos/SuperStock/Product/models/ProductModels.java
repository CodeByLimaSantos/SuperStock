package LimaSantos.SuperStock.Product.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_register")
public class ProductModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String name;
    private long id;
    private double sellprice;
    private double costprice;
    private  int quantitystock;

    public ProductModels() {
    }


    public ProductModels(String name, long id, double sellprice, double costprice, int quantitystock) {
        this.name = name;
        this.sellprice = sellprice;
        this.costprice = costprice;
        this.quantitystock = quantitystock;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getSellprice() {
        return sellprice;
    }

    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    public double getCostprice() {
        return costprice;
    }

    public void setCostprice(double costprice) {
        this.costprice = costprice;
    }

    public int getQuantitystock() {
        return quantitystock;
    }

    public void setQuantitystock(int quantitystock) {
        this.quantitystock = quantitystock;
    }


}
