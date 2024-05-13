package data_strucures;
import java.util.*;
public class Data_strucures {
public static void main(String[] args) {
ArrayList<Students> s =new ArrayList(3);
ArrayList<Courses_GPA> g=new ArrayList(3);
ArrayList<StudentPayments> p =new ArrayList(3);
ArrayList<css> c =new ArrayList(3);
Courses_GPA g1=new Courses_GPA();
Courses_GPA g2=new Courses_GPA();
Courses_GPA g3=new Courses_GPA();
Students s1=new Students();
Students s2=new Students();
Students s3=new Students();
StudentPayments p1 = new StudentPayments();
StudentPayments p2 = new StudentPayments();
StudentPayments p3 = new StudentPayments();
css c1=new css();
css c2=new css();
css c3=new css();
s.add(s1);
g.add(g1);
p.add(p1);
c.add(c1);
s.add(s2);
g.add(g2);
p.add(p2);
c.add(c2);
s.add(s3);
g.add(g3);
p.add(p3);
c.add(c3);
for(int i =0;i<s.size();i++){
s.get(i).name();
s.get(i).getPhone();
s.get(i).nationality();
s.get(i).gender();
s.get(i).Studentcontact();
s.get(i).getBirth();
s.get(i).Address();
s.get(i).generate_id();
s.get(i).print_Details();
g.get(i).getsubjects();
g.get(i).getGrades();
g.get(i).getHours();
g.get(i).calc_gpa();
p.get(i).Payments();
c.get(i).calc();
}
}
}