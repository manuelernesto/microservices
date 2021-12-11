package io.github.manuelernesto.customer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 11/12/21 13:08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_id_sequence", sequenceName = "customer_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_sequence")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
