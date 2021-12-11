package io.github.manuelernesto.customer.model.request;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 11/12/21 13:12
 */

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
