package udem.edu.co.heroes.service;

import udem.edu.co.heroes.entities.Heroes;

import java.util.List;
import java.util.Optional;

public interface HeroesService {
    public List<Heroes> findAllHeroes();
    public Optional findByIdHeroes(String name);

    public Heroes createHeroes(Heroes heroes);
    public Heroes UpdateHeroes();

    public Heroes deleteHeroes();
}
