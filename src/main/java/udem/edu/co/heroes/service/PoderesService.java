package udem.edu.co.heroes.service;

import udem.edu.co.heroes.entities.Poderes;

import java.util.List;
import java.util.Optional;

public interface PoderesService {
    public List<Poderes> findAllPoderes();
    public Optional findByIdPoderes(String name);

    public Poderes createPoderes(Poderes poderes);
    public Poderes UpdatePoderes();

    public Poderes deletePoderes(String name);

    Poderes UpdatePoderes(Poderes updatedPoderes);

    Poderes DeletePoderes(String name);
}
