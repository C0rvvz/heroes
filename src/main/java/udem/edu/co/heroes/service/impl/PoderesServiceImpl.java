package udem.edu.co.heroes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import udem.edu.co.heroes.entities.Poderes;
import udem.edu.co.heroes.repository.PoderesRepository;
import udem.edu.co.heroes.service.PoderesService;

import java.util.List;
import java.util.Optional;

public class PoderesServiceImpl implements PoderesService{
    @Autowired
    PoderesRepository poderesRepository;

    @Override
    public List<Poderes> findAllPoderes(){
        return (List<Poderes>) poderesRepository.findAll();
    }

    @Override
    public Optional<Poderes> findByIdPoderes(String name){
        return poderesRepository.findById(name);
    }

    @Override
    public Poderes createPoderes(){
        poderesRepository.setPoderes();
        return poderesRepository.getPoderes();
    }

    @Override
    public Poderes UpdatePoderes(Poderes updatedPoderes){
        poderesRepository.updatePoderes(updatedPoderes);
        return updatedPoderes;
    }

    @Override
    public Poderes DeletePoderes(String name){
        Poderes poderesToDelete = poderesRepository.findByPoderes(name);
        if (poderesToDelete != null) {
            poderesRepository.delete(poderesToDelete);
        } else {
            throw new PoderesNotFoundException("No se encontraron poderes con el ID especificado: " + name);
        }
        return poderesToDelete;
    }
}
