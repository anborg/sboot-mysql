package my.api;

import my.model.Quote;
import my.svc.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService service;

    @GetMapping("/")
    Map<String, List> home() {
        return Map.of("words", List.of("sky","sea","mountain"));
    }

    @GetMapping("quotes")
    public ResponseEntity<Flux<Quote>> get() {
        return ResponseEntity.ok(this.service.getAllQuotes());
    }
    @PostMapping()
    public ResponseEntity<Mono<Quote>> post(@RequestBody Quote quote) {
        if (service.isValid(quote)) {
            return ResponseEntity.ok(this.service.createQuote(quote));
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }

    @PutMapping()
    public ResponseEntity<Mono<Quote>> put(@RequestBody Quote quote) {
        if (service.isValid(quote)) {
            return ResponseEntity.ok(this.service.updateQuote(quote));
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }

    @DeleteMapping()
    public ResponseEntity<Mono<Void>> delete(@RequestParam int id) {
        if (id > 0) {
            return ResponseEntity.ok(this.service.deleteQuote(id));
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }

}
