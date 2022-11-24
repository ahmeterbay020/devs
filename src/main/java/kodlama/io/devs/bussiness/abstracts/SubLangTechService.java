package kodlama.io.devs.bussiness.abstracts;

import kodlama.io.devs.bussiness.requests.CreateSubLangTech;
import kodlama.io.devs.bussiness.responses.GetAllSubLangTechResponse;

import java.util.List;

public interface SubLangTechService {
    List<GetAllSubLangTechResponse> getsublangAll();

    void addSubLangTech(CreateSubLangTech createSubLangTech);
}
