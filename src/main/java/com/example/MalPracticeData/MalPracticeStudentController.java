package com.example.MalPracticeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.absentData.AbsentStudent;

import java.util.List;

@RestController
@RequestMapping("/api/MalPractice-students")
@CrossOrigin(origins = "http://localhost:4200") // Adjust the origin URL as needed
public class MalPracticeStudentController {
    private final MalPracticeStudentRepository MalPracticeStudentRepository;

    @Autowired
    public MalPracticeStudentController(MalPracticeStudentRepository MalPracticeStudentRepository) {
        this.MalPracticeStudentRepository = MalPracticeStudentRepository;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveMalPracticeStudents(@RequestBody List<MalPracticeStudent> MalPracticeStudents) {
    	for (MalPracticeStudent student : MalPracticeStudents) {
            MalPracticeStudentRepository.save(student);
        }

        return new ResponseEntity<>("Data saved successfully", HttpStatus.CREATED);
    }
    @GetMapping("/report/malpractice")
    public List<MalPracticeStudent> findMalPracticeStudents(
            @RequestParam String examYear,
            @RequestParam String year,
            @RequestParam String examination) {
        return MalPracticeStudentRepository.findCustomMalPracticeStudents(examYear, year, examination);
    }
    @GetMapping("/all")
    public List<MalPracticeStudent> getAllMalPracticeStudents() {
        return MalPracticeStudentRepository.findAll();
    }
}
