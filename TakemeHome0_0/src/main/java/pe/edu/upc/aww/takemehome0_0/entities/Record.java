package pe.edu.upc.aww.takemehome0_0.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecord;
    @Column(name = "payment", nullable = false)
    private String payment;
    @Column(name = "payment_date",nullable = false)
    private LocalDate paymentDate;
    @Column(name = "arrive_date",nullable = false)
    private LocalDate arriveDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @Column(name="points",nullable = false)
    private String points;

    public Record(){
    }

    public Record(int idRecord, String payment, LocalDate paymentDate, LocalDate arriveDate, User user, Order order, Product product, Category category, String points) {
        this.idRecord = idRecord;
        this.payment = payment;
        this.paymentDate = paymentDate;
        this.arriveDate = arriveDate;
        this.user = user;
        this.order = order;
        this.product = product;
        this.category = category;
        this.points = points;
    }

    public int getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(int idRecord) {
        this.idRecord = idRecord;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public LocalDate getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(LocalDate arriveDate) {
        this.arriveDate = arriveDate;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
