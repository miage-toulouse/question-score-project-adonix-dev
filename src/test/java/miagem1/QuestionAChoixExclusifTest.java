package miagem1;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {

    @Test
    public void getEnonce() {
        // given : une question à choix explusif initialié avec l'énoncé "question à choix 1
        String enonceQ1 = "question à  choix 1";
        QuestionAChoixExclusif q1 = new QuestionAChoixExclusif(enonceQ1, 2);

        // when : on invoque getEnonce() sur la question
        String fetchedEnonce = q1.getEnonce();

        // then : la valeur récupérée est celle de la valeur d'initialisation : "question à choix 1"
        assertEquals(enonceQ1, fetchedEnonce);

    }

    @Test
    public void getScoreForIndice() {
        //given : une question à choix exclusif avec comme indice de bonne résponde 2
        String enonceQ1 = "question à  choix 1";
        QuestionAChoixExclusif q1 = new QuestionAChoixExclusif(enonceQ1, 2);

        //when : on invoque getScoreForIndice avec la valeur
        float scoreObtenu = q1.getScoreForIndice(2);

        //then : le score obtenu doit etre egal 100
        assertEquals(100, scoreObtenu, 0.0001);

        //when : on invoque getScoreForIndice avec une valeur defférente de 2
        scoreObtenu = q1.getScoreForIndice(3);

        //then : le score obtenu doit etre egal 0
        assertEquals(0, scoreObtenu, 0.0001);

    }
}