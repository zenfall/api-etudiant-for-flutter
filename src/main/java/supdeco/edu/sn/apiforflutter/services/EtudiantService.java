package supdeco.edu.sn.apiforflutter.services;

import org.springframework.stereotype.Service;
import supdeco.edu.sn.apiforflutter.models.Etudiant;

import java.util.List;

public interface EtudiantService {
     String ajouterEtudiant(Etudiant etudiant);
     Etudiant modifierEtudiant(Etudiant etudiant, Long id);
     boolean supprimerEtudiant(Long id);
     List<Etudiant> listEtudiants();
}
