/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Article;
import java.util.*;
import javax.persistence.*;


/**
 *
 * @author Darkluiggi
 */
public class DAOArticle extends GenericDAO<Article> {

    public DAOArticle(EntityManagerFactory factory) {
        super(factory);
    }

    public DAOArticle() {
        super(Persistence.createEntityManagerFactory("LoginJPAPU"));
    }
    
    
    
    
    
//    private static EntityManagerFactory 
//            emf= Persistence.createEntityManagerFactory("LoginJPAPU");
//    
//    public void create (Article object){
//        
//        EntityManager em =emf.createEntityManager();
//        em.getTransaction().begin();
//        try{
//            em.persist(object);
//            em.getTransaction().commit();
//        }catch(Exception e){
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        }finally {
//            
//        em.close();
//    }
//    }
//        
//     public boolean delete(Article object){
//        
//        EntityManager em =emf.createEntityManager();
//        em.getTransaction().begin();
//        boolean ret=false;
//        try{
//            em.remove(object);
//            em.getTransaction().commit();
//            ret = true;
//        }catch(Exception e){
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        }finally {
//            
//        em.close();
//        return ret;
//            }
//     }
//     public Article read(Article object){
//        
//        EntityManager em =emf.createEntityManager();
//        Article temp= null;
//            Query q =em.createQuery("SELECT u FROM Article u "+
//                "WHERE u.gender LIKE :gender "+
//                    "AND u.clothName LIKE :clothName")
//                .setParameter("gender",object.getGender())
//                .setParameter("clothName",object.getClothName());
//            try{
//                temp = (Article) q.getSingleResult();
//            }catch (NonUniqueResultException e){
//                temp = (Article) q.getResultList().get(0);
//            }catch(Exception e){
//            e.printStackTrace();
//           }finally {
//                em.close();
//                return temp;
//            }
//            
//     }
//     
//     public boolean update(Article object, Article newObject){
//         
//         EntityManager em =emf.createEntityManager();
//        em.getTransaction().begin();
//        boolean ret=false;
//        try{
//            object=read(object);
//            object.setGender(newObject.getGender());
//            object.setClothName(newObject.getClothName());
//            object.setWashPrice(newObject.getWashPrice());
//            object.setWashA(newObject.isWashA());
//            object.setWaiPrice(newObject.getWaiPrice());
//            object.setWaiA(newObject.isWaiA());
//            object.setIronPrice(newObject.getIronPrice());
//            object.setIronA(newObject.isIronA());
//            object.setFoldPrice(newObject.getFoldPrice());
//            object.setFoldA(newObject.isFoldA());
//            em.merge(object);
//            em.getTransaction().commit();
//            ret = true;
//        }catch(Exception e){
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        }finally {            
//        em.close();
//        return ret;
//            }
//     }
//     
//     public List<Article> findAll(){
//        
//        List list = new ArrayList();
//        EntityManager em =emf.createEntityManager();
//        Article temp= null;
//            Query q =em.createQuery("SELECT u FROM Article u");
//            try{
//                list =  q.getResultList();
//            }catch(Exception e){
//           }finally {
//                em.close();
//                return list;
//            }
//            
//     }
     
     public List<String> getGenders(){
        List list = new ArrayList();
        EntityManager em = Provider();
        Query q =em.createQuery("SELECT DISTINCT u.gender FROM Article u");
            try{
                list =  q.getResultList();
            }catch(Exception e){
           }finally {
                em.close();
                return list;
            }
     } 
     
}
