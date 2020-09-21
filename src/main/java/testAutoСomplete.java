import ch.iec._61850._2003.scl.*;
import com.mchange.v1.cachedstore.CachedStore;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.*;

public class testAutoСomplete {
    private static TSubstation mySubstation;
    private static TVoltage voltage;
    private static List<TPowerTransformerEnum> ptrTypes;

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(SCL.class);

        // Unmarshaller
        final Unmarshaller unmarshaller = context.createUnmarshaller();
        // Unmarshal
        final Object object = unmarshaller.unmarshal(new File("C:\\Users\\anast\\IdeaProjects\\autoHibernate\\src\\main\\resources\\po.xml"));
        // Cast
        @SuppressWarnings("unchecked")
       // final SCL purchaseOrder = ((JAXBElement<SCL>) object).getValue();

                File scdFile = new File("src\\main\\resources\\twoVL_SSD_LIV2.ssd");

        SCL tsub = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(SCL.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            tsub = (SCL) jaxbUnmarshaller.unmarshal(scdFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }



        EntityManagerFactory factory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();


//        List<TSubstation> substations = tsub.getSubstation();
//        mySubstation = substations.get(0);
//        for (TVoltageLevel voltageLevel : mySubstation.getVoltageLevel()) {
//            System.err.println(voltageLevel+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//            manager.persist(voltageLevel);
//
//
//        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        manager.persist(object);

        manager.getTransaction().commit();

        factory.close();

    }
}
