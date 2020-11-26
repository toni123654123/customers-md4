package service;

import model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface CustomerService {
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);

    Page<Customer> findAll(Pageable pageable);
}
