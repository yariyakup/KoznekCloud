package com.uyghurbiz.controller;

import com.uyghurbiz.core.CoreEngineConfig;
import com.uyghurbiz.service.TwitterUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Yari_Dev on 5/17/16.
 */
@RestController
@EnableAutoConfiguration
@Import(CoreEngineConfig.class)
public class SampleController {
    @Autowired
    TwitterUserServices userServices;

    @RequestMapping(value = "user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    String home(String userKeyword) {
        return "Size of the user: " + userServices.getUserResource(userKeyword).size();
    }

}
