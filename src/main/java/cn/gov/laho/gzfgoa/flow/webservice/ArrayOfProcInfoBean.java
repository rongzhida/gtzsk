
package cn.gov.laho.gzfgoa.flow.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProcInfoBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProcInfoBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcInfoBean" type="{http://webservice.flow.gzfg.kwhope.com}ProcInfoBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProcInfoBean", propOrder = {
    "procInfoBean"
})
public class ArrayOfProcInfoBean {

    @XmlElement(name = "ProcInfoBean", nillable = true)
    protected List<ProcInfoBean> procInfoBean;

    /**
     * Gets the value of the procInfoBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procInfoBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcInfoBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcInfoBean }
     * 
     * 
     */
    public List<ProcInfoBean> getProcInfoBean() {
        if (procInfoBean == null) {
            procInfoBean = new ArrayList<ProcInfoBean>();
        }
        return this.procInfoBean;
    }

}
