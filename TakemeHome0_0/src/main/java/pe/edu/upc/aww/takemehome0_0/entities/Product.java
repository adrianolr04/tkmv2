package pe.edu.upc.aww.takemehome0_0.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    @Column(name = "nameProduct",length = 250,nullable = false)
    private String nameProduct;
    @Column(name = "descriptionProduct",length = 250 ,nullable = false)
    private String descriptionProduct;
    @Column(name = "priceProduct",nullable = false)
    private Double priceProduct;
    @Column(name = "dimensionsProduct",nullable = false)
    private String dimensionsProduct;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order order;

    public Product(){}

   public Product(int idProduct,String nameProduct,String descriptionProduct,Double priceProduct,String dimensionsProduct, User user, Order order){
        this.idProduct=idProduct;
        this.nameProduct=nameProduct;
        this.descriptionProduct=descriptionProduct;
        this.priceProduct=priceProduct;
        this.dimensionsProduct=dimensionsProduct;
        this.user=user;
        this. order=order;

   }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }



    public String getDimensionsProduct() {
        return dimensionsProduct;
    }

    public void setDimensionsProduct(String dimensionsProduct) {
        this.dimensionsProduct = dimensionsProduct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
