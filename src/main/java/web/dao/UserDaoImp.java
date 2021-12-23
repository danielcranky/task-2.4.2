package web.dao;

import org.springframework.security.core.userdetails.UserDetails;
import web.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   EntityManager em;

   @Override
   public void addUser(User user) {
      em.persist(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      return em.createQuery("select u From User u", User.class).getResultList();
   }

   @Override
   public User getUser(Long id) {
      TypedQuery<User> q = em.createQuery("select u From User u where u.id = :id", User.class);
      q.setParameter("id", id);
      return q.getSingleResult();
   }

   @Override
   public void removeUser(Long id) {
      em.remove(getUser(id));
   }

   @Override
   public void updateUser(Long id, User user) {
      user.setId(id);
      em.merge(user);
   }

   @Override
   public UserDetails getUserByName(String s) {
      TypedQuery<User> q = em.createQuery("select u From User u where u.name = :name", User.class);
      q.setParameter("name", s);
      return q.getSingleResult();
   }
}
