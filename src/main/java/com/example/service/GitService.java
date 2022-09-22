package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Git;

public interface GitService {
	public Git saveName(Git git);
	public void deleteGitName(Integer id);
	public Optional<Git> getGitName(Integer id);
	public List<Git> getGitByName(String name);

}

