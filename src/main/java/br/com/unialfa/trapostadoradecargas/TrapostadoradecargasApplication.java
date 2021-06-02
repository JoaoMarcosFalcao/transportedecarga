package br.com.unialfa.trapostadoradecargas;

import br.com.unialfa.trapostadoradecargas.Carga.Domain.Carga;
import br.com.unialfa.trapostadoradecargas.Carga.Domain.TipoCarga;
import br.com.unialfa.trapostadoradecargas.Carga.Repository.CargaRepository;
import br.com.unialfa.trapostadoradecargas.Carga.Service.CargaController;
import br.com.unialfa.trapostadoradecargas.Cliente.Domain.Cliente;
import br.com.unialfa.trapostadoradecargas.Cliente.Repository.ClienteRepository;
import br.com.unialfa.trapostadoradecargas.Cliente.Service.ClienteController;
import br.com.unialfa.trapostadoradecargas.Endereco.Domain.Endereco;
import br.com.unialfa.trapostadoradecargas.Endereco.Repository.EnderecoRepository;
import br.com.unialfa.trapostadoradecargas.Motorista.Domain.Motorista;
import br.com.unialfa.trapostadoradecargas.Motorista.Repository.MotoristaRepository;
import br.com.unialfa.trapostadoradecargas.Rota.Domain.Rota;
import br.com.unialfa.trapostadoradecargas.Rota.Repository.RotaRepository;
import br.com.unialfa.trapostadoradecargas.Telefone.Domain.Telefone;
import br.com.unialfa.trapostadoradecargas.Telefone.Repository.TelefoneRepository;
import br.com.unialfa.trapostadoradecargas.Veiculo.Domain.Veiculo;
import br.com.unialfa.trapostadoradecargas.Veiculo.Repository.VeiculoRepository;
import br.com.unialfa.trapostadoradecargas.Viagem.Domain.Viagem;
import br.com.unialfa.trapostadoradecargas.Viagem.Repository.ViagemRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TrapostadoradecargasApplication {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private MotoristaRepository motoristaRepository;

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Autowired
	private CargaRepository cargaRepository;

	@Autowired
	private RotaRepository rotaRepository;

	@Autowired
	private ViagemRepository viagemRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrapostadoradecargasApplication.class, args);
	}
