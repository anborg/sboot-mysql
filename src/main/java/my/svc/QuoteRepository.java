package my.svc;
import my.model.Quote;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface QuoteRepository extends ReactiveCrudRepository<Quote, Integer> {
}