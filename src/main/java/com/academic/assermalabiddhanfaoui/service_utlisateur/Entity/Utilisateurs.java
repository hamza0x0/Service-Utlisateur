package com.academic.assermalabiddhanfaoui.service_utlisateur.Entity;

import com.academic.assermalabiddhanfaoui.service_utlisateur.Enumeration.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String telephone;
    private String Nationalite;
    private String Diplomes_Obtenus;
    private String Directeur_de_these;
    private Role role;


}
