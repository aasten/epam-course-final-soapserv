package by.ishop.data.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by sten on 02.03.17.
 */
@Entity
@Table(name = "productPrice")
public class PersistedPrice {
    @Id
    @Column(name = "idproductPrice", nullable = false, unique = true, updatable = false)
    private int id;

    @Column(name = "productEntryId", nullable = false)
    private int productId;

    @Column(name = "currencyCodeISO4217", nullable = false)
    private String currencyCodeISO4217;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCurrencyCodeISO4217() {
        return currencyCodeISO4217;
    }

    public void setCurrencyCodeISO4217(String currencyCodeISO4217) {
        this.currencyCodeISO4217 = currencyCodeISO4217;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "priceValue", nullable = false)
    private BigDecimal price;
}
