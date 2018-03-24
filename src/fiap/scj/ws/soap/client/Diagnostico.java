
package fiap.scj.ws.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diagnostico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diagnostico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuidados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoIdeal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="recomendacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagnostico", propOrder = {
    "cuidados",
    "pesoIdeal",
    "recomendacao",
    "situacao"
})
public class Diagnostico {

    protected String cuidados;
    protected float pesoIdeal;
    protected String recomendacao;
    protected String situacao;

    /**
     * Gets the value of the cuidados property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuidados() {
        return cuidados;
    }

    /**
     * Sets the value of the cuidados property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuidados(String value) {
        this.cuidados = value;
    }

    /**
     * Gets the value of the pesoIdeal property.
     * 
     */
    public float getPesoIdeal() {
        return pesoIdeal;
    }

    /**
     * Sets the value of the pesoIdeal property.
     * 
     */
    public void setPesoIdeal(float value) {
        this.pesoIdeal = value;
    }

    /**
     * Gets the value of the recomendacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecomendacao() {
        return recomendacao;
    }

    /**
     * Sets the value of the recomendacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecomendacao(String value) {
        this.recomendacao = value;
    }

    /**
     * Gets the value of the situacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacao(String value) {
        this.situacao = value;
    }

	@Override
	public String toString() {
		return "Diagnostico [cuidados=" + cuidados + ", pesoIdeal=" + pesoIdeal + ", recomendacao=" + recomendacao
				+ ", situacao=" + situacao + "]";
	}

    
}