//
//	@Bean
//	InitializingBean sendDataBase() {
//
//		ArrayList <Telefone> telefones = new ArrayList<Telefone>();
//		ArrayList <Carga> cargas = new ArrayList<Carga>();
//		ArrayList <Rota> rotas = new ArrayList<Rota>();
//		ArrayList <Cliente> clientes = new ArrayList<Cliente>();
//		ArrayList <Motorista> motoristas = new ArrayList<Motorista>();
//		ArrayList <Veiculo> veiculos = new ArrayList<Veiculo>();
//
//		Endereco endereco = new Endereco();
//		endereco.setRua("");
//		endereco.setNumero("");
//		endereco.setBairro("");
//		endereco.setCidade("");
//		endereco.setEstado("");
//
//		enderecoRepository.save(endereco);
//
//		Telefone telefone = new Telefone();
//		telefone.setCodigoArea("+55");
//		telefone.setDDD("666");
//		telefone.setNumero("11111-1111");
//		telefones.add(telefone);
//
//		Telefone telefone2 = new Telefone();
//		telefone2.setCodigoArea("+55");
//		telefone2.setDDD("777");
//		telefone2.setNumero("55555-5555");
//		telefones.add(telefone2);
//
//		telefoneRepository.saveAll(telefones);
//
//		Cliente cliente = new Cliente();
//		cliente.setNome("Cliente 1");
//		cliente.setCpf("000.000.000-00");
//		cliente.setEmail("******@******");
//		cliente.setEndereco(endereco);
//	    cliente.setTelefone(telefones);
//		clientes.add(cliente);
//
//		Cliente cliente2 = new Cliente();
//		cliente2.setNome("Cliente 2");
//		cliente2.setCpf("000.000.000-00");
//		cliente2.setEmail("******@******");
//		cliente.setEndereco(endereco);
//		cliente2.setTelefone(telefones);
//		clientes.add(cliente2);
//
//		clienteRepository.saveAll(clientes);
//
//		Motorista motorista = new Motorista();
//		motorista.setNome("Motorista 1");
//		motorista.setEmail("******@******");
//		motorista.setEndereco(endereco);
//	    motorista.setTelefone(telefones);
//		motorista.setCNH("22222222222");
//		motorista.setValidadeCHN(LocalDate.of(2022,05,14));
//		motoristas.add(motorista);
//
//		Motorista motorista2 = new Motorista();
//		motorista2.setNome("Motorista 2");
//		motorista2.setEmail("******@******");
//		motorista2.setEndereco(endereco);
//		motorista2.setTelefone(telefones);
//		motorista2.setCNH("111111111111");
//		motorista2.setValidadeCHN(LocalDate.of(2025,07,02));
//		motoristas.add(motorista2);
//
//		motoristaRepository.saveAll(motoristas);
//
//		Carga carga = new Carga();
//		carga.setAltura(2.5);
//		carga.setComprimento(1.0);
//		carga.setLargura(2.0);
//		carga.setPeso(250);
//		carga.setTipoCarga(TipoCarga.naoFragil);
//		cargas.add(carga);
//
//		Carga carga2 = new Carga();
//		carga2.setAltura(1.5);
//		carga2.setComprimento(1.0);
//		carga2.setLargura(1.2);
//		carga2.setPeso(120);
//		carga2.setTipoCarga(TipoCarga.fragil);
//		cargas.add(carga2);
//
//		cargaRepository.saveAll(cargas);
//
//		Rota rota = new Rota();
//		rota.setCidadeSaida("Barra do Garças");
//		rota.setCidadeChegada("Vila Rica");
//		rota.setCidadeParadas("Agua Boa, Nova Xavantina, Canarana");
//		rota.setDistancia(720);
//		rotas.add(rota);
//
//		Rota rota2 = new Rota();
//		rota2.setCidadeSaida("Barra do Garças");
//		rota2.setCidadeChegada("Cuiaba");
//		rota2.setCidadeParadas("Paredão Grande, General Carneiro, Primavera do Leste");
//		rota2.setDistancia(540);
//		rotas.add(rota2);
//
//		rotaRepository.saveAll(rotas);
//
//		Veiculo veiculo = new Veiculo();
//		veiculo.setModelo("T3500");
//		veiculo.setMarca("Scania");
//		veiculo.setAno(2020);
//		veiculo.setPlaca("QTP5F1");
//		veiculo.setRENAVAM("0321551542854");
//		veiculo.setCapacidade(20.000);
//		veiculos.add(veiculo);
//
//		Veiculo veiculo2 = new Veiculo();
//		veiculo2.setModelo("QR8554");
//		veiculo2.setMarca("Mercerdes");
//		veiculo2.setAno(2019);
//		veiculo2.setPlaca("GVP8Z9");
//		veiculo2.setRENAVAM("0000484792472");
//		veiculo2.setCapacidade(20.000);
//		veiculos.add(veiculo2);
//
//		veiculoRepository.saveAll(veiculos);
//
//		Viagem viagem = new Viagem();
//		viagem.setCarga(cargas);
//		viagem.setRota(rotas);
//		viagem.setCliente(clientes);
//		viagem.setMotorista(motorista);
//		viagem.setVeiculo(veiculo);
//		viagem.setHoraPartida("06:00");
//		viagem.setHoraChegada("15:37");
//		viagem.setDataSaida(LocalDate.of(2021,04,04));
//		viagem.setDataChegada(LocalDate.of(2021,04,05));
//		viagem.setFrete(BigDecimal.ZERO);
//
//		return null;
//	}
}
