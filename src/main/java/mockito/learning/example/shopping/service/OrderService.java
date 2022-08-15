package mockito.learning.example.shopping.service;


import mockito.learning.example.shopping.model.Order;

/**
 * OrderService
 *
 * Accessor for operating the user order
 */
public interface OrderService {

    /**
     * To print user order details
     *
     * @param order User order
     */
    void printOrderDetail(Order order);

}
