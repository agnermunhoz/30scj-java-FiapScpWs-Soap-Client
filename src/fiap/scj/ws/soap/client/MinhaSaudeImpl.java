
package fiap.scj.ws.soap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MinhaSaudeImpl", targetNamespace = "http://soap.ws.scj.fiap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MinhaSaudeImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns fiap.scj.ws.soap.client.Diagnostico
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "avaliar", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.Avaliar")
    @ResponseWrapper(localName = "avaliarResponse", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.AvaliarResponse")
    @Action(input = "http://soap.ws.scj.fiap/MinhaSaudeImpl/avaliarRequest", output = "http://soap.ws.scj.fiap/MinhaSaudeImpl/avaliarResponse")
    public Diagnostico avaliar(
        @WebParam(name = "arg0", targetNamespace = "")
        Paciente arg0);

    /**
     * 
     * @param altura
     * @param peso
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcularImc", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.CalcularImc")
    @ResponseWrapper(localName = "calcularImcResponse", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.CalcularImcResponse")
    @Action(input = "http://soap.ws.scj.fiap/MinhaSaudeImpl/calcularImcRequest", output = "http://soap.ws.scj.fiap/MinhaSaudeImpl/calcularImcResponse")
    public float calcularImc(
        @WebParam(name = "altura", targetNamespace = "")
        float altura,
        @WebParam(name = "peso", targetNamespace = "")
        float peso);

    /**
     * 
     * @param icm
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "imcStatus", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.ImcStatus")
    @ResponseWrapper(localName = "imcStatusResponse", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.ImcStatusResponse")
    @Action(input = "http://soap.ws.scj.fiap/MinhaSaudeImpl/imcStatusRequest", output = "http://soap.ws.scj.fiap/MinhaSaudeImpl/imcStatusResponse")
    public String imcStatus(
        @WebParam(name = "icm", targetNamespace = "")
        float icm);

}