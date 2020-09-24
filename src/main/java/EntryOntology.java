import ch.iec._61850._2003.scl.*;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;


import javax.persistence.EntityManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;

public class EntryOntology {
    private static Map<Long, String> tNamingHashMap = new HashMap<Long, String>();
    private static Map<Long, String> tConductingEquipmentHashMap = new HashMap<Long, String>();
    private static Map<Long, String> tConnectivityNodeHashMap = new HashMap<Long, String>();
    private static Map<Long, String> tAnyContentHashMap = new HashMap<Long, String>();
    private static Map<Long, Long> tBaseHashMap = new HashMap<Long, Long>();
    private static Map<String, OntologyClass> keyClass = new HashMap<String, OntologyClass>();
    private static List<Long> keyOfBay = new ArrayList<Long>();
    private static List<Long> keyOfVoltage = new ArrayList<Long>();
    private static Map<Long, String> tWindingHashMap = new HashMap<Long, String>();
    private static Map<Long, Long> conectionPtw = new HashMap<Long, Long>();
    private static Map<Long, String> voltageMap = new HashMap<Long, String>();
    private static Map<Long, List<String>> hasNodeMap = new HashMap<Long, List<String>>();
    private static Map<String, String> voltageBus = new HashMap<String, String>();
    private static Map<String, List<String>> hasNodeBus = new HashMap<String, List<String>>();
    private static Map<Long, List<Long>> mapVoltagePS = new HashMap<Long, List<Long>>();
    private static Map<String, Integer> mapVoltageType = new HashMap<String, Integer>();

