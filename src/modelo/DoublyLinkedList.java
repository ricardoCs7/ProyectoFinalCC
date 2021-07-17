package modelo;

public class DoublyLinkedList {

    private Pelicula first;               // ref to first item
    private Pelicula last;                // ref to last item
// -------------------------------------------------------------

    public DoublyLinkedList() // constructor
    {
        first = null;                  // no items on list yet
        last = null;
    }
// -------------------------------------------------------------

    public boolean isEmpty() // true if no links
    {
        return first == null;
    }
// -------------------------------------------------------------

    public Pelicula find(String key) // find link with given key
    {                           // (assumes non-empty list)
        Pelicula current = first;              // start at 'first'
        while (current.titulo != key) // while no match,
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

    public void insertFirst(String titulo) // insert at front of list
    {
        Pelicula newLink = new Pelicula(titulo);   // make new link

        if (isEmpty()) // if empty list,
        {
            last = newLink;             // newLink <-- last
        } else {
            first.previous = newLink;   // newLink <-- old first
        }
        newLink.next = first;          // newLink --> old first
        first = newLink;               // first --> newLink
    }
// -------------------------------------------------------------
//   public void insertLast(long dd)   // insert at end of list
//      {
//      Pelicula newLink = new Link(dd);   // make new link
//      if( isEmpty() )                // if empty list,
//         first = newLink;            // first --> newLink
//      else
//         {
//         last.next = newLink;        // old last --> newLink
//         newLink.previous = last;    // old last <-- newLink
//         }
//      last = newLink;                // newLink <-- last
//      }
// -------------------------------------------------------------

    public Pelicula deleteFirst() // delete first link
    {                              // (assumes non-empty list)
        Pelicula temp = first;
        if (first.next == null) // if only one item
        {
            last = null;                // null <-- last
        } else {
            first.next.previous = null; // null <-- old next
        }
        first = first.next;            // first --> old next
        return temp;
    }
// -------------------------------------------------------------

    public Pelicula deleteLast() // delete last link
    {                              // (assumes non-empty list)
        Pelicula temp = last;
        if (first.next == null) // if only one item
        {
            first = null;               // first --> null
        } else {
            last.previous.next = null;  // old previous --> null
        }
        last = last.previous;          // old previous <-- last
        return temp;
    }
// -------------------------------------------------------------
    // insert dd just after key
//   public boolean insertAfter(long key, long dd)
//      {                              // (assumes non-empty list)
//      Pelicula current = first;          // start at beginning
//      while(current.dData != key)    // until match is found,
//         {
//         current = current.next;     // move to next link
//         if(current == null)
//            return false;            // didn't find it
//         }
//      Pelicula newLink = new Pelicula(dd);   // make new link
//
//      if(current==last)              // if last link,
//         {
//         newLink.next = null;        // newLink --> null
//         last = newLink;             // newLink <-- last
//         }
//      else                           // not last link,
//         {
//         newLink.next = current.next; // newLink --> old next
//                                      // newLink <-- old next
//         current.next.previous = newLink;
//         }
//      newLink.previous = current;    // old current <-- newLink
//      current.next = newLink;        // old current --> newLink
//      return true;                   // found it, did insertion
//      }
// -------------------------------------------------------------

    public Pelicula deleteKey(String key) // delete item w/ given key
    {                              // (assumes non-empty list)
        Pelicula current = first;          // start at beginning
        while (current.getTitulo() != key) // until match is found,
        {
            current = current.next;     // move to next link
            if (current == null) {
                return null;             // didn't find it
            }
        }
        if (current == first) // found it; first item?
        {
            first = current.next;       // first --> old next
        } else // not first
        // old previous --> old next
        {
            current.previous.next = current.next;
        }

        if (current == last) // last item?
        {
            last = current.previous;    // old previous <-- last
        } else // not last
        // old previous <-- old next
        {
            current.next.previous = current.previous;
        }
        return current;                // return value
    }
// -------------------------------------------------------------

    public void displayForward() {
        System.out.println("List (first-->last): ");
        Pelicula current = first;          // start at beginning
        while (current != null) // until end of list,
        {
            current.mostrarDatos();// display data
            current = current.next;     // move to next link
        }
        System.out.println("");
    }

// -------------------------------------------------------------
    public void displayBackward() {
        System.out.println("List (last-->first): ");
        Pelicula current = last;           // start at end
        while (current != null) // until start of list,
        {
            current.mostrarDatos();// display data
            current = current.previous; // move to previous link
        }
        System.out.println("");
    }

// -------------------------------------------------------------
    public Pelicula getFirst() {
        return first;
    }

    public void setFirst(Pelicula first) {
        this.first = first;
    }

    public Pelicula getLast() {
        return last;
    }

    public void setLast(Pelicula last) {
        this.last = last;
    }
}  // end class DoublyLinkedList
////////////////////////////////////////////////////////////////

