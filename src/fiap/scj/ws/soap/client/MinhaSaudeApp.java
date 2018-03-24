package fiap.scj.ws.soap.client;

public class MinhaSaudeApp {

	public static void main(String[] args) {
		MinhaSaudeImpl service = new MinhaSaudeImplService().getMinhaSaudeImplPort();
		
		
		
		float imc = service.calcularImc(1.72f, 75);
		
		System.out.println("Seu imc é: "+imc);
		
		String status = service.imcStatus(imc);
		
		System.out.println(status);
		
		Paciente paciente = new Paciente();
		paciente.setNome("João");
		paciente.setGrupoSanguineo("AB+");
		paciente.setAltura(1.85f);
		paciente.setPeso(100);
		paciente.setIdade(40);
		
		Diagnostico diagnostico = service.avaliar(paciente);
		
		System.out.println(diagnostico);
		
	}

}
