/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */
import java.util.*;

public class Q2_SystemLog {
    /** Contains all the entries in this system log.
     * Guaranteed not to be null and to contain only non-null entries.
     */
    private List<Q2_LogMessage> messageList;

    /** Removes from the system log all entries whose descriptions properly contain keyword,
     * and returns a list (possibly empty) containing the removed entries. *
     * Postcondition: * - Entries in the returned list properly contain keyword and *
     * are in the order in which they appeared in the system log. *
     * - The remaining entries in the system log do not properly contain keyword and *
     * are in their original order. *
     * - The returned list is empty if no messages properly contain keyword.
     */
    public List<Q2_LogMessage> removeMessages(String keyword) {
        List<Q2_LogMessage> tempKeep = new List<Q2_LogMessage>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Q2_LogMessage> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Q2_LogMessage q2_logMessage) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Q2_LogMessage> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Q2_LogMessage> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Q2_LogMessage get(int i) {
                return null;
            }

            @Override
            public Q2_LogMessage set(int i, Q2_LogMessage q2_logMessage) {
                return null;
            }

            @Override
            public void add(int i, Q2_LogMessage q2_logMessage) {

            }

            @Override
            public Q2_LogMessage remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Q2_LogMessage> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Q2_LogMessage> listIterator(int i) {
                return null;
            }

            @Override
            public List<Q2_LogMessage> subList(int i, int i1) {
                return null;
            }
        };
        List<Q2_LogMessage> tempRemove = new List<Q2_LogMessage>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Q2_LogMessage> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Q2_LogMessage q2_logMessage) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Q2_LogMessage> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Q2_LogMessage> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Q2_LogMessage get(int i) {
                return null;
            }

            @Override
            public Q2_LogMessage set(int i, Q2_LogMessage q2_logMessage) {
                return null;
            }

            @Override
            public void add(int i, Q2_LogMessage q2_logMessage) {

            }

            @Override
            public Q2_LogMessage remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Q2_LogMessage> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Q2_LogMessage> listIterator(int i) {
                return null;
            }

            @Override
            public List<Q2_LogMessage> subList(int i, int i1) {
                return null;
            }
        };

        for (Q2_LogMessage logMessage : messageList) {

            //  Correction: should have updated the messageList and returned removed (-2)
            if (logMessage.containsWord(keyword)) {
                tempRemove.add(logMessage);
            } else {
                tempKeep.add(logMessage);
            }
        }
        messageList = tempKeep;
        return tempRemove;

    }
}
