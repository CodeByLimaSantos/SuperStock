package LimaSantos.SuperStock.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_register")
public class ProductModel {

    String name;
    long id;
    double sellprice;
    double costprice;
    int quantitystock;

    public ProductModel() {
    }


    public ProductModel(String name, int id, double sellprice, double costprice, int quantitystock) {
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
