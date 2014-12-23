
package cn.gov.laho.fgk.webservice.pojo.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FileInfomation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileInfomation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addTime" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="addUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approveDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approveTime" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="auditState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="auditTime" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="correlationFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="fileCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filePromulgationDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fileTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="htmlFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lawPowerLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="localReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="modifyUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdfFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="powerErea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promulgationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promulgationTime" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="res1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="res2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="res3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validityState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileInfomation", propOrder = {
    "addTime",
    "addUser",
    "approveDepartment",
    "approveTime",
    "auditState",
    "auditTime",
    "correlationFile",
    "district",
    "effectiveTime",
    "expirationTime",
    "fileCategory",
    "fileDescription",
    "fileNumber",
    "filePromulgationDepartment",
    "fileState",
    "fileTitle",
    "formatState",
    "htmlFilePath",
    "id",
    "keywords",
    "lawPowerLevel",
    "localReferenceNumber",
    "modifyTime",
    "modifyUser",
    "pdfFilePath",
    "powerErea",
    "promulgationReferenceNumber",
    "promulgationTime",
    "remark",
    "res1",
    "res2",
    "res3",
    "srcFilePath",
    "summary",
    "validityState"
})
public class FileInfomation {

    @XmlElementRef(name = "addTime", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> addTime;
    @XmlElementRef(name = "addUser", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> addUser;
    @XmlElementRef(name = "approveDepartment", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> approveDepartment;
    @XmlElementRef(name = "approveTime", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> approveTime;
    protected Integer auditState;
    @XmlElementRef(name = "auditTime", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> auditTime;
    @XmlElementRef(name = "correlationFile", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> correlationFile;
    @XmlElementRef(name = "district", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> district;
    @XmlElementRef(name = "effectiveTime", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> effectiveTime;
    @XmlElementRef(name = "expirationTime", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> expirationTime;
    @XmlElementRef(name = "fileCategory", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fileCategory;
    @XmlElementRef(name = "fileDescription", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fileDescription;
    @XmlElementRef(name = "fileNumber", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fileNumber;
    @XmlElementRef(name = "filePromulgationDepartment", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> filePromulgationDepartment;
    protected Integer fileState;
    @XmlElementRef(name = "fileTitle", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fileTitle;
    protected Integer formatState;
    @XmlElementRef(name = "htmlFilePath", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> htmlFilePath;
    @XmlElementRef(name = "id", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "keywords", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> keywords;
    protected Integer lawPowerLevel;
    @XmlElementRef(name = "localReferenceNumber", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> localReferenceNumber;
    @XmlElementRef(name = "modifyTime", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> modifyTime;
    @XmlElementRef(name = "modifyUser", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> modifyUser;
    @XmlElementRef(name = "pdfFilePath", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> pdfFilePath;
    @XmlElementRef(name = "powerErea", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> powerErea;
    @XmlElementRef(name = "promulgationReferenceNumber", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> promulgationReferenceNumber;
    @XmlElementRef(name = "promulgationTime", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> promulgationTime;
    @XmlElementRef(name = "remark", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> remark;
    @XmlElementRef(name = "res1", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> res1;
    @XmlElementRef(name = "res2", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> res2;
    @XmlElementRef(name = "res3", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> res3;
    @XmlElementRef(name = "srcFilePath", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> srcFilePath;
    @XmlElementRef(name = "summary", namespace = "http://pojo.fgk.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> summary;
    protected Integer validityState;

    /**
     * Gets the value of the addTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAddTime() {
        return addTime;
    }

    /**
     * Sets the value of the addTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAddTime(JAXBElement<XMLGregorianCalendar> value) {
        this.addTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the addUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddUser() {
        return addUser;
    }

    /**
     * Sets the value of the addUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddUser(JAXBElement<String> value) {
        this.addUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the approveDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApproveDepartment() {
        return approveDepartment;
    }

    /**
     * Sets the value of the approveDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApproveDepartment(JAXBElement<String> value) {
        this.approveDepartment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the approveTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getApproveTime() {
        return approveTime;
    }

    /**
     * Sets the value of the approveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setApproveTime(JAXBElement<XMLGregorianCalendar> value) {
        this.approveTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the auditState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuditState() {
        return auditState;
    }

    /**
     * Sets the value of the auditState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuditState(Integer value) {
        this.auditState = value;
    }

    /**
     * Gets the value of the auditTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAuditTime() {
        return auditTime;
    }

    /**
     * Sets the value of the auditTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAuditTime(JAXBElement<XMLGregorianCalendar> value) {
        this.auditTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the correlationFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrelationFile() {
        return correlationFile;
    }

    /**
     * Sets the value of the correlationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrelationFile(JAXBElement<String> value) {
        this.correlationFile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrict(JAXBElement<String> value) {
        this.district = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEffectiveTime(JAXBElement<XMLGregorianCalendar> value) {
        this.effectiveTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the fileCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileCategory() {
        return fileCategory;
    }

    /**
     * Sets the value of the fileCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileCategory(JAXBElement<String> value) {
        this.fileCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileDescription() {
        return fileDescription;
    }

    /**
     * Sets the value of the fileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileDescription(JAXBElement<String> value) {
        this.fileDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileNumber(JAXBElement<String> value) {
        this.fileNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the filePromulgationDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilePromulgationDepartment() {
        return filePromulgationDepartment;
    }

    /**
     * Sets the value of the filePromulgationDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilePromulgationDepartment(JAXBElement<String> value) {
        this.filePromulgationDepartment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileState() {
        return fileState;
    }

    /**
     * Sets the value of the fileState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileState(Integer value) {
        this.fileState = value;
    }

    /**
     * Gets the value of the fileTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileTitle() {
        return fileTitle;
    }

    /**
     * Sets the value of the fileTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileTitle(JAXBElement<String> value) {
        this.fileTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the formatState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFormatState() {
        return formatState;
    }

    /**
     * Sets the value of the formatState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFormatState(Integer value) {
        this.formatState = value;
    }

    /**
     * Gets the value of the htmlFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHtmlFilePath() {
        return htmlFilePath;
    }

    /**
     * Sets the value of the htmlFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHtmlFilePath(JAXBElement<String> value) {
        this.htmlFilePath = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeywords(JAXBElement<String> value) {
        this.keywords = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lawPowerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLawPowerLevel() {
        return lawPowerLevel;
    }

    /**
     * Sets the value of the lawPowerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLawPowerLevel(Integer value) {
        this.lawPowerLevel = value;
    }

    /**
     * Gets the value of the localReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalReferenceNumber() {
        return localReferenceNumber;
    }

    /**
     * Sets the value of the localReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalReferenceNumber(JAXBElement<String> value) {
        this.localReferenceNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the modifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getModifyTime() {
        return modifyTime;
    }

    /**
     * Sets the value of the modifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setModifyTime(JAXBElement<XMLGregorianCalendar> value) {
        this.modifyTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the modifyUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModifyUser() {
        return modifyUser;
    }

    /**
     * Sets the value of the modifyUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModifyUser(JAXBElement<String> value) {
        this.modifyUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pdfFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPdfFilePath() {
        return pdfFilePath;
    }

    /**
     * Sets the value of the pdfFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPdfFilePath(JAXBElement<String> value) {
        this.pdfFilePath = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the powerErea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPowerErea() {
        return powerErea;
    }

    /**
     * Sets the value of the powerErea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPowerErea(JAXBElement<String> value) {
        this.powerErea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the promulgationReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromulgationReferenceNumber() {
        return promulgationReferenceNumber;
    }

    /**
     * Sets the value of the promulgationReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromulgationReferenceNumber(JAXBElement<String> value) {
        this.promulgationReferenceNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the promulgationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPromulgationTime() {
        return promulgationTime;
    }

    /**
     * Sets the value of the promulgationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPromulgationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.promulgationTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
        this.remark = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the res1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRes1() {
        return res1;
    }

    /**
     * Sets the value of the res1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRes1(JAXBElement<String> value) {
        this.res1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the res2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRes2() {
        return res2;
    }

    /**
     * Sets the value of the res2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRes2(JAXBElement<String> value) {
        this.res2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the res3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRes3() {
        return res3;
    }

    /**
     * Sets the value of the res3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRes3(JAXBElement<String> value) {
        this.res3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcFilePath() {
        return srcFilePath;
    }

    /**
     * Sets the value of the srcFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcFilePath(JAXBElement<String> value) {
        this.srcFilePath = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummary(JAXBElement<String> value) {
        this.summary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the validityState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidityState() {
        return validityState;
    }

    /**
     * Sets the value of the validityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidityState(Integer value) {
        this.validityState = value;
    }

}
