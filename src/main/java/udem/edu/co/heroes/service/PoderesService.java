package udem.edu.co.heroes.service;

import udem.edu.co.heroes.entities.Poderes;

import java.util.List;

public interface PoderesService {
    public List<Poderes> findAllPoderes();
    public Poderes findByIdPoderes();

    public Poderes createPoderes();
    public Poderes UpdatePoderes();

    public Poderes deletePoderes();
}
