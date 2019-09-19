package com.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.model.Player;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		// Player p=new Player(101, "Sachin R Tendulkar", 22, "India");

		/*
		 * Player p1 = new Player("Sachin", 22, "India"); Player p2 = new Player("guru",
		 * 22, "India"); Player p3 = new Player("Ajay", 24, "Australia"); Player p4 =
		 * new Player("Jay", 29, "USA"); Player p5 = new Player("Brian", 32, "USA");
		 * Player p6 = new Player("Mahesh", 22, "UK");
		 */
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// session.save(p);
		// session.update(p);
		// Player p1=(Player) session.get(Player.class, 101);
		// System.out.println(p1);
		// Player p1=new Player();
		// p1.setId(101);
		// session.delete(p1);
		
		/*
		 * System.out.println(session.save(p1)); System.out.println(session.save(p2));
		 * System.out.println(session.save(p3)); System.out.println(session.save(p4));
		 * System.out.println(session.save(p5)); System.out.println(session.save(p6));
		 */
		 
		// System.out.println((Player) session.get(Player.class, 11));
		
		Query query=session.createQuery("from com.model.Player where team=:teamName");
		query.setString("teamName", "India");
		List<Player> playerList=query.list();
		for(Player p:playerList) {
			System.out.println(p);
		}
		
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
