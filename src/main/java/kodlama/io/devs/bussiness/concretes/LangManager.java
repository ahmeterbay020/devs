package kodlama.io.devs.bussiness.concretes;

import kodlama.io.devs.bussiness.abstracts.LangService;
import kodlama.io.devs.bussiness.requests.CreateLangRequest;
import kodlama.io.devs.bussiness.responses.GetAllLangResponse;
import kodlama.io.devs.dataAccess.abstracts.LangRepository;
import kodlama.io.devs.entities.concretes.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LangManager implements LangService {
    private LangRepository langRepository;

    @Autowired
    public LangManager(LangRepository langRepository) {

        this.langRepository = langRepository;
    }

    //iş kuralı yazılacak

    @Override
    public List<GetAllLangResponse> getAll() {

        List<Lang> langs = langRepository.findAll();
        List<GetAllLangResponse> langResponses = new ArrayList<GetAllLangResponse>();

        for (Lang lang : langs) {
            GetAllLangResponse responseItem = new GetAllLangResponse();
            responseItem.setId(lang.getId());
            responseItem.setName(lang.getName());
            langResponses.add(responseItem);
        }
        return langResponses;
    }

    @Override
    public void addLang(CreateLangRequest createLangRequest) {
        Lang lang = new Lang();
        lang.setName(createLangRequest.getName());
        this.langRepository.save(lang);
    }


}
