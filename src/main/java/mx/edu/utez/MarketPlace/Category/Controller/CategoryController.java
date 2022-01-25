package mx.edu.utez.MarketPlace.Category.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = {"*"}) //Los sitios externos pueden entrar a este controllador
public class CategoryController {

}
