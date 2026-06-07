package study.software.architecture.sale.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.software.architecture.sale.clients.PersonClient;
import study.software.architecture.sale.entities.Sale;
import study.software.architecture.sale.entities.SaleConverter;
import study.software.architecture.sale.repositories.SaleRepository;
import study.software.architecture.sale.to.PersonResponse;
import study.software.architecture.sale.to.SaleRequest;

@Service
public class SaleService {

    private final SaleRepository saleRepository;
    private final PersonClient personClient;

    @Autowired
    public SaleService(SaleRepository saleRepository,
                       PersonClient personClient) {
        this.saleRepository = saleRepository;
        this.personClient = personClient;
    }

    public Sale save(SaleRequest saleRequest) {
        Sale sale = SaleConverter.toEntity(saleRequest);
        return saleRepository.save(sale);
    }

    private void validatePerson(String documentPerson) {
        PersonResponse byDocument = personClient.findByDocument(documentPerson);
    }

}
