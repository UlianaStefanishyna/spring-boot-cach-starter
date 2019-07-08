
package com.springboot.starter.cache.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@RunWith(SpringRunner.class)
@WebMvcTest(CachingController.class)
public class CachingCachingControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CachingService cachingService;

    @Test
    public void getTest() throws Exception {
        Mockito.when(cachingService.get(Mockito.anyString())).thenReturn("0000");
        this.mockMvc.perform(get("/cache/abc")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}