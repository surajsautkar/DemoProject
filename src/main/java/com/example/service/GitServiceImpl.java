package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.GitRepository;
import com.example.model.Git;
@Service
public class GitServiceImpl implements GitService{
	@Autowired
	GitRepository gitRepository;

	@Override
	public Git saveName(Git git) {
		
		return gitRepository.save(git);
	}

	@Override
	public void deleteGitName(Integer id) {
		gitRepository.deleteById(id);
		
	}

	@Override
	public Optional<Git> getGitName(Integer id) {
		Optional<Git> git= gitRepository.findById(id);
		return git;
		
	}

	@Override
	public List<Git> getGitByName(String name) {
		List<Git> list=gitRepository.fingByName(name);
		return list;
	}

	@Override
	public List<Git> getGitByCity(String city) {
		List<Git> list=gitRepository.findByCity(city);
		return list;
	}

	

}
