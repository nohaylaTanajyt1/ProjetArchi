package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.*;

@Service
public class CollaborateurService {
	
	@Autowired CollaborateurRepository CollaborateurRepository;

}