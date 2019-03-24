package com.kazale.pontointeligente.api;
 
// import com.kazale.pontointeligente.api.entities.Empresa;
// import com.kazale.pontointeligente.api.entities.Funcionario;
// import com.kazale.pontointeligente.api.enums.PerfilEnum;
// import com.kazale.pontointeligente.api.repositories.EmpresaRepository;
// import com.kazale.pontointeligente.api.repositories.FuncionarioRepository;
// // import com.kazale.pontointeligente.api.services.EmpresaService;
// import com.kazale.pontointeligente.api.utils.PasswordUtils;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cache.annotation.EnableCaching;
 
// @SpringBootApplication
// @EnableCaching
// public class PontoInteligenteApplication implements CommandLineRunner {
// 
//   public static void main(String[] args) {
//      SpringApplication.run(PontoInteligenteApplication.class, args);
//   }
// 
//   @Autowired
//   private EmpresaRepository empresaRepository;
// 
//   @Autowired
//   private FuncionarioRepository funcionarioRepository;
// 
//   @Override
//   public void run(String... strings) throws Exception {
//      Empresa empresa = new Empresa();
//      empresa.setCnpj("1111111111");
//      empresa.setRazaoSocial("Empresa");
//      empresaRepository.save(empresa);
// 
//      Funcionario funcionario = new Funcionario();
//      funcionario.setEmail("email@email.com");
//      funcionario.setNome("Nome");
//      funcionario.setSenha(PasswordUtils.gerarBCrypt("123456"));
//      funcionario.setCpf("2222222222");
//      funcionario.setPerfil(PerfilEnum.ROLE_ADMIN);
//      funcionario.setEmpresa(empresa);
//      funcionarioRepository.save(funcionario);
//   }
// }

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PontoInteligenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);
	}
}



