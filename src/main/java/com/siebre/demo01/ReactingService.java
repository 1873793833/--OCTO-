package com.siebre.demo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ReactingService {

    @GetMapping(value = "/api/v1/demo01/quote")
    public BigDecimal quote(@RequestParam(value = "number", defaultValue = "0") BigDecimal number) {
        BigDecimal divisor = new BigDecimal(1000);

        return number.divide(divisor, 2, BigDecimal.ROUND_HALF_UP);
    }

}
