package cn.lyz.mapper;

import cn.lyz.model.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("select * from person t where t.pid = #{pid}")
    public Person selectById(int pid);

    @Select("select * from person")
    public List<Person> selectAll();

    @Options(useGeneratedKeys = true,keyProperty = "pid")
    @Insert("insert into person(pid, pname, addr, gender, birth) values (#{pid},#{pname},#{addr},#{gender},#{birth})")
    public void insert(Person p);

    @Select("delete from person  where pid = #{pid}")
    public void delete(int pid);
}
