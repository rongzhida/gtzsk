
package cn.gov.laho.fgk.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="args0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="args1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="args2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="args3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="args4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="args5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="args6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="args7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="args8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="args9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="args10" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "args0",
    "args1",
    "args2",
    "args3",
    "args4",
    "args5",
    "args6",
    "args7",
    "args8",
    "args9",
    "args10"
})
@XmlRootElement(name = "advancedSearchFileInfo")
public class AdvancedSearchFileInfo {

    @XmlElementRef(name = "args0", namespace = "http://webservice.fgk.com", type = JAXBElement.class)
    protected JAXBElement<String> args0;
    @XmlElementRef(name = "args1", namespace = "http://webservice.fgk.com", type = JAXBElement.class)
    protected JAXBElement<String> args1;
    @XmlElementRef(name = "args2", namespace = "http://webservice.fgk.com", type = JAXBElement.class)
    protected JAXBElement<String> args2;
    @XmlElementRef(name = "args3", namespace = "http://webservice.fgk.com", type = JAXBElement.class)
    protected JAXBElement<String> args3;
    @XmlElementRef(name = "args4", namespace = "http://webservice.fgk.com", type = JAXBElement.class)
    protected JAXBElement<String> args4;
    @XmlElementRef(name = "args5", namespace = "http://webservice.fgk.com", type = JAXBElement.class)
    protected JAXBElement<String> args5;
    @XmlElementRef(name = "args6", namespace = "http://webservice.fgk.com", type = JAXBElement.class)
    protected JAXBElement<String> args6;
    protected Integer args7;
    protected Integer args8;
    protected Integer args9;
    protected Integer args10;

    /**
     * Gets the value of the args0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgs0() {
        return args0;
    }

    /**
     * Sets the value of the args0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgs0(JAXBElement<String> value) {
        this.args0 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the args1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgs1() {
        return args1;
    }

    /**
     * Sets the value of the args1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgs1(JAXBElement<String> value) {
        this.args1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the args2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgs2() {
        return args2;
    }

    /**
     * Sets the value of the args2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgs2(JAXBElement<String> value) {
        this.args2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the args3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgs3() {
        return args3;
    }

    /**
     * Sets the value of the args3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgs3(JAXBElement<String> value) {
        this.args3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the args4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgs4() {
        return args4;
    }

    /**
     * Sets the value of the args4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgs4(JAXBElement<String> value) {
        this.args4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the args5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgs5() {
        return args5;
    }

    /**
     * Sets the value of the args5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgs5(JAXBElement<String> value) {
        this.args5 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the args6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgs6() {
        return args6;
    }

    /**
     * Sets the value of the args6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgs6(JAXBElement<String> value) {
        this.args6 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the args7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArgs7() {
        return args7;
    }

    /**
     * Sets the value of the args7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArgs7(Integer value) {
        this.args7 = value;
    }

    /**
     * Gets the value of the args8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArgs8() {
        return args8;
    }

    /**
     * Sets the value of the args8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArgs8(Integer value) {
        this.args8 = value;
    }

    /**
     * Gets the value of the args9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArgs9() {
        return args9;
    }

    /**
     * Sets the value of the args9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArgs9(Integer value) {
        this.args9 = value;
    }

    /**
     * Gets the value of the args10 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArgs10() {
        return args10;
    }

    /**
     * Sets the value of the args10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArgs10(Integer value) {
        this.args10 = value;
    }

}
