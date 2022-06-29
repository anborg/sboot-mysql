package my.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@RequiredArgsConstructor
@Table("quote")
public class Quote {
    @Id
    private Integer id;
    @NonNull
    private String quote;
    private String author;
}
