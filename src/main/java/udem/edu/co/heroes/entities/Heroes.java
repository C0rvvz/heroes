package udem.edu.co.heroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="heroes")
public class Heroes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private List<Poderes> poderes;
}