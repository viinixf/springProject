package ProjetoSpring.springProject.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
//    /*Dizer qual a URL (quando o String vai chamar esse método)
//    ou seja, quando chamar localhost:8080 precisa cair nesse método Hello World.
//    */
//    @RequestMapping("")
//    @ResponseBody
//    public String hello(){
//        return "Hello World";
//    }
    //criação do Endpoint que recebe o Get e reotrna como resposta o JSON
    //Annotation RestController = diz ao Spring que o arquivo JSON deve ser retornado imediatamente
    //Método responsável por receber a requisição GET

    @RestController("/pessoas")
    public class PrimeiraController {
        List<String> nomes = new ArrayList<>();
        @GetMapping("/{nome}")
        public ResponseEntity getNome(@PathVariable String nome) {
            var pessoa = new Pessoa();
            pessoa.setMensagem("Olá, " + nome);
            return new ResponseEntity(pessoa, HttpStatus.OK);
        }

        @PostMapping("/{nome}")
        public List<String> salvar(@PathVariable String nome){
            nomes.add(nome);
            return nomes;
        }
    }
    private class Pessoa{
        public String getMensagem() {
            return mensagem;
        }
        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }
        private String mensagem;
    }
}
