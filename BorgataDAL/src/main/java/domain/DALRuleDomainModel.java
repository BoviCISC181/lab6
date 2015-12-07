package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.hibernate.sql.ordering.antlr.Factory;

import enums.eGame;
import enums.eRank;
import enums.eSuit;
import util.HibernateUtil;

@Entity
@Table(appliesTo = "TBLRULE")
public class DALRuleDomainModel {
	
	private int RULEID;
	private String RULENAME;
	private int MAXNUMBEROFPLAYERS;
	private int PLAYERNUMBEROFCARDS;
	private int NUMBEROFJOKERS;
	private int PLAYERCARDSMIN;
	private int PLAYERCARDSMAX;
	private int COMMUNITYCARDSMIN;
	private int COMMUNITYCARDSMAX;
	private int POSSIBLEHANDCOMBINATIONS;
	
	
	public static void main(String[] args){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query query = session.createQuery("from TBLRULE where RULEID = 1");
		//query.setParameter("id", 1);
		List<?> list = query.list();
		String game = (String)list.get(0);
		System.out.println(game);
	}
	
	public int getRULEID() {
		return RULEID;
	}

	public void setRULEID(int rULEID) {
		RULEID = rULEID;
	}

	public String getRULENAME() {
		return RULENAME;
	}

	public void setRULENAME(String rULENAME) {
		RULENAME = rULENAME;
	}

	public int getMAXNUMBEROFPLAYERS() {
		return MAXNUMBEROFPLAYERS;
	}

	public void setMAXNUMBEROFPLAYERS(int mAXNUMBEROFPLAYERS) {
		MAXNUMBEROFPLAYERS = mAXNUMBEROFPLAYERS;
	}
	
	public int getPLAYERNUMBEROFCARDS() {
		return PLAYERNUMBEROFCARDS;
	}

	public void setPLAYERNUMBEROFCARDS(int pLAYERNUMBEROFCARDS) {
		PLAYERNUMBEROFCARDS = pLAYERNUMBEROFCARDS;
	}

	public int getNUMBEROFJOKERS() {
		return NUMBEROFJOKERS;
	}

	public void setNUMBEROFJOKERS(int nUMBEROFJOKERS) {
		NUMBEROFJOKERS = nUMBEROFJOKERS;
	}

	public int getPLAYERCARDSMIN() {
		return PLAYERCARDSMIN;
	}

	public void setPLAYERCARDSMIN(int pLAYERCARDSMIN) {
		PLAYERCARDSMIN = pLAYERCARDSMIN;
	}

	public int getPLAYERCARDSMAX() {
		return PLAYERCARDSMAX;
	}

	public void setPLAYERCARDSMAX(int pLAYERCARDSMAX) {
		PLAYERCARDSMAX = pLAYERCARDSMAX;
	}

	public int getCOMMUNITYCARDSMIN() {
		return COMMUNITYCARDSMIN;
	}

	public void setCOMMUNITYCARDSMIN(int cOMMUNITYCARDSMIN) {
		COMMUNITYCARDSMIN = cOMMUNITYCARDSMIN;
	}

	public int getCOMMUNITYCARDSMAX() {
		return COMMUNITYCARDSMAX;
	}

	public void setCOMMUNITYCARDSMAX(int cOMMUNITYCARDSMAX) {
		COMMUNITYCARDSMAX = cOMMUNITYCARDSMAX;
	}

	public int getPOSSIBLEHANDCOMBINATIONS() {
		return POSSIBLEHANDCOMBINATIONS;
	}

	public void setPOSSIBLEHANDCOMBINATIONS(int pOSSIBLEHANDCOMBINATIONS) {
		POSSIBLEHANDCOMBINATIONS = pOSSIBLEHANDCOMBINATIONS;
	}

	/*
	public static ArrayList<GameRuleCardsDomainModel> getRules() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		ArrayList<GameRuleCardsDomainModel> RuleCards = new ArrayList<GameRuleCardsDomainModel>();
		try {
			tx = session.beginTransaction();

			List rules = session.createQuery("FROM GameRuleCardsDomainModel").list();
			for (Iterator iterator = rules.iterator(); iterator.hasNext();) {
				GameRuleCardsDomainModel rle = (GameRuleCardsDomainModel) iterator.next();
				RuleCards.add(rle);

			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return RuleCards;

	}*/
}
