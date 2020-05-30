package co.edureka;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDAOImpl implements AccountDAO {

	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void createAccount(Account acc) {

		//System.out.println(sql1);
		String sql="insert into account values("+acc.getAcno()+",'"+acc.getName()+"',"+acc.getBal()+")";
		
		int n=jt.update(sql);
		
		if(n>0)
			System.out.println("Account creayted");
		else
			System.out.println("Account not created");

	}

	@Override
	public void updateAccount(Account acc) {
		String sql="update account set name='"+acc.getName()+"',bal="+acc.getBal()+" where accno="+acc.getAcno();
		int n=jt.update(sql);
		if(n>0)
			System.out.println("Account updated");
		else
			System.out.println("Account not updated");

	}

	@Override
	public void deleteAccount(long acno) {
		String sql="delete from  account where acno="+acno;
		int n=jt.update(sql);
		if(n>0)
			System.out.println("Account deleted");
		else
			System.out.println("Account not deleted");

	}

	@Override
	public List<Account> grtAccount() {
		
		return null;
	}

}
