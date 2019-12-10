package JDBC;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class MemberDao extends JdbcTemplate{
    //指向父类方法的引用，已经连接上数据库了
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }
     //模拟从数据库获取数据
    //mybatis里面的大致封装连接数据库就是这样做的
    public List<?> selectAll(){
        String sql = "select * from t_member";
        //jdk8新特性：函数式编程  ：只是少写了一个类
        return super.executeQuery(sql, new RowMapper<Member>() {
            //接口的实现类
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                //字段过多，原型模式
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }
}
