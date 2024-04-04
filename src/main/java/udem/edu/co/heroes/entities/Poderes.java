package udem.edu.co.heroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="poderes")
public class Poderes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
}
