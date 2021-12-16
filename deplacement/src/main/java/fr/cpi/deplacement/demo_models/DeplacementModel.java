package fr.cpi.deplacement.demo_models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("deplacement")
@NoArgsConstructor
@AllArgsConstructor
public class DeplacementModel {
    @Id
    private String id;
    private String idInfirmier;
    private String idPatient;
    private Date dateDeplacement;
    private int cost;
}
