package guru.springframework.spring5webapp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Address address;
    @OneToMany
    private Set<Book> books = new HashSet<>();

    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
