
package cn.gov.laho.gzfgoa.flow.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcInfoBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcInfoBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comeFlowNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comeFlowOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compdatestr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsmId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dsmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsmValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flowBjck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowLbyj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowLdps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowPsld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowPsly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowztc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jbxhOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jbxhUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="list" type="{http://webservice.flow.gzfg.kwhope.com}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="procName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="psjld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="psjldId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="publicAreaId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="receiveDataStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedateStrend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urgencyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="xbOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcInfoBean", propOrder = {
    "actId",
    "actName",
    "coding",
    "comeFlowNum",
    "comeFlowOrg",
    "compdatestr",
    "countnum",
    "dataLink",
    "directOrg",
    "docket",
    "dsmId",
    "dsmName",
    "dsmValue",
    "fileNum",
    "flag",
    "flowBjck",
    "flowEndTime",
    "flowLbyj",
    "flowLdps",
    "flowNum",
    "flowPsld",
    "flowPsly",
    "flowStartTime",
    "flowTitle",
    "flowztc",
    "formId",
    "id",
    "jbxhOrg",
    "jbxhUserName",
    "list",
    "num",
    "orgName",
    "procId",
    "procName",
    "psjld",
    "psjldId",
    "publicAreaId",
    "receiveDataStr",
    "receivedateStr",
    "receivedateStrend",
    "reserve",
    "selectYear",
    "senddate",
    "sendor",
    "state",
    "title",
    "typeId",
    "unit",
    "urgencyFlag",
    "userId",
    "userName",
    "workItemId",
    "xbOrg"
})
public class ProcInfoBean {

