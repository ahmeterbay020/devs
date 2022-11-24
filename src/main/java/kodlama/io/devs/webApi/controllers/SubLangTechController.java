package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.bussiness.abstracts.SubLangTechService;
import kodlama.io.devs.bussiness.requests.CreateSubLangTech;
import kodlama.io.devs.bussiness.responses.GetAllSubLangTechResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sublangtech")
public class SubLangTechController {
    private SubLangTechService subLangTechService;

    public SubLangTechController(SubLangTechService langTechService){
        this.subLangTechService=langTechService;
    }

    @GetMapping("/getallsubtech")
    public List<GetAllSubLangTechResponse> getAll(){
        return subLangTechService.getsublangAll();
    }
    @PostMapping("/addsublangtech")
    public void addSubLangTech(CreateSubLangTech createSubLangTech){
        this.subLangTechService.addSubLangTech(createSubLangTech);
    }

}
