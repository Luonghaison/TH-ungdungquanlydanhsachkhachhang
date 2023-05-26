package ra.demo_daiiiii.service;

import ra.demo_daiiiii.model.customer;

import java.util.List;

public interface ICustomerService {
    List<customer> findAll();

    customer findById(Long id);

    void deleteById(Long id);

    void save(customer customer);

}
