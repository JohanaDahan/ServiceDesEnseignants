/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

import java.util.Date;
/**
 *
 * @author Johan
 */
public class Intervention {
    public int duree;
    public boolean annulee = false;
    public Date debut;
    
    
    public void Intervention(int duree,boolean annulee,Date debut){
        this.duree = duree;
        this.debut = debut;
        
    }

}

   
    

