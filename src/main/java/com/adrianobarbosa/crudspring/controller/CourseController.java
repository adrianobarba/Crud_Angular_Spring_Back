package com.adrianobarbosa.crudspring.controller;

import com.adrianobarbosa.crudspring.model.Course;
import com.adrianobarbosa.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping()
    public List<Course> list() {

        return courseRepository.findAll();
    }
}
