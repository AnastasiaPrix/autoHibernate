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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for tSubstation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSubstation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tEquipmentContainer">
 *       &lt;sequence>
 *         &lt;element name="VoltageLevel" type="{http://www.iec.ch/61850/2003/SCL}tVoltageLevel" maxOccurs="unbounded"/>
 *         &lt;element name="Function" type="{http://www.iec.ch/61850/2003/SCL}tFunction" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tSubstation", propOrder = {
    "voltageLevel",
    "function"
})
@Entity(name = "TSubstation")
@Table(name = "TSUBSTATION")
public class TSubstation
    extends TEquipmentContainer
    implements Equals, HashCode
{

    @XmlElement(name = "VoltageLevel", required = true)
    protected List<TVoltageLevel> voltageLevel;
    @XmlElement(name = "Function")
    protected List<TFunction> function;

    /**
     * Gets the value of the voltageLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voltageLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoltageLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TVoltageLevel }
     * 
     * 
     */
    @OneToMany(targetEntity = TVoltageLevel.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VOLTAGE_LEVEL_TSUBSTATION_HJ_0")
    public List<TVoltageLevel> getVoltageLevel() {
        if (voltageLevel == null) {
            voltageLevel = new ArrayList<TVoltageLevel>();
        }
        return this.voltageLevel;
    }

    /**
     * 
     * 
     */
    public void setVoltageLevel(List<TVoltageLevel> voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    /**
     * Gets the value of the function property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFunction }
     * 
     * 
     */
    @OneToMany(targetEntity = TFunction.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FUNCTION__TSUBSTATION_HJID")
    public List<TFunction> getFunction() {
        if (function == null) {
            function = new ArrayList<TFunction>();
        }
        return this.function;
    }

    /**
     * 
     * 
     */
    public void setFunction(List<TFunction> function) {
        this.function = function;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TSubstation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TSubstation that = ((TSubstation) object);
        {
            List<TVoltageLevel> lhsVoltageLevel;
            lhsVoltageLevel = (((this.voltageLevel!= null)&&(!this.voltageLevel.isEmpty()))?this.getVoltageLevel():null);
            List<TVoltageLevel> rhsVoltageLevel;
            rhsVoltageLevel = (((that.voltageLevel!= null)&&(!that.voltageLevel.isEmpty()))?that.getVoltageLevel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voltageLevel", lhsVoltageLevel), LocatorUtils.property(thatLocator, "voltageLevel", rhsVoltageLevel), lhsVoltageLevel, rhsVoltageLevel)) {
                return false;
            }
        }
        {
            List<TFunction> lhsFunction;
            lhsFunction = (((this.function!= null)&&(!this.function.isEmpty()))?this.getFunction():null);
            List<TFunction> rhsFunction;
            rhsFunction = (((that.function!= null)&&(!that.function.isEmpty()))?that.getFunction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "function", lhsFunction), LocatorUtils.property(thatLocator, "function", rhsFunction), lhsFunction, rhsFunction)) {
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
            List<TVoltageLevel> theVoltageLevel;
            theVoltageLevel = (((this.voltageLevel!= null)&&(!this.voltageLevel.isEmpty()))?this.getVoltageLevel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voltageLevel", theVoltageLevel), currentHashCode, theVoltageLevel);
        }
        {
            List<TFunction> theFunction;
            theFunction = (((this.function!= null)&&(!this.function.isEmpty()))?this.getFunction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "function", theFunction), currentHashCode, theFunction);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}