package study.software.architecture.sale.entities;

import study.software.architecture.sale.to.SaleRequest;

import java.math.BigDecimal;

public class SaleConverter {

    public static Sale toEntity(SaleRequest saleRequest) {
        return Sale.builder()
                .personDocument(saleRequest.getPersonDocument())
                .object(saleRequest.getObject())
                .quantity(saleRequest.getQuantity())
                .amount(BigDecimal.valueOf(saleRequest.getAmount()))
                .build();
    }
}