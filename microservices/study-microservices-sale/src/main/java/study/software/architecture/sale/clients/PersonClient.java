package study.software.architecture.sale.clients;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import study.software.architecture.sale.to.PersonResponse;

@HttpExchange("/person")
public interface PersonClient {

    @GetExchange("/{document}")
    PersonResponse findByDocument(@PathVariable String document);

}
