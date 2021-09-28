import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Personnes implements Serializable {
    private List<Personne> ps = new ArrayList<>();

    public Personnes(){
    }
    public Personnes(List<Personne> personnesList){
        this.ps = personnesList;
    }

    public List<Personne> getPs() {
        return ps;
    }

    public void setPs(List<Personne> ps) {
        this.ps = ps;
    }
}
