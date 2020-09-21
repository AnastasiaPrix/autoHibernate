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
 * <p>Java class for tPredefinedPTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tPredefinedPTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="IP-SUBNET"/>
 *     &lt;enumeration value="IP-GATEWAY"/>
 *     &lt;enumeration value="OSI-NSAP"/>
 *     &lt;enumeration value="OSI-TSEL"/>
 *     &lt;enumeration value="OSI-SSEL"/>
 *     &lt;enumeration value="OSI-PSEL"/>
 *     &lt;enumeration value="OSI-AP-Title"/>
 *     &lt;enumeration value="OSI-AP-Invoke"/>
 *     &lt;enumeration value="OSI-AE-Qualifier"/>
 *     &lt;enumeration value="OSI-AE-Invoke"/>
 *     &lt;enumeration value="MAC-Address"/>
 *     &lt;enumeration value="APPID"/>
 *     &lt;enumeration value="VLAN-PRIORITY"/>
 *     &lt;enumeration value="VLAN-ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tPredefinedPTypeEnum")
@XmlEnum
public enum TPredefinedPTypeEnum {

    IP("IP"),
    @XmlEnumValue("IP-SUBNET")
    IP_SUBNET("IP-SUBNET"),
    @XmlEnumValue("IP-GATEWAY")
    IP_GATEWAY("IP-GATEWAY"),
    @XmlEnumValue("OSI-NSAP")
    OSI_NSAP("OSI-NSAP"),
    @XmlEnumValue("OSI-TSEL")
    OSI_TSEL("OSI-TSEL"),
    @XmlEnumValue("OSI-SSEL")
    OSI_SSEL("OSI-SSEL"),
    @XmlEnumValue("OSI-PSEL")
    OSI_PSEL("OSI-PSEL"),
    @XmlEnumValue("OSI-AP-Title")
    OSI_AP_TITLE("OSI-AP-Title"),
    @XmlEnumValue("OSI-AP-Invoke")
    OSI_AP_INVOKE("OSI-AP-Invoke"),
    @XmlEnumValue("OSI-AE-Qualifier")
    OSI_AE_QUALIFIER("OSI-AE-Qualifier"),
    @XmlEnumValue("OSI-AE-Invoke")
    OSI_AE_INVOKE("OSI-AE-Invoke"),
    @XmlEnumValue("MAC-Address")
    MAC_ADDRESS("MAC-Address"),
    APPID("APPID"),
    @XmlEnumValue("VLAN-PRIORITY")
    VLAN_PRIORITY("VLAN-PRIORITY"),
    @XmlEnumValue("VLAN-ID")
    VLAN_ID("VLAN-ID");
    private final String value;

    TPredefinedPTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPredefinedPTypeEnum fromValue(String v) {
        for (TPredefinedPTypeEnum c: TPredefinedPTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
