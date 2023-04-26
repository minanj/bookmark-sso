package domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String password;
    private boolean enable;
}
