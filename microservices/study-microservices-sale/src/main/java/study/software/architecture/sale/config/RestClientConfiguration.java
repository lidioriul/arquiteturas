package study.software.architecture.sale.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import study.software.architecture.sale.clients.PersonClient;

import java.time.Duration;

@Configuration
public class RestClientConfiguration {

    @Bean
    public PersonClient personClient(RestClient.Builder builder) {
        RestClient restClient = builder
                .baseUrl("http://localhost:8080")
                .build();

        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory.builderFor(adapter).build();

        return httpServiceProxyFactory.createClient(PersonClient.class);
    }

    @Bean
    public RestClient.Builder restClientBuilder() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setReadTimeout(Duration.ofSeconds(2));
        factory.setConnectionRequestTimeout(Duration.ofSeconds(2));

        return RestClient.builder()
                .requestFactory(factory);
    }

}
