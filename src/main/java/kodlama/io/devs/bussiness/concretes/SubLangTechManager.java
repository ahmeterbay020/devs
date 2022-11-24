package kodlama.io.devs.bussiness.concretes;

import kodlama.io.devs.bussiness.abstracts.SubLangTechService;
import kodlama.io.devs.bussiness.requests.CreateSubLangTech;
import kodlama.io.devs.bussiness.responses.GetAllSubLangTechResponse;
import kodlama.io.devs.dataAccess.abstracts.SubLangTechrepository;
import kodlama.io.devs.entities.concretes.Lang;
import kodlama.io.devs.entities.concretes.SubLangTech;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SubLangTechManager implements SubLangTechService {
    private SubLangTechrepository subLangTechrepository;


    public SubLangTechManager(SubLangTechrepository subLangTechrepository) {
        this.subLangTechrepository = subLangTechrepository;
    }


    @Override
    public List<GetAllSubLangTechResponse> getsublangAll() {
        List<SubLangTech> subLangTeches = subLangTechrepository.findAll();

        List<GetAllSubLangTechResponse> getAllSubLangTechResponses = new ArrayList<>();
        for (SubLangTech subLangTech : subLangTeches) {
            GetAllSubLangTechResponse response = new GetAllSubLangTechResponse();
            //  response.setId(subLangTech.getId());
            response.setTechName(subLangTech.getName());
            response.setName(subLangTech.getLangName());
            getAllSubLangTechResponses.add(response);

        }
        return getAllSubLangTechResponses;
    }

    @Override
    public void addSubLangTech(CreateSubLangTech createSubLangTech) {
        SubLangTech subLangTech = new SubLangTech();

        List<Map> langs = subLangTechrepository.findByLang();
        for (int i=0;i<langs.size();i++){
            if (langs.get(i).containsValue(createSubLangTech.getLangName())) {
                subLangTech.setName(createSubLangTech.getName());
                subLangTech.setLangName(createSubLangTech.getLangName());
                this.subLangTechrepository.save(subLangTech);
                break;

            }else {

            }
        }



    }
}
