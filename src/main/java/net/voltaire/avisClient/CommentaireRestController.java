package net.voltaire.avisClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentaireRestController {
    @GetMapping("/commentaires")
    public List<Commentaire> commentaireList(){
        return List.of(
                new Commentaire(1, "les merveilles", 1),
                new Commentaire(2, "les boissons", 0),
                new Commentaire(3, "les jardins", 1)

        );
    }
    @GetMapping("/commentaires/id")
    public Commentaire commentaireChoix(@PathVariable int id){
        return new Commentaire(1, "les merveilles", 1);


    }
}
