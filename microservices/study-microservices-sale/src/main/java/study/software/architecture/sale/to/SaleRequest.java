package study.software.architecture.sale.to;

import lombok.Data;

@Data
public class SaleRequest {

    private String personDocument;
    private String object;
    private Long quantity;
    private Double amount;

}
