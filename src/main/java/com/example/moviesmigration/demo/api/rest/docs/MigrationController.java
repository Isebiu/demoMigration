package com.example.moviesmigration.demo.api.rest.docs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//migrationController pentru definirea metodelor cu endpointuri
@Controller
public class MigrationController {

    @RequestMapping("/api/v1/migration/start")
    public String index(){
        return "Start";
    }
}
