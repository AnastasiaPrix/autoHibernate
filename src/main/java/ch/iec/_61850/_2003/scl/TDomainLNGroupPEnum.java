//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.13 at 07:58:15 PM MSK 
//


package ch.iec._61850._2003.scl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDomainLNGroupPEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tDomainLNGroupPEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;pattern value="P[A-Z]*"/>
 *     &lt;enumeration value="PDIF"/>
 *     &lt;enumeration value="PDIS"/>
 *     &lt;enumeration value="PDIR"/>
 *     &lt;enumeration value="PDOP"/>
 *     &lt;enumeration value="PDUP"/>
 *     &lt;enumeration value="PFRC"/>
 *     &lt;enumeration value="PHAR"/>
 *     &lt;enumeration value="PHIZ"/>
 *     &lt;enumeration value="PIOC"/>
 *     &lt;enumeration value="PMRI"/>
 *     &lt;enumeration value="PMSS"/>
 *     &lt;enumeration value="POPF"/>
 *     &lt;enumeration value="PPAM"/>
 *     &lt;enumeration value="PSCH"/>
 *     &lt;enumeration value="PSDE"/>
 *     &lt;enumeration value="PTEF"/>
 *     &lt;enumeration value="PTOC"/>
 *     &lt;enumeration value="PTOF"/>
 *     &lt;enumeration value="PTOV"/>
 *     &lt;enumeration value="PTRC"/>
 *     &lt;enumeration value="PTTR"/>
 *     &lt;enumeration value="PTUC"/>
 *     &lt;enumeration value="PTUV"/>
 *     &lt;enumeration value="PUPF"/>
 *     &lt;enumeration value="PTUF"/>
 *     &lt;enumeration value="PVOC"/>
 *     &lt;enumeration value="PVPH"/>
 *     &lt;enumeration value="PZSU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tDomainLNGroupPEnum")
@XmlEnum
public enum TDomainLNGroupPEnum {

    PDIF,
    PDIS,
    PDIR,
    PDOP,
    PDUP,
    PFRC,
    PHAR,
    PHIZ,
    PIOC,
    PMRI,
    PMSS,
    POPF,
    PPAM,
    PSCH,
    PSDE,
    PTEF,
    PTOC,
    PTOF,
    PTOV,
    PTRC,
    PTTR,
    PTUC,
    PTUV,
    PUPF,
    PTUF,
    PVOC,
    PVPH,
    PZSU;

    public String value() {
        return name();
    }

    public static TDomainLNGroupPEnum fromValue(String v) {
        return valueOf(v);
    }

}
