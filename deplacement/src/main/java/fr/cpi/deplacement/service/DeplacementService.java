package fr.cpi.deplacement.service;

import fr.cpi.deplacement.demo_models.DeplacementModel;
import fr.cpi.deplacement.repository.DeplacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeplacementService {

    @Autowired
    DeplacementRepository repository;

    public List<DeplacementModel> findAll(){
        return repository.findAll();
    }

    public Optional<DeplacementModel> findById(String id) { return repository.findById(id); }

    //ajout
    public DeplacementModel save(DeplacementModel deplacement){
        return repository.save(deplacement);
    }

    //update
    public DeplacementModel update(DeplacementModel deplacement){
        return repository.save(deplacement);
    }

    //delete
    public void delete(String id) {
        repository.deleteById(id);
    }




}
