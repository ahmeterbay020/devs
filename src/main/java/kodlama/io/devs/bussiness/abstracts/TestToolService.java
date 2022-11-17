package kodlama.io.devs.bussiness.abstracts;

import kodlama.io.devs.bussiness.requests.CreateTestToolRequest;
import kodlama.io.devs.bussiness.responses.GetAllTestToolResponse;

import java.util.List;

public interface TestToolService {
List<GetAllTestToolResponse> getAllTestTool();
void addTestTool(CreateTestToolRequest createTestToolRequest);
}
