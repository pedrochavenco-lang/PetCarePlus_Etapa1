package br.com.petcareplus;

import br.com.petcareplus.model.Animal;
import br.com.petcareplus.model.Cliente;
import br.com.petcareplus.model.Consulta;
import br.com.petcareplus.model.Veterinario;
import br.com.petcareplus.repository.RepositorioConsultaMemoria;
import br.com.petcareplus.service.ConsultaService;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Ana Souza", "(11) 99999-0000");
        Animal animal = new Animal(1, "Luna", "Cachorro", cliente);
        Veterinario veterinario = new Veterinario(1, "Dr. Paulo Lima", "CRMV-SP 12345");

        RepositorioConsultaMemoria repositorio = new RepositorioConsultaMemoria();
        ConsultaService service = new ConsultaService(repositorio);

        Consulta consulta = service.agendar(
                1,
                animal,
                veterinario,
                LocalDateTime.of(2026, 11, 3, 14, 30),
                "Consulta de rotina"
        );

        System.out.println("PetCare+ - demonstracao");
        System.out.println("-----------------------");
        System.out.println(consulta);
        System.out.println("Total de consultas cadastradas: "
                + service.listarConsultas().size());
    }
}