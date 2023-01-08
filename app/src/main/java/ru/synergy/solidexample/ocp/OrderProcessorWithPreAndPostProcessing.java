package ru.synergy.solidexample.ocp;

import ru.synergy.solidexample.models.Order;
import ru.synergy.solidexample.srp.right.OrderProcessor;

public class OrderProcessorWithPreAndPostProcessing extends OrderProcessor {
    @Override
    public void process(Order order) {
        beforeProcessing();
        super.process(order);
        afterProcessing();
    }

    private void beforeProcessing() {
        // осуществим некоторые действия перед обработкой заказа
    }

    private void afterProcessing() {
        // осуществим некоторые действия после обработки заказа
    }




}
