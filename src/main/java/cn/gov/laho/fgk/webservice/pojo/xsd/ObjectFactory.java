
package cn.gov.laho.fgk.webservice.pojo.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fgk.pojo.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FileInfomationRes1_QNAME = new QName("http://pojo.fgk.com/xsd", "res1");
    private final static QName _FileInfomationEffectiveTime_QNAME = new QName("http://pojo.fgk.com/xsd", "effectiveTime");
    private final static QName _FileInfomationApproveTime_QNAME = new QName("http://pojo.fgk.com/xsd", "approveTime");
    private final static QName _FileInfomationRes3_QNAME = new QName("http://pojo.fgk.com/xsd", "res3");
    private final static QName _FileInfomationCorrelationFile_QNAME = new QName("http://pojo.fgk.com/xsd", "correlationFile");
    private final static QName _FileInfomationPromulgationReferenceNumber_QNAME = new QName("http://pojo.fgk.com/xsd", "promulgationReferenceNumber");
    private final static QName _FileInfomationRes2_QNAME = new QName("http://pojo.fgk.com/xsd", "res2");
    private final static QName _FileInfomationAddTime_QNAME = new QName("http://pojo.fgk.com/xsd", "addTime");
    private final static QName _FileInfomationApproveDepartment_QNAME = new QName("http://pojo.fgk.com/xsd", "approveDepartment");
    private final static QName _FileInfomationPromulgationTime_QNAME = new QName("http://pojo.fgk.com/xsd", "promulgationTime");
    private final static QName _FileInfomationModifyUser_QNAME = new QName("http://pojo.fgk.com/xsd", "modifyUser");
    private final static QName _FileInfomationExpirationTime_QNAME = new QName("http://pojo.fgk.com/xsd", "expirationTime");
    private final static QName _FileInfomationKeywords_QNAME = new QName("http://pojo.fgk.com/xsd", "keywords");
    private final static QName _FileInfomationFileTitle_QNAME = new QName("http://pojo.fgk.com/xsd", "fileTitle");
    private final static QName _FileInfomationDistrict_QNAME = new QName("http://pojo.fgk.com/xsd", "district");
    private final static QName _FileInfomationModifyTime_QNAME = new QName("http://pojo.fgk.com/xsd", "modifyTime");
    private final static QName _FileInfomationFileDescription_QNAME = new QName("http://pojo.fgk.com/xsd", "fileDescription");
    private final static QName _FileInfomationId_QNAME = new QName("http://pojo.fgk.com/xsd", "id");
    private final static QName _FileInfomationPdfFilePath_QNAME = new QName("http://pojo.fgk.com/xsd", "pdfFilePath");
    private final static QName _FileInfomationAuditTime_QNAME = new QName("http://pojo.fgk.com/xsd", "auditTime");
    private final static QName _FileInfomationPowerErea_QNAME = new QName("http://pojo.fgk.com/xsd", "powerErea");
    private final static QName _FileInfomationFileNumber_QNAME = new QName("http://pojo.fgk.com/xsd", "fileNumber");
    private final static QName _FileInfomationAddUser_QNAME = new QName("http://pojo.fgk.com/xsd", "addUser");
    private final static QName _FileInfomationFileCategory_QNAME = new QName("http://pojo.fgk.com/xsd", "fileCategory");
    private final static QName _FileInfomationSummary_QNAME = new QName("http://pojo.fgk.com/xsd", "summary");
    private final static QName _FileInfomationSrcFilePath_QNAME = new QName("http://pojo.fgk.com/xsd", "srcFilePath");
    private final static QName _FileInfomationHtmlFilePath_QNAME = new QName("http://pojo.fgk.com/xsd", "htmlFilePath");
    private final static QName _FileInfomationFilePromulgationDepartment_QNAME = new QName("http://pojo.fgk.com/xsd", "filePromulgationDepartment");
    private final static QName _FileInfomationLocalReferenceNumber_QNAME = new QName("http://pojo.fgk.com/xsd", "localReferenceNumber");
    private final static QName _FileInfomationRemark_QNAME = new QName("http://pojo.fgk.com/xsd", "remark");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fgk.pojo.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileInfomation }
     * 
     */
    public FileInfomation createFileInfomation() {
        return new FileInfomation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "res1", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationRes1(String value) {
        return new JAXBElement<String>(_FileInfomationRes1_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "effectiveTime", scope = FileInfomation.class)
    public JAXBElement<XMLGregorianCalendar> createFileInfomationEffectiveTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileInfomationEffectiveTime_QNAME, XMLGregorianCalendar.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "approveTime", scope = FileInfomation.class)
    public JAXBElement<XMLGregorianCalendar> createFileInfomationApproveTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileInfomationApproveTime_QNAME, XMLGregorianCalendar.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "res3", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationRes3(String value) {
        return new JAXBElement<String>(_FileInfomationRes3_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "correlationFile", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationCorrelationFile(String value) {
        return new JAXBElement<String>(_FileInfomationCorrelationFile_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "promulgationReferenceNumber", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationPromulgationReferenceNumber(String value) {
        return new JAXBElement<String>(_FileInfomationPromulgationReferenceNumber_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "res2", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationRes2(String value) {
        return new JAXBElement<String>(_FileInfomationRes2_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "addTime", scope = FileInfomation.class)
    public JAXBElement<XMLGregorianCalendar> createFileInfomationAddTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileInfomationAddTime_QNAME, XMLGregorianCalendar.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "approveDepartment", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationApproveDepartment(String value) {
        return new JAXBElement<String>(_FileInfomationApproveDepartment_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "promulgationTime", scope = FileInfomation.class)
    public JAXBElement<XMLGregorianCalendar> createFileInfomationPromulgationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileInfomationPromulgationTime_QNAME, XMLGregorianCalendar.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "modifyUser", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationModifyUser(String value) {
        return new JAXBElement<String>(_FileInfomationModifyUser_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "expirationTime", scope = FileInfomation.class)
    public JAXBElement<XMLGregorianCalendar> createFileInfomationExpirationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileInfomationExpirationTime_QNAME, XMLGregorianCalendar.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "keywords", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationKeywords(String value) {
        return new JAXBElement<String>(_FileInfomationKeywords_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "fileTitle", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationFileTitle(String value) {
        return new JAXBElement<String>(_FileInfomationFileTitle_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "district", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationDistrict(String value) {
        return new JAXBElement<String>(_FileInfomationDistrict_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "modifyTime", scope = FileInfomation.class)
    public JAXBElement<XMLGregorianCalendar> createFileInfomationModifyTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileInfomationModifyTime_QNAME, XMLGregorianCalendar.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "fileDescription", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationFileDescription(String value) {
        return new JAXBElement<String>(_FileInfomationFileDescription_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "id", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationId(String value) {
        return new JAXBElement<String>(_FileInfomationId_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "pdfFilePath", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationPdfFilePath(String value) {
        return new JAXBElement<String>(_FileInfomationPdfFilePath_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "auditTime", scope = FileInfomation.class)
    public JAXBElement<XMLGregorianCalendar> createFileInfomationAuditTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileInfomationAuditTime_QNAME, XMLGregorianCalendar.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "powerErea", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationPowerErea(String value) {
        return new JAXBElement<String>(_FileInfomationPowerErea_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "fileNumber", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationFileNumber(String value) {
        return new JAXBElement<String>(_FileInfomationFileNumber_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "addUser", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationAddUser(String value) {
        return new JAXBElement<String>(_FileInfomationAddUser_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "fileCategory", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationFileCategory(String value) {
        return new JAXBElement<String>(_FileInfomationFileCategory_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "summary", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationSummary(String value) {
        return new JAXBElement<String>(_FileInfomationSummary_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "srcFilePath", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationSrcFilePath(String value) {
        return new JAXBElement<String>(_FileInfomationSrcFilePath_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "htmlFilePath", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationHtmlFilePath(String value) {
        return new JAXBElement<String>(_FileInfomationHtmlFilePath_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "filePromulgationDepartment", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationFilePromulgationDepartment(String value) {
        return new JAXBElement<String>(_FileInfomationFilePromulgationDepartment_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "localReferenceNumber", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationLocalReferenceNumber(String value) {
        return new JAXBElement<String>(_FileInfomationLocalReferenceNumber_QNAME, String.class, FileInfomation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pojo.fgk.com/xsd", name = "remark", scope = FileInfomation.class)
    public JAXBElement<String> createFileInfomationRemark(String value) {
        return new JAXBElement<String>(_FileInfomationRemark_QNAME, String.class, FileInfomation.class, value);
    }

}
