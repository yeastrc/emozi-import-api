//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.09 at 03:59:52 PM PST 
//


package org.yeastrc.emozi.emozi_import.api.xml_dto;

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
 *         &lt;element ref="{}psm_annotation_sort_order" minOccurs="0"/>
 *         &lt;element ref="{}reported_peptide_annotation_sort_order" minOccurs="0"/>
 *         &lt;element ref="{}matched_protein_annotation_sort_order" minOccurs="0"/>
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
    "psmAnnotationSortOrder",
    "reportedPeptideAnnotationSortOrder",
    "matchedProteinAnnotationSortOrder"
})
@XmlRootElement(name = "annotation_sort_order")
public class AnnotationSortOrder {

    @XmlElement(name = "psm_annotation_sort_order")
    protected PsmAnnotationSortOrder psmAnnotationSortOrder;
    @XmlElement(name = "reported_peptide_annotation_sort_order")
    protected ReportedPeptideAnnotationSortOrder reportedPeptideAnnotationSortOrder;
    @XmlElement(name = "matched_protein_annotation_sort_order")
    protected MatchedProteinAnnotationSortOrder matchedProteinAnnotationSortOrder;

    /**
     * Gets the value of the psmAnnotationSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PsmAnnotationSortOrder }
     *     
     */
    public PsmAnnotationSortOrder getPsmAnnotationSortOrder() {
        return psmAnnotationSortOrder;
    }

    /**
     * Sets the value of the psmAnnotationSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsmAnnotationSortOrder }
     *     
     */
    public void setPsmAnnotationSortOrder(PsmAnnotationSortOrder value) {
        this.psmAnnotationSortOrder = value;
    }

    /**
     * Gets the value of the reportedPeptideAnnotationSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedPeptideAnnotationSortOrder }
     *     
     */
    public ReportedPeptideAnnotationSortOrder getReportedPeptideAnnotationSortOrder() {
        return reportedPeptideAnnotationSortOrder;
    }

    /**
     * Sets the value of the reportedPeptideAnnotationSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedPeptideAnnotationSortOrder }
     *     
     */
    public void setReportedPeptideAnnotationSortOrder(ReportedPeptideAnnotationSortOrder value) {
        this.reportedPeptideAnnotationSortOrder = value;
    }

    /**
     * Gets the value of the matchedProteinAnnotationSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link MatchedProteinAnnotationSortOrder }
     *     
     */
    public MatchedProteinAnnotationSortOrder getMatchedProteinAnnotationSortOrder() {
        return matchedProteinAnnotationSortOrder;
    }

    /**
     * Sets the value of the matchedProteinAnnotationSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchedProteinAnnotationSortOrder }
     *     
     */
    public void setMatchedProteinAnnotationSortOrder(MatchedProteinAnnotationSortOrder value) {
        this.matchedProteinAnnotationSortOrder = value;
    }

}
