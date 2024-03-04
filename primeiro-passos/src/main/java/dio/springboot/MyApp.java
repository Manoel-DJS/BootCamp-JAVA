package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired // Em tese a ideia é fazer o conceito chamado injeção de dependência.
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado: " + calculadora.somar(3,5));
    }
}
