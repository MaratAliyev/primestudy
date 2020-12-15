package com.example.demo.controller;
import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


@RestController
    public class TaskController {
        @Autowired
        private TaskRepository taskRepository;
       
        @PostMapping("/tasks")
        public Task create(@RequestBody Task task) {
            return taskRepository.save(task);
        }

        @GetMapping("/tasks/{id}")
        public Task getById(@PathVariable long id) {
            return taskRepository.findById(id).orElse( null);
        }

        @GetMapping("/tasks")
        public Iterable<Task> getAll() {
            return taskRepository.findAll();
        }

        @DeleteMapping("/tasks/{id}")
        public void delete(@PathVariable Long id) {
            taskRepository.deleteById(id);
        }



        @PutMapping("/tasks/{id}")
        public Task update(@PathVariable long id,
                           @RequestBody Task task) {
            task.setId(id);
            return taskRepository.save(task);
        }


        @PatchMapping("/tasks/{id}")
        public void matchMethod(@PathVariable Long id) {
                taskRepository.markAsDone(id);
        }

}
