import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Application {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Personne.class);
        Personne p_1 = new Personne("Zhong","Zixiao", new Date(02,07,1998));

        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        m.marshal(p_1,new File("resultat.xml"));

        System.out.println("*******************************************");
        JAXBContext jc_1 = JAXBContext.newInstance(Personnes.class);
        Personnes ps = new Personnes();
        ps.getPs().add(new Personne("Zhong","Zixiao",new Date(01,02,2000)));
        ps.getPs().add(new Personne("Zhong","Zixiao",new Date(02,03,2000)));
        ps.getPs().add(new Personne("Zhong","Zixiao",new Date(01,02,2000)));
        ps.getPs().add(new Personne("Zhong","Zixiao",new Date(02,03,2000)));
        ps.getPs().add(new Personne("Zhong","Zixiao",new Date(01,02,2000)));
        ps.getPs().add(new Personne("Zhong","Zixiao",new Date(02,03,2000)));

        Marshaller ms = jc_1.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        ms.marshal(ps,new File("étudiants.xml"));
    }
}
