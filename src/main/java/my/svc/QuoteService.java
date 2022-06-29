package my.svc;

import my.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

// Tasks service class

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository repository;

    public Boolean isValid(final Quote quote) {
        if (quote != null && !quote.getQuote().isEmpty()) {
            return true;
        }
        return false;
    }
    public Flux getAllQuotes() {
        return this.repository.findAll();
    }
    public Mono createQuote(final Quote quote) {
        return this.repository.save(quote);
    }

    @Transactional
    public Mono updateQuote(final Quote quote) {
        return this.repository.findById(quote.getId())
                .flatMap(t -> {
                    t.setQuote(quote.getQuote());
                    t.setAuthor(quote.getAuthor());
                    return this.repository.save(t);
                });
    }

    @Transactional
    public Mono deleteQuote(final int id){
        return this.repository.findById(id)
                .flatMap(this.repository::delete);
    }
}