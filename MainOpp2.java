package PracticaOpp2;

public class MainOpp2 {

    public static void main(String[] args) {

 CustomList<Employee>employeelist=new CustomList<>();

        employeelist.add(new Employee("Иван","Иванов",30));
        employeelist.add(new Employee("Сергей","Петров",25));
        employeelist.add(new Employee("Роман","Фёдоров",34));
        employeelist.add(new Employee("Светлана","Конева",22));

        for (Node n:employeelist
             ) {
            System.out.println(n.getData());
        }
        

    }


}
