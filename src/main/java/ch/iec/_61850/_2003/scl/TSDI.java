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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for tSDI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSDI">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tUnNaming">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="SDI" type="{http://www.iec.ch/61850/2003/SCL}tSDI"/>
 *         &lt;element name="DAI" type="{http://www.iec.ch/61850/2003/SCL}tDAI"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.iec.ch/61850/2003/SCL}tAttributeNameEnum" />
 *       &lt;attribute name="ix" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSDI", propOrder = {
    "sdiOrDAI"
})
@Entity(name = "TSDI")
@Table(name = "TSDI")
public class TSDI
    extends TUnNaming
    implements Equals, HashCode
{

    @XmlElements({
        @XmlElement(name = "SDI", type = TSDI.class),
        @XmlElement(name = "DAI", type = TDAI.class)
    })
    protected List<TUnNaming> sdiOrDAI;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "ix")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ix;

    /**
     * Gets the value of the sdiOrDAI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdiOrDAI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDIOrDAI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDI }
     * {@link TDAI }
     * 
     * 
     */
    @OneToMany(targetEntity = TUnNaming.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SDIOR_DAI_TSDI_HJID")
    public List<TUnNaming> getSDIOrDAI() {
        if (sdiOrDAI == null) {
            sdiOrDAI = new ArrayList<TUnNaming>();
        }
        return this.sdiOrDAI;
    }

    /**
     * 
     * 
     */
    public void setSDIOrDAI(List<TUnNaming> sdiOrDAI) {
        this.sdiOrDAI = sdiOrDAI;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_")
    public String getName() {
        return name;
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
     * Gets the value of the ix property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Basic
    @Column(name = "IX", precision = 10, scale = 0)
    public Long getIx() {
        return ix;
    }

    /**
     * Sets the value of the ix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIx(Long value) {
        this.ix = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TSDI)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TSDI that = ((TSDI) object);
        {
            List<TUnNaming> lhsSDIOrDAI;
            lhsSDIOrDAI = (((this.sdiOrDAI!= null)&&(!this.sdiOrDAI.isEmpty()))?this.getSDIOrDAI():null);
            List<TUnNaming> rhsSDIOrDAI;
            rhsSDIOrDAI = (((that.sdiOrDAI!= null)&&(!that.sdiOrDAI.isEmpty()))?that.getSDIOrDAI():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sdiOrDAI", lhsSDIOrDAI), LocatorUtils.property(thatLocator, "sdiOrDAI", rhsSDIOrDAI), lhsSDIOrDAI, rhsSDIOrDAI)) {
                return false;
            }
        }
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
            Long lhsIx;
            lhsIx = this.getIx();
            Long rhsIx;
            rhsIx = that.getIx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ix", lhsIx), LocatorUtils.property(thatLocator, "ix", rhsIx), lhsIx, rhsIx)) {
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
            List<TUnNaming> theSDIOrDAI;
            theSDIOrDAI = (((this.sdiOrDAI!= null)&&(!this.sdiOrDAI.isEmpty()))?this.getSDIOrDAI():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sdiOrDAI", theSDIOrDAI), currentHashCode, theSDIOrDAI);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Long theIx;
            theIx = this.getIx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ix", theIx), currentHashCode, theIx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
