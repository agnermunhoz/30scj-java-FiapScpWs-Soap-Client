
package fiap.scj.ws.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fiap.scj.ws.soap.client package. 
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

    private final static QName _ImcStatus_QNAME = new QName("http://soap.ws.scj.fiap/", "imcStatus");
    private final static QName _CalcularImcResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "calcularImcResponse");
    private final static QName _Avaliar_QNAME = new QName("http://soap.ws.scj.fiap/", "avaliar");
    private final static QName _ImcStatusResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "imcStatusResponse");
    private final static QName _AvaliarResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "avaliarResponse");
    private final static QName _CalcularImc_QNAME = new QName("http://soap.ws.scj.fiap/", "calcularImc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fiap.scj.ws.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularImcResponse }
     * 
     */
    public CalcularImcResponse createCalcularImcResponse() {
        return new CalcularImcResponse();
    }

    /**
     * Create an instance of {@link AvaliarResponse }
     * 
     */
    public AvaliarResponse createAvaliarResponse() {
        return new AvaliarResponse();
    }

    /**
     * Create an instance of {@link CalcularImc }
     * 
     */
    public CalcularImc createCalcularImc() {
        return new CalcularImc();
    }

    /**
     * Create an instance of {@link Avaliar }
     * 
     */
    public Avaliar createAvaliar() {
        return new Avaliar();
    }

    /**
     * Create an instance of {@link ImcStatusResponse }
     * 
     */
    public ImcStatusResponse createImcStatusResponse() {
        return new ImcStatusResponse();
    }

    /**
     * Create an instance of {@link ImcStatus }
     * 
     */
    public ImcStatus createImcStatus() {
        return new ImcStatus();
    }

    /**
     * Create an instance of {@link Paciente }
     * 
     */
    public Paciente createPaciente() {
        return new Paciente();
    }

    /**
     * Create an instance of {@link Diagnostico }
     * 
     */
    public Diagnostico createDiagnostico() {
        return new Diagnostico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImcStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "imcStatus")
    public JAXBElement<ImcStatus> createImcStatus(ImcStatus value) {
        return new JAXBElement<ImcStatus>(_ImcStatus_QNAME, ImcStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "calcularImcResponse")
    public JAXBElement<CalcularImcResponse> createCalcularImcResponse(CalcularImcResponse value) {
        return new JAXBElement<CalcularImcResponse>(_CalcularImcResponse_QNAME, CalcularImcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avaliar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "avaliar")
    public JAXBElement<Avaliar> createAvaliar(Avaliar value) {
        return new JAXBElement<Avaliar>(_Avaliar_QNAME, Avaliar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImcStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "imcStatusResponse")
    public JAXBElement<ImcStatusResponse> createImcStatusResponse(ImcStatusResponse value) {
        return new JAXBElement<ImcStatusResponse>(_ImcStatusResponse_QNAME, ImcStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvaliarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "avaliarResponse")
    public JAXBElement<AvaliarResponse> createAvaliarResponse(AvaliarResponse value) {
        return new JAXBElement<AvaliarResponse>(_AvaliarResponse_QNAME, AvaliarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularImc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "calcularImc")
    public JAXBElement<CalcularImc> createCalcularImc(CalcularImc value) {
        return new JAXBElement<CalcularImc>(_CalcularImc_QNAME, CalcularImc.class, null, value);
    }

}
