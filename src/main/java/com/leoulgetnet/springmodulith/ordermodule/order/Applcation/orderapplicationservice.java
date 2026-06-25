package com.leoulgetnet.springmodulith.ordermodule.order.Applcation;

import com.leoulgetnet.springmodulith.productmodule.product.Domain.Events.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class orderapplicationservice {
    @ApplicationModuleListener
    public void postproduct(Product product) {
        System.out.println("📢 ORDER RECEIVED: " + product);
        log.info("📢 ORDER RECEIVED: {}", product);
    }

}
