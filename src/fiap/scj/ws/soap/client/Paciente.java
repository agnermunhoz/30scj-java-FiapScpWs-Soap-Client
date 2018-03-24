
package fiap.scj.ws.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paciente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paciente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="grupoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paciente", propOrder = {
    "altura",
    "grupoSanguineo",
    "idade",
    "nome",
    "peso"
})
public class Paciente {

    protected float altura;
    protected String grupoSanguineo;
    protected int idade;
    protected String nome;
    protected float peso;

    /**
     * Gets the value of the altura property.
     * 
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Sets the value of the altura property.
     * 
     */
    public void setAltura(float value) {
        this.altura = value;
    }

    /**
     * Gets the value of the grupoSanguineo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    /**
     * Sets the value of the grupoSanguineo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoSanguineo(String value) {
        this.grupoSanguineo = value;
    }

    /**
     * Gets the value of the idade property.
     * 
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Sets the value of the idade property.
     * 
     */
    public void setIdade(int value) {
        this.idade = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     */
    public void setPeso(float value) {
        this.peso = value;
    }

}
