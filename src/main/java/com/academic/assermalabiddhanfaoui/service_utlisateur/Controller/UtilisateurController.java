package com.academic.assermalabiddhanfaoui.service_utlisateur.Controller;

import com.academic.assermalabiddhanfaoui.service_utlisateur.Entity.Utilisateurs;
import com.academic.assermalabiddhanfaoui.service_utlisateur.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;
    @PostMapping("/inscription")
    public ResponseEntity<String> inscription(@RequestBody Utilisateurs nouveauUtilisateur) {
        utilisateurService.saveUtilisateur(nouveauUtilisateur);
        return ResponseEntity.status(201).body("Inscription réussie");
    }


}
