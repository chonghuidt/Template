package JDBC;

import java.sql.ResultSet;

public interface RowMapper<T> {
    //定义为泛型
    T mapRow(ResultSet rs,int rowNum)throws Exception;
}
