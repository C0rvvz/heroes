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
    public Poderes createPoderes(Poderes poderes){
        poderesRepository.save()
        return poderesRepository.get();
    }

    @Override
    public Poderes UpdatePoderes() {
        return null;
    }

    @Override
    public Poderes deletePoderes(String name) {
        return null;
    }

    @Override
    public Poderes UpdatePoderes(Poderes updatedPoderes){
        poderesRepository.save(updatedPoderes);
        return updatedPoderes;
    }

    @Override
    public Poderes DeletePoderes(String name){
        Poderes poderesToDelete = new Poderes();
        poderesToDelete.setName(name);
        return poderesRepository.delete(poderesToDelete);


        return poderesToDelete;
    }
}
