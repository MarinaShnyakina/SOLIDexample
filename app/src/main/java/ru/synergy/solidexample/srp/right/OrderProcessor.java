package ru.synergy.solidexample.srp.right;

import ru.synergy.solidexample.models.Order;

public class OrderProcessor {
    public void process(Order order) {

        MySQLOrderRepository repository = new MySQLOrderRepository(); // но так писать не оч хорошо с точки зрения dip
        ConfirmationEmailSender mailSender = new ConfirmationEmailSender(); // но так писать не оч хорошо с точки зрения dip

        if (order.isValid() && repository.save(order)) {
            mailSender.sendConfirmationEmail(order);
        }
    }
}
