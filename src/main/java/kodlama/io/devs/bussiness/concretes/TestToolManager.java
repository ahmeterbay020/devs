package kodlama.io.devs.bussiness.concretes;

import kodlama.io.devs.bussiness.abstracts.TestToolService;
import kodlama.io.devs.bussiness.requests.CreateLangRequest;
import kodlama.io.devs.bussiness.requests.CreateTestToolRequest;
import kodlama.io.devs.bussiness.responses.GetAllLangResponse;
import kodlama.io.devs.bussiness.responses.GetAllTestToolResponse;
import kodlama.io.devs.dataAccess.abstracts.TestToolRepository;
import kodlama.io.devs.entities.concretes.Lang;
import kodlama.io.devs.entities.concretes.TestTool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TestToolManager implements TestToolService {
    private TestToolRepository testToolRepository;

    public TestToolManager(TestToolRepository testToolRepository) {
        this.testToolRepository = testToolRepository;
    }
@Override
    public List<GetAllTestToolResponse> getAllTestTool() {
        List<TestTool> testTools = testToolRepository.findAll();
        List<GetAllTestToolResponse> getAllTestToolResponses = new ArrayList<>();
        for (TestTool testTool : testTools) {
            GetAllTestToolResponse responseItem = new GetAllTestToolResponse();
            responseItem.setId(testTool.getId());
            responseItem.setName(testTool.getName());
            getAllTestToolResponses.add(responseItem);
        }
        return getAllTestToolResponses;


    }
@Override
    public void addTestTool(CreateTestToolRequest createTestToolRequest) {
        TestTool testTool = new TestTool();
        testTool.setName(createTestToolRequest.getName());
        this.testToolRepository.save(testTool);
    }
}
