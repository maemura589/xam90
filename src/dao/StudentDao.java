package dao;

import bean.School;
import bean.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao extends Dao {

 public Student get(String no) throws Exception {

     Student stdent = new Student();

     Connection connection =get Connection();

     PreparedStatement statement = null;

     try{

         statement = conneciton.preparestatement("select * from student where no=?");

    	 statement.setString(1,no);

    	 ResultSet rSet = statement.executeQuery();

    	 SchoolDao schoolDao = new Dao();

    	 if (rSet.next()) {

    		 student.setNo(rSet.getString("no"));
    		 student.setName(rSet.getString("name"));
    		 student.setEntYear(rSet.getInt("ent_year"));
    		 student.setClassNum(rSet.getString("class_num"));
    		 student.setAttend(rSet.getBoolean("is_attend"));

    		 student setSchool(schoolDao.getString("school_cd"))

    	 }else {

    		 student = null;
     } catch (Exception e) {
    	 throw e;
     } finally {
    	 if (statement !=null) {
    		 throw e;
    	 } catch (SQLException sqle) {
    		 throw sqle;
    	 }
     }

     if (connection != null) {
    	 try {
    		 connection.close();
    	 } catch (SQLExceptiom sqle) {
    		 throw sqle;

    	 }
     }

 }
 return student;
 }
 private List<Stusent>postFilter(ResultSet rSet, School school) throws Ecception {
 }
 public List<Stusent>filter(School school. int entYear,String classNum. boolean isAttend) throws Ecception {
 }
 public List<Stusent>filter(School school.int entYear. boolean isAttend) throws Ecception {
 }
 public List<Stusent>filter(School school,boolean isAttend) throws Ecception {
 }
 public boolean save(Student student) throws Ecception {

    Connection connection =getConneciton();

    PreaparedStatement statement = null;

    int count = 0;

    try {

    	Student old = get(student.getNo());
    	if (old == null) {

    		statement = conneaction.prepareStatement(
    				"insert into student(no, name, ent_year,class_num,is_attend,school_cd)value(?.?.?.?,?,?)");
    		statement.setString(1,student.getNo());
    		statement.setString(2,student.getName());
    		statement.setInt(3,student.getEntYear());
    		statement.setString(4,student.getCassNum());
    		statement.setBoolean(5,student.isAttend());
    		statement.setString(6,student.getschool().getCd);

    	} else {
    		statement = connection
    				prepareStatement("update dtudent set name=?,entyear=?, class_num=?,is_attend=? where no=?");
    		statement.setString (1,student.getName());
    		statement.setInt (2,student.getEntYear());
    	}
    	    statement.setString (3,student.getClassName());
    	    statement.setString (4,student.isAttend());
    	    statement.setString (5,student.getNo());

        count =statement.excuteUpdate();

    } catch (Exception e) {
    	throw e;
    } finally {

    	if (statement != null) {
    		try {
    			statement.close();
    		}  catch (SQLExceptiom sqle) {
    			throw sql;
    		}
    	}

    	if (connection != null) {
    		throw sqle;

    	}
    }

 }

 if (coun >0){

	 return true;

 } else {

	 return false;

     }

}

