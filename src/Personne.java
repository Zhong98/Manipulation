import java.io.Serializable;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Etudient")
public class Personne implements Serializable {
    private String nom;
    private String prenom;
    private Date dateNaissance;

    public Personne(){

    }
    public Personne(String nom,String prenom,Date dateNaissance){
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.prenom = prenom;
    }

    @XmlAttribute
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


}
