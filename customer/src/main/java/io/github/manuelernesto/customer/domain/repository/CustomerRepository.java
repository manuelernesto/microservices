package io.github.manuelernesto.customer.domain.repository;

import io.github.manuelernesto.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 11/12/21 15:42
 */
@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
}
