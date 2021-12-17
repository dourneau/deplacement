package fr.cpi.deplacement.service;

import fr.cpi.deplacement.demo_models.DeplacementModel;
import fr.cpi.deplacement.repository.DeplacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DeplacementService {

    @Autowired
    DeplacementRepository repository;

    public List<DeplacementModel> findAll(){
        return repository.findAll();
    }

    //Méthode permettant d’afficher uniquement les déplacements à venir
    public List<DeplacementModel> findNext() {
        // Date courante
        Date currentDate = Date.from(Instant.now());
        // On récupère tous les déplacements
        List<DeplacementModel> deplacements = repository.findAll();
        // la liste des déplacements à retourner est instanciée
        List<DeplacementModel> goodDeplacements = new ArrayList<>();
        // Boucle sur tous les déplacements
        for (DeplacementModel deplacement : deplacements) {
            Date testedDate = deplacement.getDateDeplacement();

            if (testedDate.after(currentDate)) goodDeplacements.add(deplacement);
        }
        return goodDeplacements;
    }
    // Méthode permettant d’afficher tous les déplacements à venir d’un patient
    public List<DeplacementModel> findByPatient(String idPatient) {
        // Date courante
        Date currentDate = Date.from(Instant.now());
        // On récupère tous les déplacements
        List<DeplacementModel> deplacements = repository.findAll();
        // la liste des déplacements à retourner est instanciée
        List<DeplacementModel> goodDeplacements = new ArrayList<>();
        // Boucle sur tous les déplacements
        for (DeplacementModel deplacement : deplacements) {
            String testedDeplacement = deplacement.getIdPatient();
            if (testedDeplacement.equals(idPatient)) {
                Date testedDate = deplacement.getDateDeplacement();
                if (testedDate.after(currentDate)) goodDeplacements.add(deplacement);
            }
        }
        return goodDeplacements;
    }


    public Optional<DeplacementModel> findOne(String id) { return repository.findById(id); }

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
