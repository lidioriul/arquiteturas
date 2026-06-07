package study.software.architecture.sale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.software.architecture.sale.entities.Sale;

import java.util.UUID;

public interface SaleRepository extends JpaRepository<Sale, UUID> {
}
