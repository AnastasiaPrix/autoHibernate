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
 * <p>Java class for tTransformerWindingEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tTransformerWindingEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;enumeration value="PTW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tTransformerWindingEnum")
@XmlEnum
public enum TTransformerWindingEnum {

    PTW;

    public String value() {
        return name();
    }

    public static TTransformerWindingEnum fromValue(String v) {
        return valueOf(v);
    }

}
