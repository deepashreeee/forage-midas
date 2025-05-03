package com.jpmc.midascore.foundation;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTransactionListener {

    @KafkaListener(
            topics = "${general.kafka-topic}",  // Reads topic from application.yml
            groupId = "midas-core-group"       // Consumer group ID (customize if needed)
    )
    public void receiveTransaction(Transaction transaction) {
        // For now, just log incoming transactions (Task 2 requirement)
        System.out.println("Received transaction: " + transaction);
    }
}