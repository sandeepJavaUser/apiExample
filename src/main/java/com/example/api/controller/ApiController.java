package com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.pojo.ApiPojo;

@RestController
public class ApiController 
{
@Autowired
MongoTemplate mongotemplate;
@RequestMapping(value="/postADetails",method=RequestMethod.POST)
public ApiPojo fetchdetails(@RequestBody ApiPojo apiPojo)
{
	mongotemplate.save(apiPojo);
	return apiPojo;
}
}
