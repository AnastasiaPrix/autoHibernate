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

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tConfLNs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tConfLNs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fixPrefix" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="fixLnInst" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tConfLNs")
@Entity(name = "TConfLNs")
@Table(name = "TCONF_LNS")
@Inheritance(strategy = InheritanceType.JOINED)
public class TConfLNs
    implements Equals, HashCode
{

    @XmlAttribute(name = "fixPrefix")
    protected Boolean fixPrefix;
    @XmlAttribute(name = "fixLnInst")
    protected Boolean fixLnInst;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the fixPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "FIX_PREFIX")
    public boolean isFixPrefix() {
        if (fixPrefix == null) {
            return false;
        } else {
            return fixPrefix;
        }
    }

    /**
     * Sets the value of the fixPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixPrefix(Boolean value) {
        this.fixPrefix = value;
    }

    /**
     * Gets the value of the fixLnInst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "FIX_LN_INST")
    public boolean isFixLnInst() {
        if (fixLnInst == null) {
            return false;
        } else {
            return fixLnInst;
        }
    }

    /**
     * Sets the value of the fixLnInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixLnInst(Boolean value) {
        this.fixLnInst = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TConfLNs)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TConfLNs that = ((TConfLNs) object);
        {
            boolean lhsFixPrefix;
            lhsFixPrefix = ((this.fixPrefix!= null)?this.isFixPrefix():false);
            boolean rhsFixPrefix;
            rhsFixPrefix = ((that.fixPrefix!= null)?that.isFixPrefix():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fixPrefix", lhsFixPrefix), LocatorUtils.property(thatLocator, "fixPrefix", rhsFixPrefix), lhsFixPrefix, rhsFixPrefix)) {
                return false;
            }
        }
        {
            boolean lhsFixLnInst;
            lhsFixLnInst = ((this.fixLnInst!= null)?this.isFixLnInst():false);
            boolean rhsFixLnInst;
            rhsFixLnInst = ((that.fixLnInst!= null)?that.isFixLnInst():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fixLnInst", lhsFixLnInst), LocatorUtils.property(thatLocator, "fixLnInst", rhsFixLnInst), lhsFixLnInst, rhsFixLnInst)) {
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
        int currentHashCode = 1;
        {
            boolean theFixPrefix;
            theFixPrefix = ((this.fixPrefix!= null)?this.isFixPrefix():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fixPrefix", theFixPrefix), currentHashCode, theFixPrefix);
        }
        {
            boolean theFixLnInst;
            theFixLnInst = ((this.fixLnInst!= null)?this.isFixLnInst():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fixLnInst", theFixLnInst), currentHashCode, theFixLnInst);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}