package com.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.model.Player;
import com.model.Team;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/*
		 * Team t1=new Team("Rock", "Argha"); Team t2=new Team("TeamKums", "Kumar");
		 * 
		 * Player p1=new Player("Thanh", 26, t1); Player p2=new Player("raj", 27, t1);
		 * Player p3=new Player("sam", 26, t1); Player p4=new Player("sam", 26, t2);
		 * Player p5=new Player("mehrab", 32, t2); Player p6=new Player("han", 36, t1);
		 * 
		 * 
		 * session.save(t1); session.save(t2);
		 * 
		 * session.save(p1); session.save(p2); session.save(p3); session.save(p4);
		 * session.save(p5); session.save(p6);
		 */
		
		
		Query query=session.createQuery("from com.model.Player");
		List<Player> playerList=query.list();
		for(Player p:playerList) {
			System.out.println("Id = "+p.getId()+" Name = "+p.getName());
		}
		System.out.println("All players iterated");
		System.out.println(playerList.get(0).getTeam());
		transaction.commit();
		session.close();
		factory.close();
	}

}
