package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Userdetail;

public interface UserDAO  extends CrudRepository<Userdetail, Integer>{

}
