package in.das.app.dockerdemo.controller;

import in.das.app.dockerdemo.model.ProductDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/test")
    public ResponseEntity<?> test(){
        log.info("test server up...");
        return ResponseEntity.ok(Map.of("message","server up","status-code",200));
    }

    @GetMapping("/product-details/{id}")
    public ProductDetails getProductDetails(@PathVariable("id") String id){
        log.info("fetching product details with id: {}", id);
        return new ProductDetails(id,"Soap Box","box of soap","XYZ LLC.",30);
    }

}
