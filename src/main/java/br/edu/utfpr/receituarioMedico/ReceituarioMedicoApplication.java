/*
1) Criar um projeto simples, como fizemos na aula de SOLID, com um service que crie um receituário médico,
passando para um método uma lista de doenças, cada doença deve listar os cuidados mínimos (ex: beber bastante água)
e uma lista de medicamentos.
O Receituário deve possuir também o nome do paciente, e dias de atestado.
Deve-se calcular quando será o dia do fim do atestado.

- Deve possuir pelo menos 3 camadas: model, repository e service
- Deve salvar cada receituário no banco h2. Caso precise da configuração pode copiar desse projeto no application.properties
- Usar o JPA para tratar as entidades
- Salvar o projeto no git e me enviar o link por e-mail
- Criar uma simulação de uso do service na classe main do projeto ou uma classe de teste para o mesmo!

 */

package br.edu.utfpr.receituarioMedico;

import br.edu.utfpr.receituarioMedico.model.Teste;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceituarioMedicoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReceituarioMedicoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Teste teste = new Teste();
		teste.gerarTeste("João", "Doenca 3", 7);
		teste.gerarTeste("Cleide", "Doenca 1", 2);
		teste.gerarTeste("Kauane", "Doenca 4", 15);
		teste.gerarTeste("Eder", "Doenca 2", 10);
	}
}