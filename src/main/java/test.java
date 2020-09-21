import ch.iec._61850._2003.scl.SCL;
import ch.iec._61850._2003.scl.TSubstation;
import ch.iec._61850._2003.scl.TVoltageLevel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class test {
    private static TSubstation mySubstation;
    public static void main(String[] args) {
        File scdFile = new File("src\\main\\resources\\twoVL_SSD_LIV2.ssd");

        SCL tsub = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(SCL.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            tsub = (SCL) jaxbUnmarshaller.unmarshal(scdFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }


        List<TSubstation> substations = tsub.getSubstation();
        mySubstation = substations.get(0);
        for (TVoltageLevel voltageLevel : mySubstation.getVoltageLevel()) {
            System.err.println(voltageLevel+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


        }
    }
}
