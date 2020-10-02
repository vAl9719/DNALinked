public class LinkStrand implements IDnaStrand{
    private class Node {
        String info;
        Node next;

        public Node(String str, Node node){
            info = str;
            next = node;
        }
    }

    private Node myFirst,myLast;
    private long mySize;
    private int myAppends;

    /**
     * Returns the number of elements/base-pairs/nucleotides in this strand.
     *
     * @return the number of base-pairs in this strand
     */
    @Override
    public long size() {
        return 0;
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
     * Return this object, useful to obtain
     * an object without knowing its type, e.g.,
     * calling dna.getInstance() returns an IDnaStrand
     * that will be the same concrete type as dna
     *
     * @param source is data from which object constructed
     * @return an IDnaStrand whose .toString() method will be source
     */
    @Override
    public IDnaStrand getInstance(String source) {
        return null;
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
