package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Roles {
    @Id
    @GeneratedValue
    private String id;
    private String name;
}
