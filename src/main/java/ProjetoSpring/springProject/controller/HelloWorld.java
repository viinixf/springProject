package ProjetoSpring.springProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {

    //Método responsável por receber a requisição GET
    @RestController
    public class PrimeiraController {
        @GetMapping("/{nome}")
        public ResponseEntity getNome(@PathVariable String nome) {
            var pessoa = new Mensagem();
            pessoa.setMensagem("Olá, " + nome);
            return new ResponseEntity(pessoa, HttpStatus.OK);
        }
    }
    //Método que retorna a mensagem no JSON
    private class Mensagem {

        public String getMensagem() {
            return mensagem;
        }
        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }
        private String mensagem;
    }
}
