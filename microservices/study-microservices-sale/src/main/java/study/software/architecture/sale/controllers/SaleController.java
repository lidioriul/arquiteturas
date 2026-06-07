package study.software.architecture.sale.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.software.architecture.sale.services.SaleService;
import study.software.architecture.sale.to.SaleRequest;

@RestController
@RequestMapping(name = "/sale")
public class SaleController {

    private final SaleService saleService;

    @Autowired
    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody SaleRequest saleRequest) {
        return ResponseEntity.ok(saleService.save(saleRequest));
    }

}
