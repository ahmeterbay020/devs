package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.bussiness.abstracts.LangService;
import kodlama.io.devs.bussiness.requests.CreateLangRequest;
import kodlama.io.devs.bussiness.responses.GetAllLangResponse;
import kodlama.io.devs.entities.concretes.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/langs") //bu class ile iletişim kurma öntemi
public class LangsController {
    private LangService langService;


    @Autowired //costructorın implemente ettiği class, interfaceleri tarayıp new lenmiş hali veriiyor yeni sürümlerde yazmaya gerek yok
    public LangsController(LangService langService) {
        this.langService = langService;
    }

    @GetMapping("/getall")
    public List<GetAllLangResponse> getAll(){
        return langService.getAll();
    }

    @PostMapping("/addlang")
    public void addLang(CreateLangRequest createLangRequest){
        this.langService.addLang(createLangRequest);
    }

}
