package supdeco.edu.sn.apiforflutter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import supdeco.edu.sn.apiforflutter.models.Etudiant;
import supdeco.edu.sn.apiforflutter.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public String ajouterEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
        return "Etudiant crée avec succès !";
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant etudiant, Long id) {
     Etudiant etud =  etudiantRepository.findById(id).get();

     etud.setMatricule(etudiant.getMatricule());
     etud.setNom(etudiant.getNom());
     etud.setPrenom(etud.getPrenom());
     etudiantRepository.save(etud);
        return etud;
    }

    @Override
    public boolean supprimerEtudiant(Long id) {
        etudiantRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Etudiant> listEtudiants() {

        return etudiantRepository.findAll();
    }
}
