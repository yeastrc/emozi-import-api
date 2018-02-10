//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.09 at 03:59:52 PM PST 
//


package org.yeastrc.emozi.emozi_import.api.xml_dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}reported_peptide" maxOccurs="unbounded"/>
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
    "reportedPeptide"
})
@XmlRootElement(name = "reported_peptides")
public class ReportedPeptides {

    @XmlElement(name = "reported_peptide", required = true)
    protected List<ReportedPeptide> reportedPeptide;

    /**
     * A reported peptide. See the annotation for "reported_peptides" for a detailed explanation.Gets the value of the reportedPeptide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportedPeptide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportedPeptide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedPeptide }
     * 
     * 
     */
    public List<ReportedPeptide> getReportedPeptide() {
        if (reportedPeptide == null) {
            reportedPeptide = new ArrayList<ReportedPeptide>();
        }
        return this.reportedPeptide;
    }

}
