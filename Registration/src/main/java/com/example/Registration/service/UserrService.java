package com.example.Registration.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Registration.entity.Userr;
import com.example.Registration.repo.UserrRepo;

@Service
public class UserrService {
  
@Autowired
  private UserrRepo userrRepo;

public void saveDetails(Userr userr) {
  userrRepo.save(userr);
}

public List<Userr> showAllDetails(){
 return  userrRepo.findAll();
}
}

