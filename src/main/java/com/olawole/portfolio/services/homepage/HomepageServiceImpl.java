package com.olawole.portfolio.services.homepage;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olawole.portfolio.entities.AboutMe;
import com.olawole.portfolio.entities.Education;
import com.olawole.portfolio.entities.OurService;
import com.olawole.portfolio.entities.Skill;
import com.olawole.portfolio.entities.Testimonial;
import com.olawole.portfolio.repositories.homepage.AboutRepository;
import com.olawole.portfolio.repositories.homepage.EducationRepository;
import com.olawole.portfolio.repositories.homepage.OurServiceRepository;
import com.olawole.portfolio.repositories.homepage.SkillRepository;
import com.olawole.portfolio.repositories.homepage.TestimonialRepository;
import com.olawole.portfolio.services.homepage.HomepageService;
import com.olawole.portfolio.web.dto.HomePageDto;

@Service
public class HomepageServiceImpl implements HomepageService {
	
	@Autowired
	private AboutRepository aboutRepository;
	
	@Autowired
	private EducationRepository educationRepository;
	
	@Autowired
	private OurServiceRepository ourServiceRepository;
	
	@Autowired
	private SkillRepository skillRepository;
	
	@Autowired
	private TestimonialRepository testimonialRepository;

	@Override
	@Transactional
	public HomePageDto getHomePage() {
		Optional<AboutMe> aboutMe = aboutRepository.findById(1);
		List<Education> educations = educationRepository.findAll();
		List<OurService> services = ourServiceRepository.findAll();
		List<Skill> skills = skillRepository.findAll();
		List<Testimonial> testimonials = testimonialRepository.findAll();
		HomePageDto homePage = new HomePageDto();
		return homePage;
	}

}
