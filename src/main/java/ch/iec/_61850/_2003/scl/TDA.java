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
 * <p>Java class for tDA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tAbstractDataAttribute">
 *       &lt;attGroup ref="{http://www.iec.ch/61850/2003/SCL}agDATrgOp"/>
 *       &lt;attribute name="fc" use="required" type="{http://www.iec.ch/61850/2003/SCL}tFCEnum" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDA")
@Entity(name = "TDA")
@Table(name = "TDA")
public class TDA
    extends TAbstractDataAttribute
    implements Equals, HashCode
{

    @XmlAttribute(name = "fc", required = true)
    protected TFCEnum fc;
    @XmlAttribute(name = "dchg")
    protected Boolean dchg;
    @XmlAttribute(name = "qchg")
    protected Boolean qchg;
    @XmlAttribute(name = "dupd")
    protected Boolean dupd;

    /**
     * Gets the value of the fc property.
     * 
     * @return
     *     possible object is
     *     {@link TFCEnum }
     *     
     */
    @Basic
    @Column(name = "FC", length = 255)
    @Enumerated(EnumType.STRING)
    public TFCEnum getFc() {
        return fc;
    }

    /**
     * Sets the value of the fc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFCEnum }
     *     
     */
    public void setFc(TFCEnum value) {
        this.fc = value;
    }

    /**
     * Gets the value of the dchg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DCHG")
    public boolean isDchg() {
        if (dchg == null) {
            return false;
        } else {
            return dchg;
        }
    }

    /**
     * Sets the value of the dchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDchg(Boolean value) {
        this.dchg = value;
    }

    /**
     * Gets the value of the qchg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "QCHG")
    public boolean isQchg() {
        if (qchg == null) {
            return false;
        } else {
            return qchg;
        }
    }

    /**
     * Sets the value of the qchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQchg(Boolean value) {
        this.qchg = value;
    }

    /**
     * Gets the value of the dupd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DUPD")
    public boolean isDupd() {
        if (dupd == null) {
            return false;
        } else {
            return dupd;
        }
    }

    /**
     * Sets the value of the dupd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDupd(Boolean value) {
        this.dupd = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TDA)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TDA that = ((TDA) object);
        {
            TFCEnum lhsFc;
            lhsFc = this.getFc();
            TFCEnum rhsFc;
            rhsFc = that.getFc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fc", lhsFc), LocatorUtils.property(thatLocator, "fc", rhsFc), lhsFc, rhsFc)) {
                return false;
            }
        }
        {
            boolean lhsDchg;
            lhsDchg = ((this.dchg!= null)?this.isDchg():false);
            boolean rhsDchg;
            rhsDchg = ((that.dchg!= null)?that.isDchg():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dchg", lhsDchg), LocatorUtils.property(thatLocator, "dchg", rhsDchg), lhsDchg, rhsDchg)) {
                return false;
            }
        }
        {
            boolean lhsQchg;
            lhsQchg = ((this.qchg!= null)?this.isQchg():false);
            boolean rhsQchg;
            rhsQchg = ((that.qchg!= null)?that.isQchg():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qchg", lhsQchg), LocatorUtils.property(thatLocator, "qchg", rhsQchg), lhsQchg, rhsQchg)) {
                return false;
            }
        }
        {
            boolean lhsDupd;
            lhsDupd = ((this.dupd!= null)?this.isDupd():false);
            boolean rhsDupd;
            rhsDupd = ((that.dupd!= null)?that.isDupd():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dupd", lhsDupd), LocatorUtils.property(thatLocator, "dupd", rhsDupd), lhsDupd, rhsDupd)) {
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
            TFCEnum theFc;
            theFc = this.getFc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fc", theFc), currentHashCode, theFc);
        }
        {
            boolean theDchg;
            theDchg = ((this.dchg!= null)?this.isDchg():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dchg", theDchg), currentHashCode, theDchg);
        }
        {
            boolean theQchg;
            theQchg = ((this.qchg!= null)?this.isQchg():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qchg", theQchg), currentHashCode, theQchg);
        }
        {
            boolean theDupd;
            theDupd = ((this.dupd!= null)?this.isDupd():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dupd", theDupd), currentHashCode, theDupd);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
