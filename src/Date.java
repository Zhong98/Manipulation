import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Date implements Serializable {
    private int jour;
    private int mois;
    private int annee;

    public Date(){
    }

    public Date(int jour, int mois,int annee){
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
