public class LinkStrand implements IDnaStrand{

    /**
     * Node class for LinkStrand
     * @info String is for the DNA strand
     * @next is the pointer to the next Node presented in the LinkStrand
     */
    private class Node {
        String info;
        Node next;

        public Node(String str, Node node){
            info = str;
            next = node;
        }
    }

    /**
     * Instance variables for LinkStrand
     * @myFirst is the pointer to the first node in a linked list
     * @myLast is the pointer to the last node in a linked list
     * @mySize is the total number of characters in the nodes
     * @myAppends is the number of times the append method is called (one less than the number of nodes in the linked list)
     */
    private Node myFirst,myLast;
    private long mySize;
    private int myAppends;

    /**
     * No-argument (default) constructor
     * Empty string
     */
    public LinkStrand(){
        this("");
    }

    /**
     * String constructor
     * @param source represents the DNA strand
     */
    public LinkStrand(String source){
        initialize(source);
    }

    /**
     * Returns the number of characters
     *
     * @return mySize, the total number of characters
     */
    @Override
    public long size() {
        return mySize;
    }

    /**
     * Initialize by copying DNA data from the string into this strand,
     * replacing any data that was stored. The parameter should contain only
     * valid DNA characters, no error checking is done by the this method.
     *
     * @param source is the string used to initialize this strand
     */
    @Override
    public void initialize(String source) {

    }

    /**
     *
     * @param source is data from which object constructed
     * @return a LinkStrand object from source
     */
    @Override
    public IDnaStrand getInstance(String source) {
        return new LinkStrand(source);
    }

    /**
     * Append dna to the end of this strind.
     *
     * @param dna is the string appended to this strand
     * @return this strand after the data has been added
     */
    @Override
    public IDnaStrand append(String dna) {
        return null;
    }

    /**
     * Returns the LinkStrand as a String
     * @return String form of LinkStrand with nodes as the DNA
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node cur = myFirst;
        while(cur != null){
            sb.append(cur.info);
            cur = cur.next;
        }
        return sb.toString();
    }

    /**
     * Returns an IDnaStrand that is the reverse of this strand, e.g., for
     * "CGAT" returns "TAGC"
     *
     * @return reverse strand
     */
    @Override
    public IDnaStrand reverse() {
        return null;
    }

    /**
     * Returns the number of times append has been called.
     *
     * @return
     */
    @Override
    public int getAppendCount() {
        return 0;
    }

    /**
     * Returns character at a specified index, where 0 <= index < size()
     *
     * @param index specifies which character will be returned
     * @return the character at index
     * @throws IndexOutOfBoundsException if index < 0 or inde >= size()
     */
    @Override
    public char charAt(int index) {
        return 0;
    }




}
