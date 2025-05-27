package alopezpa.homelab.domain.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import alopezpa.homelab.api.domain.models.dtos.PostgresSqlExample;
import alopezpa.homelab.api.domain.models.requests.endpoint1.ExampleRequest;
import alopezpa.homelab.api.domain.models.responses.endpoint1.ExampleResponse;
import alopezpa.homelab.api.domain.repositories.ExampleRepository;
import alopezpa.homelab.api.domain.services.ExampleService;
import alopezpa.homelab.api.infrastructure.mapper.ExampleResponsePostgresSqlExampleMapper;


@ExtendWith(MockitoExtension.class)
public class ExampleServiceTest {

    @Mock
    private ExampleRepository exampleRepository;
    @Mock
    private ExampleResponsePostgresSqlExampleMapper mapper;
    @InjectMocks
    private ExampleService sut;

    @Test
    public void shouldReturnExampleResponseWhenUserExist() {
        ExampleRequest request = generateRequest();
        PostgresSqlExample repositoryExpected = PostgresSqlExample.builder()
                                                                  .attribute1("Test")
                                                                  .attribute2("example2")
                                                                  .build();
        ExampleResponse expectedResponse = ExampleResponse.builder()
                                                          .age(repositoryExpected.getAttribute1())
                                                          .location(repositoryExpected.getAttribute2())
                                                          .example(null)
                                                          .build();

        when(exampleRepository.getExample(request.getName())).thenReturn(repositoryExpected);
        when(mapper.map(repositoryExpected)).thenReturn(expectedResponse);

        ExampleResponse actual = sut.getUserById(request);
        assertEquals(actual, expectedResponse);
    }

    private ExampleRequest generateRequest() {
        return ExampleRequest.builder()
                             .lastname("Test")
                             .name("Test")
                             .build();
    }
}
