package Hackaton.animaux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpeciesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getSpecies_withoutFilter_returns200WithAllSpecies() throws Exception {
        mockMvc.perform(get("/species"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(4));
    }

    @Test
    void getSpecies_withPartialNameAnyCase_returns200() throws Exception {
        mockMvc.perform(get("/species").param("name", "LIO"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].name").value("Lion"));
    }

    @Test
    void getSpecies_unknownName_returns404WithMessage() throws Exception {
        mockMvc.perform(get("/species").param("name", "dragon"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").exists());
    }
}
