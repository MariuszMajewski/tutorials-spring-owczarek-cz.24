package pl.mrmario.tutorials.spring.owczarek.cz23.implementations;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz23.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz23.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz23.domain.User;

@Service("usersRepositoryImpl")
public class UsersRepositoryImpl implements UsersRepository {
	//@Resource//(name = "counterLogger")
	private Logger counterLogger;

	public User createUser(String name) {
		counterLogger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}
	@Resource
	public void setLogger(Logger logger) {
		this.counterLogger = logger;
	}
}
