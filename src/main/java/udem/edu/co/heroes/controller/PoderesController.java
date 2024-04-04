package udem.edu.co.heroes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.heroes.entities.Poderes;
import udem.edu.co.heroes.service.PoderesService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class PoderesController {

    PoderesService poderesService;

    public PoderesController(PoderesService poderesService) {
        this.poderesService = poderesService;
    }

    @GetMapping("/poderes/")
    public List<Poderes> findAllPoderes() {
        return this.poderesService.findAllPoderes();
    }

    @GetMapping("/poderes/{name}")
    public Poderes findPoderesById(@RequestParam("name") String name) {
        return this.poderesService.findByIdPoderes(name);
    }

    @PostMapping("/poderes")
    public Poderes updatePoderes(@RequestBody() Poderes poderes)  {
        Poderes createdPoderes = poderesService.createPoderes(poderes);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPoderes);
    }

    @PutMapping("/poderes/{name}")
    public ResponseEntity<Poderes> updatePoderes(@RequestParam("name") String name ){
        Poderes updatedPoderes = poderesService.updatePoderes(name);
        return ResponseEntity.ok(updatedPoderes);
    }

    @DeleteMapping("/poderes/{name}")
    public ResponseEntity<Poderes> deletePoderes(@PathVariable("name") String name) {
        poderesService.deletePoderes(name);
        return ResponseEntity.noContent().build();
    }
}
