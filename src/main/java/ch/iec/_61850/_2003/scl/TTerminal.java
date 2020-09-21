//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.13 at 07:58:15 PM MSK 
//


package ch.iec._61850._2003.scl;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tTerminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTerminal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tUnNaming">
 *       &lt;attribute name="name" type="{http://www.iec.ch/61850/2003/SCL}tAnyName" default="" />
 *       &lt;attribute name="connectivityNode" use="required" type="{http://www.iec.ch/61850/2003/SCL}tRef" />
 *       &lt;attribute name="substationName" use="required" type="{http://www.iec.ch/61850/2003/SCL}tName" />
 *       &lt;attribute name="voltageLevelName" use="required" type="{http://www.iec.ch/61850/2003/SCL}tName" />
 *       &lt;attribute name="bayName" use="required" type="{http://www.iec.ch/61850/2003/SCL}tName" />
 *       &lt;attribute name="cNodeName" use="required" type="{http://www.iec.ch/61850/2003/SCL}tName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTerminal")
@Entity(name = "TTerminal")
@Table(name = "TTERMINAL")
public class TTerminal
    extends TUnNaming
    implements Equals, HashCode
{

    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "connectivityNode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String connectivityNode;
    @XmlAttribute(name = "substationName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String substationName;
    @XmlAttribute(name = "voltageLevelName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String voltageLevelName;
    @XmlAttribute(name = "bayName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bayName;
    @XmlAttribute(name = "cNodeName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cNodeName;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_", length = 255)
    public String getName() {
        if (name == null) {
            return "";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the connectivityNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONNECTIVITY_NODE", length = 255)
    public String getConnectivityNode() {
        return connectivityNode;
    }

    /**
     * Sets the value of the connectivityNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectivityNode(String value) {
        this.connectivityNode = value;
    }

    /**
     * Gets the value of the substationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SUBSTATION_NAME", length = 255)
    public String getSubstationName() {
        return substationName;
    }

    /**
     * Sets the value of the substationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationName(String value) {
        this.substationName = value;
    }

    /**
     * Gets the value of the voltageLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VOLTAGE_LEVEL_NAME", length = 255)
    public String getVoltageLevelName() {
        return voltageLevelName;
    }

    /**
     * Sets the value of the voltageLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoltageLevelName(String value) {
        this.voltageLevelName = value;
    }

    /**
     * Gets the value of the bayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BAY_NAME", length = 255)
    public String getBayName() {
        return bayName;
    }

    /**
     * Sets the value of the bayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBayName(String value) {
        this.bayName = value;
    }

    /**
     * Gets the value of the cNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CNODE_NAME", length = 255)
    public String getCNodeName() {
        return cNodeName;
    }

    /**
     * Sets the value of the cNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNodeName(String value) {
        this.cNodeName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TTerminal)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TTerminal that = ((TTerminal) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsConnectivityNode;
            lhsConnectivityNode = this.getConnectivityNode();
            String rhsConnectivityNode;
            rhsConnectivityNode = that.getConnectivityNode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectivityNode", lhsConnectivityNode), LocatorUtils.property(thatLocator, "connectivityNode", rhsConnectivityNode), lhsConnectivityNode, rhsConnectivityNode)) {
                return false;
            }
        }
        {
            String lhsSubstationName;
            lhsSubstationName = this.getSubstationName();
            String rhsSubstationName;
            rhsSubstationName = that.getSubstationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substationName", lhsSubstationName), LocatorUtils.property(thatLocator, "substationName", rhsSubstationName), lhsSubstationName, rhsSubstationName)) {
                return false;
            }
        }
        {
            String lhsVoltageLevelName;
            lhsVoltageLevelName = this.getVoltageLevelName();
            String rhsVoltageLevelName;
            rhsVoltageLevelName = that.getVoltageLevelName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voltageLevelName", lhsVoltageLevelName), LocatorUtils.property(thatLocator, "voltageLevelName", rhsVoltageLevelName), lhsVoltageLevelName, rhsVoltageLevelName)) {
                return false;
            }
        }
        {
            String lhsBayName;
            lhsBayName = this.getBayName();
            String rhsBayName;
            rhsBayName = that.getBayName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bayName", lhsBayName), LocatorUtils.property(thatLocator, "bayName", rhsBayName), lhsBayName, rhsBayName)) {
                return false;
            }
        }
        {
            String lhsCNodeName;
            lhsCNodeName = this.getCNodeName();
            String rhsCNodeName;
            rhsCNodeName = that.getCNodeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cNodeName", lhsCNodeName), LocatorUtils.property(thatLocator, "cNodeName", rhsCNodeName), lhsCNodeName, rhsCNodeName)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theConnectivityNode;
            theConnectivityNode = this.getConnectivityNode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectivityNode", theConnectivityNode), currentHashCode, theConnectivityNode);
        }
        {
            String theSubstationName;
            theSubstationName = this.getSubstationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substationName", theSubstationName), currentHashCode, theSubstationName);
        }
        {
            String theVoltageLevelName;
            theVoltageLevelName = this.getVoltageLevelName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voltageLevelName", theVoltageLevelName), currentHashCode, theVoltageLevelName);
        }
        {
            String theBayName;
            theBayName = this.getBayName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bayName", theBayName), currentHashCode, theBayName);
        }
        {
            String theCNodeName;
            theCNodeName = this.getCNodeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cNodeName", theCNodeName), currentHashCode, theCNodeName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
