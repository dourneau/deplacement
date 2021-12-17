package fr.cpi.deplacement.controller;

import fr.cpi.deplacement.demo_models.DeplacementModel;
import fr.cpi.deplacement.service.DeplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("deplacement")
public class DeplacementController {

    @Autowired
    DeplacementService service;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<DeplacementModel> findAll() {
        return service.findAll();
    }

    @GetMapping("/next")
    @ResponseStatus(HttpStatus.OK)
    public List<DeplacementModel> findNext() {
        return service.findNext();
    }

    @GetMapping("/{id}")
    public Optional<DeplacementModel> findById(@PathVariable String id){
        return service.findOne(id);
    }

    @GetMapping("/next/patient/{idPatient}")
    public List<DeplacementModel> findByPatient(@PathVariable String idPatient){
        return service.findByPatient(idPatient);
    }

    @GetMapping("/next/infirmier/{idInfirmier}")
    public List<DeplacementModel> findByInfirmier(@PathVariable String idInfirmier){
        return service.findByInfirmier(idInfirmier);
    }

    @PostMapping()
    public DeplacementModel create(@RequestBody DeplacementModel deplacement ) {
        return service.save(deplacement);
    }

    @PutMapping()
    public DeplacementModel update(@RequestBody DeplacementModel deplacement ) {
        return service.save(deplacement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.ok("deplacement supprimé");
    }


}
