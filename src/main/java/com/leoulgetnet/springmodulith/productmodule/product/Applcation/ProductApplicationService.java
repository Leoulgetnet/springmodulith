package com.leoulgetnet.springmodulith.productmodule.product.Applcation;

import com.leoulgetnet.springmodulith.productmodule.product.Domain.Events.Product;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional
public class ProductApplicationService implements CommandLineRunner
{
    private final ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public Product createproduct(Long id){
        Product product1=getProduct(id);
        applicationEventPublisher.publishEvent(product1);
        return product1;}

    public Product getProduct(Long id){
        Map<Long,Product> products=new HashMap<>();
        products.put(Long.valueOf(1),new Product(1,"nike",200.0));
        products.put(Long.valueOf(2),new Product(2,"adidas",300.0));
        products.put(Long.valueOf(3),new Product(3,"puma",400));
        return products.get(id);
    }


    @Override
    public void run(String... args) throws Exception {
        log.info("has started");
        createproduct(Long.valueOf(1));
        Thread.sleep(1000);
        createproduct(Long.valueOf(2));
        Thread.sleep(2000);
        createproduct(Long.valueOf(3));
    }
}
