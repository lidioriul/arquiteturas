package study.software.architecture.sale.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "SALE")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID_SALE", nullable = false, updatable = false)
    private UUID id;
    @Column(name = "COD_DOCUMENT_PERSON")
    private String personDocument;
    @Column(name = "DES_OBJECT_SALE")
    private String object;
    @Column(name = "QTD_ITENS")
    private Long quantity;
    @Column(name = "VAL_AMOUNT_SALE")
    private BigDecimal amount;
}
