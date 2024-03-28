package org.example.jpamapping;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BurgerkingService {

    private BurgerkingRepository burgerkingRepository;

    public BurgerkingService(BurgerkingRepository burgerkingRepository){
        this.burgerkingRepository = burgerkingRepository;
    }

    @Transactional
    public void registOrder(OrderDTO newOrder) {
        Order order = new Order(
               new Burger(newOrder.getHamburger()),
                new Set(
                        newOrder.getSide(),
                        newOrder.getDrink()
                )
        );

        burgerkingRepository.save(order);



    }




}