    public static void entryInOntology(EntityManager manager) throws OWLOntologyCreationException, FileNotFoundException, OWLOntologyStorageException {

        keyClass.put("CBR", OntologyClass.XCBR);
        keyClass.put("DIS", OntologyClass.XSWI);
        keyClass.put("CTR", OntologyClass.TCTR);
        keyClass.put("VTR", OntologyClass.TVTR);
        keyClass.put("PTR", OntologyClass.YPTR);
        keyClass.put("IFL", OntologyClass.ZLIN);
        keyClass.put("LIN", OntologyClass.ZLIN);
        keyClass.put("CAB", OntologyClass.ZCAB);
        keyClass.put("GIL", OntologyClass.ZGIL);


        OWLOntologyManager managerOWL = OWLManager.createOWLOntologyManager();

        File file = new File("src\\main\\resources\\ont1_1_8.rdf");
        OWLOntology ontology = managerOWL.loadOntologyFromOntologyDocument(file);
        System.out.println("Load ontology: " + ontology);

        String ns = ontology.getOntologyID().getOntologyIRI().get().toString() + "#";
        OWLDataFactory df = managerOWL.getOWLDataFactory();

        manager.getTransaction().begin();

        List<TNaming> tNamingList = manager.createNativeQuery("SELECT name_, hjid FROM tnaming;", TNaming.class).getResultList();
        List<TConductingEquipment> tConductingEquipmentList = manager.createNativeQuery("SELECT type_, hjid, conducting_equipment_tbay_hj_0\n" +
                "\tFROM tconducting_equipment;", TConductingEquipment.class).getResultList();
        List<TConnectivityNode> tConnectivityNodeList = manager.createNativeQuery("SELECT path_name, hjid, connectivity_node_tbay_hjid\n" +
                "\tFROM tconnectivity_node;", TConnectivityNode.class).getResultList();
        List<Object[]> tTerminalList = manager.createNativeQuery("SELECT t.bay_name, t.connectivity_node, t.voltage_level_name, t.terminal_tabstract_conductin_0\n" +
                "\tFROM tterminal t;").getResultList();
        List<Object[]> tAnyContentFromOtherNamespaceList = manager.createNativeQuery("SELECT a.text, a.content_items_tany_content_f_0\n" +
                "\tFROM public.tany_content_from_other_name_1 a;").getResultList();
        List<Object[]> tBaseElementList = manager.createNativeQuery("SELECT b.hjid, b.text_tbase_element_hjid\n" +
                "\tFROM public.tbase_element b;").getResultList();
        List<TBay> tBayList = manager.createNativeQuery("SELECT hjid, bay_tvoltage_level_hjid\n" +
                "\tFROM public.tbay;", TBay.class).getResultList();
        List<Object[]> tVoltageLevelList = manager.createNativeQuery("SELECT v.hjid, v.voltage_level_tsubstation_hj_0\n" +
                "\tFROM public.tvoltage_level v;").getResultList();
        List<Object[]> tTransformerWindingList = manager.createNativeQuery("SELECT t.type_, t.hjid, t.transformer_winding_tpower_t_0\n" +
                "\tFROM public.ttransformer_winding t;").getResultList();

        for (TNaming tn : tNamingList) {
            tNamingHashMap.put(tn.getHjid(), tn.getName());

        }
        for (Object[] ta : tAnyContentFromOtherNamespaceList) {
            tAnyContentHashMap.put(Long.parseLong(ta[1].toString()), ta[0].toString());
        }
        for (Object[] tb : tBaseElementList) {
            if (tb[1] != null) {
                tBaseHashMap.put(Long.parseLong(tb[0].toString()), Long.parseLong(tb[1].toString()));
            }
        }
        for (TConductingEquipment ce : tConductingEquipmentList) {
            tConductingEquipmentHashMap.put(ce.getHjid(), ce.getType());
        }
        for (TConnectivityNode cn : tConnectivityNodeList) {
            tConnectivityNodeHashMap.put(cn.getHjid(), cn.getPathName());
        }
        for (Object[] tt : tTerminalList) {
            if (hasNodeMap.containsKey(Long.parseLong(tt[3].toString()))) {
                List<String> ttList = hasNodeMap.get(Long.parseLong(tt[3].toString()));
                ttList.add(tt[1].toString());
                hasNodeMap.put(Long.parseLong(tt[3].toString()), ttList);
            } else {
                List<String> ttList = new ArrayList<String>();
                ttList.add(tt[1].toString());
                hasNodeMap.put(Long.parseLong(tt[3].toString()), ttList);
            }
            if (hasNodeBus.containsKey(tt[0].toString())) {
                List<String> ttList = hasNodeBus.get(tt[0].toString());
                ttList.add(tt[1].toString());
                hasNodeBus.put(tt[0].toString(), ttList);
            } else {
                List<String> ttList = new ArrayList<String>();
                ttList.add(tt[1].toString());
                hasNodeBus.put(tt[0].toString(), ttList);
            }
            voltageMap.put(Long.parseLong(tt[3].toString()), tt[2].toString());
            voltageBus.put(tt[0].toString(), tt[2].toString());
        }
        for (TBay ty : tBayList) {
            keyOfBay.add(ty.getHjid());
        }
        for (Object[] tv : tVoltageLevelList) {
            keyOfVoltage.add(Long.parseLong(tv[0].toString()));
            if (mapVoltagePS.containsKey(Long.parseLong(tv[1].toString()))) {
                List<Long> listV = mapVoltagePS.get(Long.parseLong(tv[1].toString()));
                listV.add(Long.parseLong(tNamingHashMap.get(Long.parseLong(tv[0].toString()))));
                mapVoltagePS.put(Long.parseLong(tv[1].toString()), listV);
            } else {
                List<Long> listV = new ArrayList<Long>();
                listV.add(Long.parseLong(tNamingHashMap.get(Long.parseLong(tv[0].toString()))));
                mapVoltagePS.put(Long.parseLong(tv[1].toString()), listV);
            }
        }

        for (Map.Entry<Long, List<Long>> m : mapVoltagePS.entrySet()) {
            List<Long> l = m.getValue();
            Collections.sort(l);
            Collections.reverse(l);
            int typeV = 1;
            for (Long volt : l) {
                mapVoltageType.put(volt.toString(), typeV);
                if (l.size() == 3) {
                    typeV++;
                }

                if (l.size() == 2) {
                    typeV=+2;

                }
                if (l.size() == 4) {
                    typeV++;
                    if (typeV==4){
                        typeV=3;
                    }
                }

            }


        }

        for (Object[] tw : tTransformerWindingList) {
            tWindingHashMap.put(Long.parseLong(tw[1].toString()), tw[0].toString());
            conectionPtw.put(Long.parseLong(tw[1].toString()), Long.parseLong(tw[2].toString()));
        }

        //запись в БЗ
        for (Map.Entry<Long, String> item : tNamingHashMap.entrySet()) {
            if (tConnectivityNodeHashMap.containsKey(item.getKey())) {
                OWLIndividual ind = df.getOWLNamedIndividual(IRI.create(ns + tConnectivityNodeHashMap.get(item.getKey())));
                AxiomsAdding.AddingClass(ontology, managerOWL, df, ind, df.getOWLClass(IRI.create(ns + OntologyClass.ConnectivityNode)));
                AxiomsAdding.AddingData(ontology, managerOWL, df, ind, item.getKey().intValue(), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasName)));
            } else {
                String name = "";
                String indName = item.getValue();
                if (tWindingHashMap.containsKey(item.getKey())) {
                    indName = item.getValue() + "_" + tNamingHashMap.get(conectionPtw.get(item.getKey()));
                    OWLIndividual ind = df.getOWLNamedIndividual(IRI.create(ns + indName));
                    name = tWindingHashMap.get(item.getKey());
                    AxiomsAdding.AddingClass(ontology, managerOWL, df, ind, df.getOWLClass(IRI.create(ns + name)));
                    AxiomsAdding.AddingData(ontology, managerOWL, df, ind, item.getKey().intValue(), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasName)));
                    AxiomsAdding.adding(ontology, managerOWL, df, df.getOWLNamedIndividual(IRI.create(ns + tNamingHashMap.get(conectionPtw.get(item.getKey())))), ind, df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasPTW)));
                    AxiomsAdding.addingSeveralFromBd(ontology, managerOWL, df, ns, ind, hasNodeMap.get(item.getKey()), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasCN)));
                    AxiomsAdding.AddingData(ontology, managerOWL, df, df.getOWLNamedIndividual(IRI.create(ns + tNamingHashMap.get(conectionPtw.get(item.getKey())))), Integer.parseInt(voltageMap.get(item.getKey())), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasVoltage)));
                    AxiomsAdding.adding(ontology, managerOWL, df, ind, df.getOWLNamedIndividual(IRI.create(ns + "v_" + voltageMap.get(item.getKey()))), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasVoltageLevel)));
                    AxiomsAdding.adding(ontology, managerOWL, df, df.getOWLNamedIndividual(IRI.create(ns + tNamingHashMap.get(conectionPtw.get(item.getKey())))), df.getOWLNamedIndividual(IRI.create(ns + "v_" + voltageMap.get(item.getKey()))), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasVoltageLevel)));

                } else if (keyOfVoltage.contains(item.getKey())) {
                    indName = "v_" + item.getValue();
                    OWLIndividual ind = df.getOWLNamedIndividual(IRI.create(ns + indName));
                    AxiomsAdding.AddingClass(ontology, managerOWL, df, ind, df.getOWLClass(IRI.create(ns + indName)));
                    AxiomsAdding.AddingData(ontology, managerOWL, df, ind, item.getKey().intValue(), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasName)));
                    AxiomsAdding.AddingData(ontology, managerOWL, df, ind, Integer.parseInt(item.getValue()), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasVoltage)));
                    AxiomsAdding.AddingData(ontology, managerOWL, df, ind, mapVoltageType.get(item.getValue()), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.voltageType)));
                }
                OWLIndividual ind = df.getOWLNamedIndividual(IRI.create(ns + indName));
                if (tBaseHashMap.containsKey(item.getKey())) {
                    long l = tBaseHashMap.get(item.getKey());
                    name = tAnyContentHashMap.get(l);
                    AxiomsAdding.AddingClass(ontology, managerOWL, df, ind, df.getOWLClass(IRI.create(ns + name)));
                    AxiomsAdding.AddingData(ontology, managerOWL, df, ind, item.getKey().intValue(), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasName)));
                    if (voltageMap.containsKey(item.getKey())) {
                        AxiomsAdding.AddingData(ontology, managerOWL, df, ind, Integer.parseInt(voltageMap.get(item.getKey())), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasVoltage)));
                        AxiomsAdding.adding(ontology, managerOWL, df, ind, df.getOWLNamedIndividual(IRI.create(ns + "v_" + voltageMap.get(item.getKey()))), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasVoltageLevel)));
                        AxiomsAdding.addingSeveralFromBd(ontology, managerOWL, df, ns, ind, hasNodeMap.get(item.getKey()), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasCN)));
                    }
                    if (keyOfBay.contains(item.getKey())) {
                        AxiomsAdding.AddingData(ontology, managerOWL, df, ind, Integer.parseInt(voltageBus.get(item.getValue())), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasVoltage)));
                        AxiomsAdding.addingSeveralFromBd(ontology, managerOWL, df, ns, ind, hasNodeBus.get(item.getValue()), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasCN)));
                        AxiomsAdding.adding(ontology, managerOWL, df, ind, df.getOWLNamedIndividual(IRI.create(ns + "v_" + voltageBus.get(item.getValue()))), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasVoltageLevel)));
                    }
                } else if (tConductingEquipmentHashMap.containsKey(item.getKey()) && !tBaseHashMap.containsKey(item.getKey())) {
                    if (keyClass.containsKey(tConductingEquipmentHashMap.get(item.getKey()))) {
                        name = keyClass.get(tConductingEquipmentHashMap.get(item.getKey())).toString();
                        AxiomsAdding.AddingClass(ontology, managerOWL, df, ind, df.getOWLClass(IRI.create(ns + name)));
                        AxiomsAdding.AddingData(ontology, managerOWL, df, ind, item.getKey().intValue(), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasName)));
                        AxiomsAdding.addingSeveralFromBd(ontology, managerOWL, df, ns, ind, hasNodeMap.get(item.getKey()), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasCN)));
                        AxiomsAdding.AddingData(ontology, managerOWL, df, ind, Integer.parseInt(voltageMap.get(item.getKey())), df.getOWLDataProperty(IRI.create(ns + DataPropertyEnum.hasVoltage)));
                        AxiomsAdding.adding(ontology, managerOWL, df, ind, df.getOWLNamedIndividual(IRI.create(ns + "v_" + voltageMap.get(item.getKey()))), df.getOWLObjectProperty(IRI.create(ns + ProperrtyEnum.hasVoltageLevel)));
                    }
                }
            }
        }

        manager.getTransaction().commit();

        OutputStream out = new FileOutputStream("src\\main\\resources\\PS1.owl");

        managerOWL.saveOntology(ontology, out);
    }


}
