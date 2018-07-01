import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo


{

    public static void main(String[] args) {

        LinkedList<String> places = new LinkedList<String>();
        places.add("doon");
        places.add("delhi");
        places.add("jaipur");
        places.add("hyderabad");
        printList(places);

        places.add(2, "meerut");
        printList(places);

        places.remove(3);
        printList(places);

    }

    private static void printList(LinkedList<String> list) {

        Iterator<String> i = list.iterator();
        while (i.hasNext()) {

            System.out.println(i.next());

        }

    }


    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {


        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {


            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0) {


                System.out.println("new city is already included");
                return false;
            } else if (comparison > 0) {
                listIterator.previous();
                listIterator.add(newCity);
                return true;

            } else if (comparison < 0) {

            }
        }
        listIterator.add(newCity);
        return true;
        


    }
}
