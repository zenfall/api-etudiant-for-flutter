package supdeco.edu.sn.apiforflutter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import supdeco.edu.sn.apiforflutter.models.Etudiant;
import supdeco.edu.sn.apiforflutter.repositories.EtudiantRepository;
import supdeco.edu.sn.apiforflutter.services.EtudiantService;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    EtudiantService etudiantService;
    @Autowired
    EtudiantRepository etudiantRepository;

    @RequestMapping(value="/ajoutEtudiant",method= RequestMethod.POST,produces="application/json")
    public String ajoutEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.ajouterEtudiant(etudiant);
    }

    @RequestMapping(value="/listEtudiant",method= RequestMethod.GET,produces="application/json")
    public List<Etudiant> listEtudiant(){

        return etudiantService.listEtudiants();
    }

    @RequestMapping(value="/modifierEtudiant/{id}",method= RequestMethod.PUT,produces="application/json")
    public Etudiant modifierEtudiant(@RequestBody Etudiant etudiant,@PathVariable(value = "id") Long id){

        return etudiantService.modifierEtudiant(etudiant, id);
    }

    @RequestMapping(value="/supprimerEtudiant/{id}",method= RequestMethod.DELETE,produces="application/json")
    public Boolean supprimerEtudiant(@PathVariable(value = "id") Long id){

        return etudiantService.supprimerEtudiant(id);
    }


}
