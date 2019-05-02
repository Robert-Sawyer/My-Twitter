package pl.coderslab.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import pl.coderslab.validation.RegistrationValidationGroup;

import javax.persistence.*;
import javax.validation.groups.Default;
import java.util.List;

@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(groups = RegistrationValidationGroup.class) //dodajemy bo chcemy, żeby
    private String firstName;

    @NotBlank(groups = RegistrationValidationGroup.class)
    private String lastName;

    @NotBlank(groups = {RegistrationValidationGroup.class, Default.class}) //waliduje nam teraz email przy rejestracji i logowaniu
    @Email(groups = {RegistrationValidationGroup.class, Default.class})
    @Column(unique = true)
    private String email;

    @NotBlank(groups = {RegistrationValidationGroup.class, Default.class})
    private String password;

    @OneToMany
    private List<Tweet> tweets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

