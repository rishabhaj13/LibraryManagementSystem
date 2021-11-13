package com.lms_backend.service;

import com.lms_backend.dto.PublisherDTO;
import com.lms_backend.dto.PublisherSaveDTO;
import com.lms_backend.dto.PublisherUpdateDTO;

import java.util.List;

public interface PublisherService {
    String addPublisher(PublisherSaveDTO publisherSaveDTO);
    List<PublisherDTO> getAllPublisher();
    String updatePublisher(PublisherUpdateDTO publisherUpdateDTO);
    String deletePublisher(int id);
}