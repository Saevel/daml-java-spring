package prv.saevel.daml.java.spring;

import com.daml.ledger.rxjava.DamlLedgerClient;
import com.daml.ledger.rxjava.LedgerClient;
import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@SpringBootApplication
@RestController
public class Application {

    // DamlLedgerClient ledgerClient;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @GetMapping("/")
    public Observable<String> sample(){
       return Observable.fromArray("Hello, World!");
    }
}