    protected Integer actId;
    @XmlElementRef(name = "actName", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> actName;
    @XmlElementRef(name = "coding", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> coding;
    @XmlElementRef(name = "comeFlowNum", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> comeFlowNum;
    @XmlElementRef(name = "comeFlowOrg", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> comeFlowOrg;
    @XmlElementRef(name = "compdatestr", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> compdatestr;
    protected Integer countnum;
    @XmlElementRef(name = "dataLink", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> dataLink;
    @XmlElementRef(name = "directOrg", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> directOrg;
    @XmlElementRef(name = "docket", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> docket;
    protected Integer dsmId;
    @XmlElementRef(name = "dsmName", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> dsmName;
    @XmlElementRef(name = "dsmValue", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> dsmValue;
    @XmlElementRef(name = "fileNum", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> fileNum;
    protected Integer flag;
    @XmlElementRef(name = "flowBjck", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowBjck;
    @XmlElementRef(name = "flowEndTime", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowEndTime;
    @XmlElementRef(name = "flowLbyj", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowLbyj;
    @XmlElementRef(name = "flowLdps", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowLdps;
    @XmlElementRef(name = "flowNum", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowNum;
    @XmlElementRef(name = "flowPsld", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowPsld;
    @XmlElementRef(name = "flowPsly", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowPsly;
    @XmlElementRef(name = "flowStartTime", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowStartTime;
    @XmlElementRef(name = "flowTitle", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowTitle;
    @XmlElementRef(name = "flowztc", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> flowztc;
    protected Integer formId;
    protected Integer id;
    @XmlElementRef(name = "jbxhOrg", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> jbxhOrg;
    @XmlElementRef(name = "jbxhUserName", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> jbxhUserName;
    @XmlElementRef(name = "list", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> list;
    protected Integer num;
    @XmlElementRef(name = "orgName", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> orgName;
    protected Integer procId;
    @XmlElementRef(name = "procName", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> procName;
    @XmlElementRef(name = "psjld", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> psjld;
    protected Integer psjldId;
    protected Integer publicAreaId;
    @XmlElementRef(name = "receiveDataStr", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> receiveDataStr;
    @XmlElementRef(name = "receivedateStr", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> receivedateStr;
    @XmlElementRef(name = "receivedateStrend", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> receivedateStrend;
    @XmlElementRef(name = "reserve", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> reserve;
    @XmlElementRef(name = "selectYear", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> selectYear;
    @XmlElementRef(name = "senddate", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> senddate;
    @XmlElementRef(name = "sendor", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> sendor;
    @XmlElementRef(name = "state", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "title", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> title;
    protected Integer typeId;
    @XmlElementRef(name = "unit", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> unit;
    @XmlElementRef(name = "urgencyFlag", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> urgencyFlag;
    protected Integer userId;
    @XmlElementRef(name = "userName", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> userName;
    protected Integer workItemId;
    @XmlElementRef(name = "xbOrg", namespace = "http://webservice.flow.gzfg.kwhope.com", type = JAXBElement.class)
    protected JAXBElement<String> xbOrg;

    /**
     * Gets the value of the actId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActId() {
        return actId;
    }

    /**
     * Sets the value of the actId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActId(Integer value) {
        this.actId = value;
    }

    /**
     * Gets the value of the actName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActName() {
        return actName;
    }

    /**
     * Sets the value of the actName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActName(JAXBElement<String> value) {
        this.actName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoding() {
        return coding;
    }

    /**
     * Sets the value of the coding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoding(JAXBElement<String> value) {
        this.coding = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the comeFlowNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComeFlowNum() {
        return comeFlowNum;
    }

    /**
     * Sets the value of the comeFlowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComeFlowNum(JAXBElement<String> value) {
        this.comeFlowNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the comeFlowOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComeFlowOrg() {
        return comeFlowOrg;
    }

    /**
     * Sets the value of the comeFlowOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComeFlowOrg(JAXBElement<String> value) {
        this.comeFlowOrg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the compdatestr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompdatestr() {
        return compdatestr;
    }

    /**
     * Sets the value of the compdatestr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompdatestr(JAXBElement<String> value) {
        this.compdatestr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the countnum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountnum() {
        return countnum;
    }

    /**
     * Sets the value of the countnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountnum(Integer value) {
        this.countnum = value;
    }

    /**
     * Gets the value of the dataLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataLink() {
        return dataLink;
    }

    /**
     * Sets the value of the dataLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataLink(JAXBElement<String> value) {
        this.dataLink = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the directOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectOrg() {
        return directOrg;
    }

    /**
     * Sets the value of the directOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectOrg(JAXBElement<String> value) {
        this.directOrg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docket property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocket() {
        return docket;
    }

    /**
     * Sets the value of the docket property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocket(JAXBElement<String> value) {
        this.docket = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dsmId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDsmId() {
        return dsmId;
    }

    /**
     * Sets the value of the dsmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDsmId(Integer value) {
        this.dsmId = value;
    }

    /**
     * Gets the value of the dsmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDsmName() {
        return dsmName;
    }

    /**
     * Sets the value of the dsmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDsmName(JAXBElement<String> value) {
        this.dsmName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dsmValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDsmValue() {
        return dsmValue;
    }

    /**
     * Sets the value of the dsmValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDsmValue(JAXBElement<String> value) {
        this.dsmValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileNum() {
        return fileNum;
    }

    /**
     * Sets the value of the fileNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileNum(JAXBElement<String> value) {
        this.fileNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlag(Integer value) {
        this.flag = value;
    }

    /**
     * Gets the value of the flowBjck property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowBjck() {
        return flowBjck;
    }

    /**
     * Sets the value of the flowBjck property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowBjck(JAXBElement<String> value) {
        this.flowBjck = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowEndTime() {
        return flowEndTime;
    }

    /**
     * Sets the value of the flowEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowEndTime(JAXBElement<String> value) {
        this.flowEndTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowLbyj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowLbyj() {
        return flowLbyj;
    }

    /**
     * Sets the value of the flowLbyj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowLbyj(JAXBElement<String> value) {
        this.flowLbyj = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowLdps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowLdps() {
        return flowLdps;
    }

    /**
     * Sets the value of the flowLdps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowLdps(JAXBElement<String> value) {
        this.flowLdps = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowNum() {
        return flowNum;
    }

    /**
     * Sets the value of the flowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowNum(JAXBElement<String> value) {
        this.flowNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowPsld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowPsld() {
        return flowPsld;
    }

    /**
     * Sets the value of the flowPsld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowPsld(JAXBElement<String> value) {
        this.flowPsld = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowPsly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowPsly() {
        return flowPsly;
    }

    /**
     * Sets the value of the flowPsly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowPsly(JAXBElement<String> value) {
        this.flowPsly = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowStartTime() {
        return flowStartTime;
    }

    /**
     * Sets the value of the flowStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowStartTime(JAXBElement<String> value) {
        this.flowStartTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowTitle() {
        return flowTitle;
    }

    /**
     * Sets the value of the flowTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowTitle(JAXBElement<String> value) {
        this.flowTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flowztc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowztc() {
        return flowztc;
    }

    /**
     * Sets the value of the flowztc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowztc(JAXBElement<String> value) {
        this.flowztc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFormId(Integer value) {
        this.formId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the jbxhOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJbxhOrg() {
        return jbxhOrg;
    }

    /**
     * Sets the value of the jbxhOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJbxhOrg(JAXBElement<String> value) {
        this.jbxhOrg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jbxhUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJbxhUserName() {
        return jbxhUserName;
    }

    /**
     * Sets the value of the jbxhUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJbxhUserName(JAXBElement<String> value) {
        this.jbxhUserName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setList(JAXBElement<ArrayOfString> value) {
        this.list = ((JAXBElement<ArrayOfString> ) value);
    }

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum(Integer value) {
        this.num = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgName(JAXBElement<String> value) {
        this.orgName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the procId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcId() {
        return procId;
    }

    /**
     * Sets the value of the procId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcId(Integer value) {
        this.procId = value;
    }

    /**
     * Gets the value of the procName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcName() {
        return procName;
    }

    /**
     * Sets the value of the procName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcName(JAXBElement<String> value) {
        this.procName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the psjld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPsjld() {
        return psjld;
    }

    /**
     * Sets the value of the psjld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPsjld(JAXBElement<String> value) {
        this.psjld = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the psjldId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPsjldId() {
        return psjldId;
    }

    /**
     * Sets the value of the psjldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPsjldId(Integer value) {
        this.psjldId = value;
    }

    /**
     * Gets the value of the publicAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPublicAreaId() {
        return publicAreaId;
    }

    /**
     * Sets the value of the publicAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPublicAreaId(Integer value) {
        this.publicAreaId = value;
    }

    /**
     * Gets the value of the receiveDataStr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiveDataStr() {
        return receiveDataStr;
    }

    /**
     * Sets the value of the receiveDataStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiveDataStr(JAXBElement<String> value) {
        this.receiveDataStr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the receivedateStr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceivedateStr() {
        return receivedateStr;
    }

    /**
     * Sets the value of the receivedateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceivedateStr(JAXBElement<String> value) {
        this.receivedateStr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the receivedateStrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceivedateStrend() {
        return receivedateStrend;
    }

    /**
     * Sets the value of the receivedateStrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceivedateStrend(JAXBElement<String> value) {
        this.receivedateStrend = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReserve(JAXBElement<String> value) {
        this.reserve = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the selectYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectYear() {
        return selectYear;
    }

    /**
     * Sets the value of the selectYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectYear(JAXBElement<String> value) {
        this.selectYear = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the senddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenddate() {
        return senddate;
    }

    /**
     * Sets the value of the senddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenddate(JAXBElement<String> value) {
        this.senddate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sendor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendor() {
        return sendor;
    }

    /**
     * Sets the value of the sendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendor(JAXBElement<String> value) {
        this.sendor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnit(JAXBElement<String> value) {
        this.unit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urgencyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrgencyFlag() {
        return urgencyFlag;
    }

    /**
     * Sets the value of the urgencyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrgencyFlag(JAXBElement<String> value) {
        this.urgencyFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkItemId() {
        return workItemId;
    }

    /**
     * Sets the value of the workItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkItemId(Integer value) {
        this.workItemId = value;
    }

    /**
     * Gets the value of the xbOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXbOrg() {
        return xbOrg;
    }

    /**
     * Sets the value of the xbOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXbOrg(JAXBElement<String> value) {
        this.xbOrg = ((JAXBElement<String> ) value);
    }

}
