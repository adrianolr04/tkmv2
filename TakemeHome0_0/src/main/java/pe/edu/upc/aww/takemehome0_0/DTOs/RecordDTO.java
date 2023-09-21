package pe.edu.upc.aww.takemehome0_0.DTOs;

import pe.edu.upc.aww.takemehome0_0.Entities.Category;
import pe.edu.upc.aww.takemehome0_0.Entities.Product;

import java.time.LocalDate;

public class RecordDTO {
    private int idRecord;
    private String payment;
    private LocalDate paymentDate;
    private LocalDate arriveDate;
    private String points;
    private Product product;
    private Category category;

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

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
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
}
