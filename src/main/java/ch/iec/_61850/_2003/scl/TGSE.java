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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tGSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGSE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tControlBlock">
 *       &lt;sequence>
 *         &lt;element name="MinTime" type="{http://www.iec.ch/61850/2003/SCL}tDurationInMilliSec" minOccurs="0"/>
 *         &lt;element name="MaxTime" type="{http://www.iec.ch/61850/2003/SCL}tDurationInMilliSec" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGSE", propOrder = {
    "minTime",
    "maxTime"
})
@Entity(name = "TGSE")
@Table(name = "TGSE")
public class TGSE
    extends TControlBlock
    implements Equals, HashCode
{

    @XmlElement(name = "MinTime")
    protected TDurationInMilliSec minTime;
    @XmlElement(name = "MaxTime")
    protected TDurationInMilliSec maxTime;

    /**
     * Gets the value of the minTime property.
     * 
     * @return
     *     possible object is
     *     {@link TDurationInMilliSec }
     *     
     */
    @ManyToOne(targetEntity = TDurationInMilliSec.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MIN_TIME_TGSE_HJID")
    public TDurationInMilliSec getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDurationInMilliSec }
     *     
     */
    public void setMinTime(TDurationInMilliSec value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the maxTime property.
     * 
     * @return
     *     possible object is
     *     {@link TDurationInMilliSec }
     *     
     */
    @ManyToOne(targetEntity = TDurationInMilliSec.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MAX_TIME_TGSE_HJID")
    public TDurationInMilliSec getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDurationInMilliSec }
     *     
     */
    public void setMaxTime(TDurationInMilliSec value) {
        this.maxTime = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TGSE)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TGSE that = ((TGSE) object);
        {
            TDurationInMilliSec lhsMinTime;
            lhsMinTime = this.getMinTime();
            TDurationInMilliSec rhsMinTime;
            rhsMinTime = that.getMinTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minTime", lhsMinTime), LocatorUtils.property(thatLocator, "minTime", rhsMinTime), lhsMinTime, rhsMinTime)) {
                return false;
            }
        }
        {
            TDurationInMilliSec lhsMaxTime;
            lhsMaxTime = this.getMaxTime();
            TDurationInMilliSec rhsMaxTime;
            rhsMaxTime = that.getMaxTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxTime", lhsMaxTime), LocatorUtils.property(thatLocator, "maxTime", rhsMaxTime), lhsMaxTime, rhsMaxTime)) {
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
            TDurationInMilliSec theMinTime;
            theMinTime = this.getMinTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minTime", theMinTime), currentHashCode, theMinTime);
        }
        {
            TDurationInMilliSec theMaxTime;
            theMaxTime = this.getMaxTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxTime", theMaxTime), currentHashCode, theMaxTime);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
