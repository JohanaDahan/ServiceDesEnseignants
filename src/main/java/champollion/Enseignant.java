package champollion;

import java.util.HashMap;
import java.util.Map;

public class Enseignant extends Personne {
 public Map<UE, ServicePrevu> ajoutenseignement = new HashMap<>();
    public Enseignant(String nom, String email) {
        super(nom, email);
    }
    
    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant
     * en "heures équivalent TD"
     * Pour le calcul :
     * 1 heure de cours magistral vaut 1,5 h "équivalent TD"
     * 1 heure de TD vaut 1h "équivalent TD"
     * 1 heure de TP vaut 0,75h "équivalent TD"
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant
     **/
    public int heuresPrevues() {
       double heuretotal=0;
       for(ServicePrevu result : ajoutenseignement.values())
           heuretotal=result.VolumeCM*1.5+result.VolumeTD+result.VolumeTP*0.75+heuretotal;
          return (int) heuretotal;         
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée
     * en "heures équivalent TD"
     * Pour le calcul :
     * 1 heure de cours magistral vaut 1,5 h "équivalent TD"
     * 1 heure de TD vaut 1h "équivalent TD"
     * 1 heure de TP vaut 0,75h "équivalent TD"
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant
     **/
    public int heuresPrevuesPourUE(UE ue) {
       double heureCM=0;
       double heureTP=0;
       double heureTD=0;
       double heuretotalUE=0;
       for(UE resultUE : ajoutenseignement.keySet()){
           heureCM=ajoutenseignement.get(resultUE).VolumeCM*1.5;
          heureTP=ajoutenseignement.get(resultUE).VolumeTD;
          heureTD=ajoutenseignement.get(resultUE).VolumeTP*0.75;
       }
          heuretotalUE=heureCM+heureTP+heureTD;
          return (int) heuretotalUE;    
    }
    
    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral 
     * @param volumeTD le volume d'heures de TD 
     * @param volumeTP le volume d'heures de TP 
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        if(ajoutenseignement.containsKey(ue)) {
            ajoutenseignement.get(ue).addHeure(volumeCM, volumeTD, volumeTP);
        }else{
        ServicePrevu systemePrevu = new ServicePrevu (volumeCM, volumeTD, volumeTP);    
         ajoutenseignement.put(ue,systemePrevu);
    }
	
}
}

