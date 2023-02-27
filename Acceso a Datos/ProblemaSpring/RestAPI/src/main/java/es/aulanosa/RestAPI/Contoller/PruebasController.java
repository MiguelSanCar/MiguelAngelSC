package es.aulanosa.RestAPI.Contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebas")
public class PruebasController {

    @GetMapping
    public ResponseEntity<String> saludar(){
        return new ResponseEntity<>("Hola", HttpStatus.OK);
    }
}
