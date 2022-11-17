package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.bussiness.abstracts.TestToolService;
import kodlama.io.devs.bussiness.requests.CreateTestToolRequest;
import kodlama.io.devs.bussiness.responses.GetAllTestToolResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/testtool")
public class TestToolController {
    private TestToolService testToolService;

    public TestToolController(TestToolService testToolService) {
        this.testToolService = testToolService;
    }

    @GetMapping("/getalltesttool")
    public List<GetAllTestToolResponse> getAllTestToolResponses(){
        return testToolService.getAllTestTool();
    }


    @PostMapping("/addtesttool")
    public void addTestTool(CreateTestToolRequest createTestToolRequest){
        this.testToolService.addTestTool(createTestToolRequest);
    }
}
