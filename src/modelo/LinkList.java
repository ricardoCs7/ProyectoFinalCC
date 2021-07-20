package modelo;

// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////
public class LinkList {

    private Funcion first;            // ref to first link on list

// -------------------------------------------------------------
    public LinkList() // constructor
    {
        first = null;               // no links on list yet
    }
// -------------------------------------------------------------

    public Funcion getFirst() {
        return first;
    }

// -------------------------------------------------------------
    // insert at start of list
    public void insertFirst(Pelicula pelicula, String fecha, int precio) {                           // make new link
        Funcion newLink = new Funcion(pelicula, fecha, precio);
        newLink.next = first;       // newLink --> old first
        first = newLink;            // first --> newLink
    }

    public Funcion find(String key) // find link with given key
    {                           // (assumes non-empty list)
        Funcion current = first;              // start at 'first'
        while (current.pelicula.titulo != key) // while no match,
        {
            if (current.next == null) // if end of list,
            {
                return null;                 // didn't find it
            } else // not end of list,
            {
                current = current.next;      // go to next link
            }
        }
        return current;                    // found it
    }
// -------------------------------------------------------------

    public Funcion deleteFirst() // delete first item
    {                           // (assumes list not empty)
        Funcion temp = first;          // save reference to link
        first = first.next;         // delete it: first-->old next
        return temp;                // return deleted link
    }
// -------------------------------------------------------------

    public void displayList() {
        System.out.println("FUNCIONES List (first-->last): ");
        Funcion current = first;       // start at beginning of list
        while (current != null) // until end of list,
        {
            current.mostrarDatos();   // print data
            current = current.next;  // move to next link
        }
        System.out.println("");
    }

// -------------------------------------------------------------
}  // end class LinkList
////////////////////////////////////////////////////////////////
