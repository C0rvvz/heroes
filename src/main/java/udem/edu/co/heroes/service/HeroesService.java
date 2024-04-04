package udem.edu.co.heroes.service;

import udem.edu.co.heroes.entities.Heroes;

import java.util.List;

public interface HeroesService {
    public List<Heroes> findAllHeroes();
    public Heroes findByIdHeroes();

    public Heroes createHeroes();
    public Heroes UpdateHeroes();

    public Heroes deleteHeroes();
}
