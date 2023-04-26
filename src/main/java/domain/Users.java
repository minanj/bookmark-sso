package domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Users implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String password;
    private boolean enable;
}
