//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.13 at 07:58:15 PM MSK 
//


package ch.iec._61850._2003.scl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tValKindEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tValKindEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;enumeration value="Spec"/>
 *     &lt;enumeration value="Conf"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="Set"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tValKindEnum")
@XmlEnum
public enum TValKindEnum {

    @XmlEnumValue("Spec")
    SPEC("Spec"),
    @XmlEnumValue("Conf")
    CONF("Conf"),
    RO("RO"),
    @XmlEnumValue("Set")
    SET("Set");
    private final String value;

    TValKindEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TValKindEnum fromValue(String v) {
        for (TValKindEnum c: TValKindEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
