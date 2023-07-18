package com.example.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.Image;
import com.example.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageController {
	
	
	@Autowired
	ImageService imageService;
	
	@PostMapping("/saveImage")
	public Image uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
		return imageService.uploadImage(file);
	}
	
	@GetMapping("/get/{id}")
	public Image getById(@PathVariable("id")int id){
		Image image=imageService.getById(id);
		return image;
	}

}
