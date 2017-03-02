package by.ishop.data.persistence;

import by.ishop.data.price.DAO;
import by.ishop.data.price.EntryPrice;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sten on 21.02.17.
 */
public class JPADAOPrice implements DAO<Integer> {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("IShopSoap");


    @Override
    public EntryPrice getForProductId(Integer productId) {

        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;
        try{
            transaction = manager.getTransaction();
            transaction.begin();

            TypedQuery<PersistedPrice> query = manager.createQuery(
                    "Select s from productPrice s where s.productEntryId=:arg1", PersistedPrice.class);
            query.setParameter("arg1", productId);
            // selecting last price if multiple occurs
            query.setMaxResults(1);

            List<PersistedPrice> l = query.getResultList();

            if(l.isEmpty()) throw new RuntimeException("Price for product " + productId + " was not found");

            // .setMaxResults(1) was set
            PersistedPrice pp = l.get(0);

            EntryPrice p = persistedToDTO(pp);

            return p;
        } catch(Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            // TODO slf4j
//            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            manager.close();
        }
    }

    private static EntryPrice persistedToDTO(PersistedPrice pp) {
        EntryPrice p = new EntryPrice();
        p.setCurrencyCodeISO4217(pp.getCurrencyCodeISO4217());
        p.setValue(pp.getPrice());
        return p;
    }


}
