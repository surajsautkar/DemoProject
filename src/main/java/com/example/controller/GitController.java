package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Git;
import com.example.service.GitService;

@RestController
@RequestMapping("/Git")
public class GitController {
	@Autowired
	public GitService gitService;

	@PostMapping("/save")
	public ResponseEntity saveName(@RequestBody Git git) {
		Git gt = gitService.saveName(git);

		return ResponseEntity.ok().body(git);
	}
	@DeleteMapping("/delete/{id}") 
	public void deleteGitName(@PathVariable("id") Integer id) throws Exception{
		gitService.deleteGitName(id);
		
	}
	@GetMapping("/get/{id}")
	public Optional<Git> getGitName(@PathVariable("id") Integer id) {
		Optional<Git> git=gitService.getGitName(id);
		return git;
	}
	@GetMapping("/name/{name}")
	public ResponseEntity<List<Git>> getGitByName(@PathVariable("name") String name){
		List<Git> list=gitService.getGitByName(name);
		return ResponseEntity.ok().body(list);
	}
	@GetMapping("/city/{city}")
	public ResponseEntity<List<Git>> getGitByCity(@PathVariable("city") String city){
		List<Git> list=gitService.getGitByCity(city);
		return ResponseEntity.ok().body(list);
	}
}
