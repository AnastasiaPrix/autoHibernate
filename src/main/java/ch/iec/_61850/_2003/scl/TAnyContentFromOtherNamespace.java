//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.13 at 07:58:15 PM MSK 
//


package ch.iec._61850._2003.scl;

import org.jvnet.hyperjaxb3.item.MixedItem;
import org.jvnet.hyperjaxb3.item.MixedItemUtils;
import org.jvnet.hyperjaxb3.xml.bind.JAXBContextUtils;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.ElementAsString;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.w3c.dom.Element;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for tAnyContentFromOtherNamespace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAnyContentFromOtherNamespace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAnyContentFromOtherNamespace", propOrder = {
    "content"
})
@XmlSeeAlso({
    TText.class,
    TPrivate.class,
    TLog.class,
    THitem.class,
    TAccessControl.class
})
@Entity(name = "TAnyContentFromOtherNamespace")
@Table(name = "TANY_CONTENT_FROM_OTHER_NAME_0")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TAnyContentFromOtherNamespace
    implements Equals, HashCode
{

    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<TAnyContentFromOtherNamespaceContentItem> contentItems;

    /**
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * {@link String }
     *
     *
     */
    @Transient
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     *
     *
     */
    public void setContent(List<Object> content) {
        this.content = content;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     *     always non-null
     */
    @Transient
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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

    @OneToMany(targetEntity = TAnyContentFromOtherNamespace.TAnyContentFromOtherNamespaceContentItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONTENT_ITEMS_TANY_CONTENT_F_0")
    public List<TAnyContentFromOtherNamespaceContentItem> getContentItems() {
        if (this.contentItems == null) {
            this.contentItems = new ArrayList<TAnyContentFromOtherNamespaceContentItem>();
        }
        if (MixedItemUtils.shouldBeWrapped(this.content)) {
            this.content = MixedItemUtils.wrap(this.content, this.contentItems, TAnyContentFromOtherNamespace.TAnyContentFromOtherNamespaceContentItem.class);
        }
        return this.contentItems;
    }

    public void setContentItems(List<TAnyContentFromOtherNamespaceContentItem> value) {
        this.content = null;
        this.contentItems = null;
        this.contentItems = value;
        if (this.contentItems == null) {
            this.contentItems = new ArrayList<TAnyContentFromOtherNamespaceContentItem>();
        }
        if (MixedItemUtils.shouldBeWrapped(this.content)) {
            this.content = MixedItemUtils.wrap(this.content, this.contentItems, TAnyContentFromOtherNamespace.TAnyContentFromOtherNamespaceContentItem.class);
        }
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TAnyContentFromOtherNamespace)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TAnyContentFromOtherNamespace that = ((TAnyContentFromOtherNamespace) object);
        {
            List<Object> lhsContent;
            lhsContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            List<Object> rhsContent;
            rhsContent = (((that.content!= null)&&(!that.content.isEmpty()))?that.getContent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
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
            List<Object> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "TAnyContentFromOtherNamespace$TAnyContentFromOtherNamespaceContentItem")
    @Table(name = "TANY_CONTENT_FROM_OTHER_NAME_1")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class TAnyContentFromOtherNamespaceContentItem
        implements MixedItem<Object>
    {

        @XmlAnyElement(lax = true)
        protected Object item;
        @XmlAttribute(name = "Text")
        protected String text;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;
        public final static String ItemObjectContextPath = "ch.iec._61850._2003.scl";

        /**
         * 
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        @Transient
        public Object getItem() {
            return item;
        }

        /**
         * 
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setItem(Object value) {
            this.item = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "text")
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
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

        @Basic
        @Column(name = "ITEM_ELEMENT")
        @Lob
        public String getItemElement() {
            if (this.getItem() instanceof Element) {
                return XmlAdapterUtils.unmarshall(ElementAsString.class, ((Element) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemElement(String target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshall(ElementAsString.class, target));
            }
        }

        @Basic
        @Column(name = "ITEM_OBJECT")
        @Lob
        public String getItemObject() {
            if (JAXBContextUtils.isElement(ItemObjectContextPath, this.getItem())) {
                return JAXBContextUtils.marshal(ItemObjectContextPath, this.getItem());
            } else {
                return null;
            }
        }

        public void setItemObject(String target) {
            if (target!= null) {
                setItem(JAXBContextUtils.unmarshal(ItemObjectContextPath, target));
            }
        }

    }

}
