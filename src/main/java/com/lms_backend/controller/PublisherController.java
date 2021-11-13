package com.lms_backend.controller;

import com.lms_backend.dto.PublisherDTO;
import com.lms_backend.dto.PublisherSaveDTO;
import com.lms_backend.dto.PublisherUpdateDTO;
import com.lms_backend.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Publisher RESTful APIs", description = "Publisher CRUD operations")
@RestController
@CrossOrigin
@RequestMapping("api/v1/publisher")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @PostMapping(path = "/save")
    public String savePublisher(@RequestBody PublisherSaveDTO publisherSaveDTO)
    {
        String publishername = publisherService.addPublisher(publisherSaveDTO);
        return  "Added Successfully";
    }

    @GetMapping(path = "/getAllPublisher")
    public List<PublisherDTO> getAllPublisher()
    {
        List<PublisherDTO> allPublishers = publisherService.getAllPublisher();
        return allPublishers;
    }

    @PutMapping(path = "/update")
    public String updatePublisher(@RequestBody PublisherUpdateDTO publisherUpdateDTO)
    {
        String publishername = publisherService.updatePublisher(publisherUpdateDTO);
        return  publishername;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deletePublisher(@PathVariable(value = "id")int id)
    {
        String authorname = publisherService.deletePublisher(id);
        return  "deleteddd";
    }


}