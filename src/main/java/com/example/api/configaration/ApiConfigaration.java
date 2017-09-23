package com.example.api.configaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
@Configuration
public class ApiConfigaration 
{
	@Bean
	public MongoClient mongoDB()
	{
MongoClient mongo=new MongoClient("127.0.0.1",27017);

return mongo;
	}
@Bean
	public SimpleMongoDbFactory mongoDBClient()
	{
		SimpleMongoDbFactory mongoFoctory=new SimpleMongoDbFactory(mongoDB(), "apiRepoDB");
return mongoFoctory;

	}
@Bean
public MongoTemplate mongoDBTemplate()
{
	MongoTemplate mongoTemplate=new MongoTemplate(mongoDBClient());
return mongoTemplate;

}

}
