package con.learn.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	JdbcTemplate template;   
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}   
	
	public int save(Emp p){    
	    String sql="insert into Employee(id,firstName,lastName) values('"+p.getId()+"',"+p.getFirstName()+",'"+p.getLastName()+"')";    
	    return template.update(sql);    
	}  
	
	public int update(Emp p){    
	    String sql="update Employee set id='"+p.getId()+"', firstName="+p.getFirstName()+",lastName='"+p.getLastName()+"' where id="+p.getId()+"";    
	    return template.update(sql);
	}    
	
	public int delete(int id){    
	    String sql="delete from Employee where id="+id+"";    
	    return template.update(sql);    
	}   
	
	public Emp getEmpById(int id){    
	    String sql="select * from Employee where id=?";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));    
	} 
	

	public List<Emp> getEmployees(){    
	    return template.query("select * from Emp99",new RowMapper<Emp>(){    
	        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
	            Emp e=new Emp();    
	            e.setId(rs.getInt(1));    
	            e.setFirstName(rs.getString(2));    
	            e.setLastName(rs.getString(3));
	            return e;    
	        }    
	    });    
	}    
	
	
	
}
