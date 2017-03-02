package by.ishop.data;

import by.ishop.data.persistence.JPADAOPrice;
import by.ishop.data.price.DAO;

public enum DataAccess {
    INSTANCE;

    private DAO<Integer> priceDAO = new JPADAOPrice();

    public DAO<Integer> getPriceDAO() {
        return priceDAO;
    }
}