package daoimpl;

import com.dao.PersonDao;
import entities.Person;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class PersonDaoImpl implements PersonDao {


    @Override
    public void createPersonTable() {
        Connection connection = null;
        Statement statement=null;

        try {

        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }

    @Override
    public void insert(Person person) {

    }

    @Override
    public Person selectById(int id) {
        return null;
    }

    @Override
    public List<Person> selectAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
