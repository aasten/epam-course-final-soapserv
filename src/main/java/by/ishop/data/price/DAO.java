package by.ishop.data.price;

public interface DAO<PI> {
    EntryPrice getForProductId(PI productId);
}