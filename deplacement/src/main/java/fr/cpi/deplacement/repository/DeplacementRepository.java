package fr.cpi.deplacement.repository;

import fr.cpi.deplacement.demo_models.DeplacementModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeplacementRepository extends MongoRepository<DeplacementModel,String> {
}
