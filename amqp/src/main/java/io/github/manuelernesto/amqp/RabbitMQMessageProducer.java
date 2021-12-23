package io.github.manuelernesto.amqp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 23/12/21 23:26
 */
@Component
@Slf4j
public record RabbitMQMessageProducer(AmqpTemplate amqpTemplate) {

    public void publish(Object payload, String exchange, String routingKey) {
        log.info("Publishing to {} using routing key {}. Payload: {}", exchange, routingKey, payload);
        amqpTemplate.convertAndSend(exchange, routingKey, payload);
        log.info("Published to {} using routing key {}. Payload: {}", exchange, routingKey, payload);
    }
}
