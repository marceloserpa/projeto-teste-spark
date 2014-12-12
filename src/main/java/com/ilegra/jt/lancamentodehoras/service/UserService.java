package com.ilegra.jt.lancamentodehoras.service;

import com.ilegra.jt.lancamentodehoras.dao.UserDAO;
import com.ilegra.jt.lancamentodehoras.pojo.User;
import java.util.Optional;

public class UserService {

    public void autenticar(User user) throws Exception{        
        UserDAO dao = new UserDAO();
        Optional<User> userLogin = dao.login(user.getLogin(), user.getPassword());                       
    }
}
