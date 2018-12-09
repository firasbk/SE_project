package hu.uni.miskolc.iit.service;

import hu.uni.miskolc.iit.dao.DAOimpl.UserDAOImpl;
import hu.uni.miskolc.iit.dao.UserDAO;
import hu.uni.miskolc.iit.exceptions.UserErrorException;
import hu.uni.miskolc.iit.model.User;


public class UserServiceImpl implements UserService {

    private UserDAO userdao = new UserDAOImpl();

    public UserServiceImpl(){}

    public UserServiceImpl(UserDAO userdao) {
        this.userdao = userdao;
    }

    @Override
    public User userRegistration(User user) throws UserErrorException {
        if(user == null) {
            throw new UserErrorException();
        }
        return userdao.createUser(user);

    }

    @Override
    public User userModification(User user) throws UserErrorException {
        if(user == null) {
            throw new UserErrorException();
        }
            return userdao.updateUser(user);
    }

    @Override
    public boolean userDelete(User user) throws UserErrorException {
        if(user == null) {
            throw new UserErrorException();
        }
        return  userdao.deleteUser(user);
    }
}
