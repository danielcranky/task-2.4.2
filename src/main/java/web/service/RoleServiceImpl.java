package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.RoleDao;
import web.model.Role;

import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    @Transactional(readOnly = true)
    @Override
    public Set<Role> getRoles() {
        return roleDao.getRoles();
    }

    @Transactional(readOnly = true)
    @Override
    public Role getRole(String s) {
        return roleDao.getRole(s);
    }
}
