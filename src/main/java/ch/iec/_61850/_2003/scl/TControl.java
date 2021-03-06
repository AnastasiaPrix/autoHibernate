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
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tNaming">
 *       &lt;attribute name="datSet" type="{http://www.iec.ch/61850/2003/SCL}tName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tControl")
@XmlSeeAlso({
    TControlWithIEDName.class,
    TControlWithTriggerOpt.class
})
@Entity(name = "TControl")
@Table(name = "TCONTROL")
public abstract class TControl
    extends TNaming
    implements Equals, HashCode
{

    @XmlAttribute(name = "datSet")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datSet;

    /**
     * Gets the value of the datSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DAT_SET", length = 255)
    public String getDatSet() {
        return datSet;
    }

    /**
     * Sets the value of the datSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatSet(String value) {
        this.datSet = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TControl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TControl that = ((TControl) object);
        {
            String lhsDatSet;
            lhsDatSet = this.getDatSet();
            String rhsDatSet;
            rhsDatSet = that.getDatSet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datSet", lhsDatSet), LocatorUtils.property(thatLocator, "datSet", rhsDatSet), lhsDatSet, rhsDatSet)) {
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
            String theDatSet;
            theDatSet = this.getDatSet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datSet", theDatSet), currentHashCode, theDatSet);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
