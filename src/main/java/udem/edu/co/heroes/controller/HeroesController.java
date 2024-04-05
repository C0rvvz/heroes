package udem.edu.co.heroes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.heroes.entities.Heroes;
import udem.edu.co.heroes.service.HeroesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class HeroesController {

    HeroesService heroesService;

    public HeroesController(HeroesService userService) {
        this.heroesService = heroesService;
    }

    @GetMapping("/heroes/")
    public Heroes findAllHeroes() {
        return (Heroes) this.heroesService.findAllHeroes();
    }

    @GetMapping("/heroes/{name}")
    public Optional<Heroes> findHeroesById(@RequestParam("name") String name) {
        return this.heroesService.findByIdHeroes(name);
    }

    @PostMapping("/heroes")
    public Heroes updateHeroes(@RequestBody() Heroes heroes) {
        return this.heroesService.createHeroes(heroes);
    }

    @PutMapping("/heroes/{name}")
    public ResponseEntity<Heroes> updateHeroes(@RequestParam("name") int name ){
        return null;
    }

    @DeleteMapping("/heroes/{name}")
    public ResponseEntity<Heroes> deleteHeroes(@PathVariable("name") int name) {
        return null;
    }
}
