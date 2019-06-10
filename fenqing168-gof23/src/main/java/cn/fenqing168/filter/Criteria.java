package cn.fenqing168.filter;

import java.util.List;
 
/**
 * @author fenqing
 */
public interface Criteria {
   List<Person> meetCriteria(List<Person> persons);
}