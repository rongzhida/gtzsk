
package cn.gov.laho.gzfgoa.flow.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="in0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="in1" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "in0",
    "in1"
})
@XmlRootElement(name = "getListRuQing")
public class GetListRuQing {

    protected int in0;
    protected int in1;

    /**
     * Gets the value of the in0 property.
     * 
     */
    public int getIn0() {
        return in0;
    }

    /**
     * Sets the value of the in0 property.
     * 
     */
    public void setIn0(int value) {
        this.in0 = value;
    }

    /**
     * Gets the value of the in1 property.
     * 
     */
    public int getIn1() {
        return in1;
    }

    /**
     * Sets the value of the in1 property.
     * 
     */
    public void setIn1(int value) {
        this.in1 = value;
    }

}
