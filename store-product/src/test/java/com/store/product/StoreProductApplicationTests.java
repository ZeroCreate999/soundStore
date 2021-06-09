package com.store.product;

import com.store.product.entity.BrandEntity;
import com.store.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StoreProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setDescript("111");
        brandEntity.setName("2222");
        boolean save = brandService.save(brandEntity);
        System.out.println("save = " + save);
    }

}
