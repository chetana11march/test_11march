package com.example.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.Image;
import com.example.repo.ImageRepository;

@Service
public class ImageService {
	
	@Autowired
	ImageRepository imageRepository;
	
	public Image uploadImage (MultipartFile file) throws IOException { //wall.jpg
		String fileName=file.getOriginalFilename();
		String fileType=file.getContentType();
		byte[] imageDetails = file.getBytes();
		
		Image image = new Image(fileName, fileType, imageDetails);
		
		return imageRepository.save(image);
	}
	
	public Image getById(int id) {
		//return imageRepository.getById(id);
		return imageRepository.findById(id).get();
	}

}
