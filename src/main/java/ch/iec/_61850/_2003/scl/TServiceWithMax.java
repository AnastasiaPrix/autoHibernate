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
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for tServiceWithMax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tServiceWithMax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="max" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tServiceWithMax")
@XmlSeeAlso({
    TServiceWithMaxAndModify.class,
    TServiceWithMaxAndClient.class,
    TServiceWithMaxAndMaxAttributes.class
})
@Entity(name = "TServiceWithMax")
@Table(name = "TSERVICE_WITH_MAX")
@Inheritance(strategy = InheritanceType.JOINED)
public class TServiceWithMax
    implements Equals, HashCode
{

    @XmlAttribute(name = "max", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long max;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the max property.
     * 
     */
    @Basic
    @Column(name = "MAX_", precision = 10, scale = 0)
    public long getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(long value) {
        this.max = value;
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
        if (!(object instanceof TServiceWithMax)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TServiceWithMax that = ((TServiceWithMax) object);
        {
            long lhsMax;
            lhsMax = this.getMax();
            long rhsMax;
            rhsMax = that.getMax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "max", lhsMax), LocatorUtils.property(thatLocator, "max", rhsMax), lhsMax, rhsMax)) {
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
            long theMax;
            theMax = this.getMax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "max", theMax), currentHashCode, theMax);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
