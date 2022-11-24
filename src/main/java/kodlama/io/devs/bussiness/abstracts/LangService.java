package kodlama.io.devs.bussiness.abstracts;

import kodlama.io.devs.bussiness.requests.CreateLangRequest;
import kodlama.io.devs.bussiness.responses.GetAllLangResponse;


import java.util.List;

public interface LangService {

    List<GetAllLangResponse> getAll();

    void addLang(CreateLangRequest createLangRequest);


}
