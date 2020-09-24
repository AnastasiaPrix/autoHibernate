import ch.iec._61850._2003.scl.*;

import org.hibernate.SessionFactory;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AutoСompleteBD {

    public static void main(String[] args) throws JAXBException, OWLOntologyCreationException, FileNotFoundException, OWLOntologyStorageException {

        JAXBContext context = JAXBContext.newInstance(SCL.class);

        // Unmarshaller
        final Unmarshaller unmarshaller = context.createUnmarshaller();
        // Unmarshal
        final SCL object = (SCL) unmarshaller.unmarshal(new File("src\\main\\resources\\twoVL_SSD_LIV2.ssd"));

        // запись в БД
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        manager.persist(object);

        manager.getTransaction().commit();

        EntryOntology.entryInOntology(manager);


        factory.close();

    }
}
