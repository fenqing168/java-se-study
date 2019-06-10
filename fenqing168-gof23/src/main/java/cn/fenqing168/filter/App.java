package cn.fenqing168.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        //准备数据
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        //创建过滤器
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("男性过滤器结果: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\n女性过滤器结果: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\n单身男性过滤器解结果: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\n单身或者女性过滤器结果: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("人 : [ 名字 : " + person.getName()
                    + ", 性别 : " + person.getGender()
                    + ", 状态 : " + person.getMaritalStatus()
                    + " ]");
        }
    }

}
