import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenerationSchema {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Personne.class);
            jc.generateSchema(new SchemaOutputResolver() {
                @Override
                public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                    File f =new File("personne.xsd");
                    StreamResult r = new StreamResult(f);
                    return r;
                }
            });
        }catch (Exception e){
            Logger.getLogger(GenerationSchema.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
