package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Roles {
    @Id
    @GeneratedValue
    private String id;
    private String name;
}
