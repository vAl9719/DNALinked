public class LinkStrand implements IDnaStrand{

    /**
     * Node class for LinkStrand
     * @info String is for the DNA strand
     * @next is the pointer to the next Node presented in the LinkStrand
     */
    private class Node {
        String info;
        Node next;

        public Node(String str){
            info = str;
            next = null;
        }

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
     * @myAppends is the number of times the append method is called
     * (one less than the number of nodes in the linked list)
     * @myIndex is the current index in the node
     * @myLocalIndex is the value of the index within the string at a node
     * @myCurrent is the current Node
     */
    private Node myFirst, myLast, myCurrent;
    private long mySize;
    private int myAppends, myIndex, myLocalIndex;


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
        myFirst = new Node(source);
        myLast = myFirst;
        myCurrent = myFirst;
        mySize = source.length();
        myAppends = 0;
        myIndex = 0;
        myLocalIndex = 0;

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
     * Append dna to the end of this strand and update instance variables
     *
     * @param dna is the string appended to this strand
     * @return this LinkStrand after dna has been appended and update instance variables
     */
    @Override
    public IDnaStrand append(String dna) {
        myLast.next = new Node(dna, null);
        myLast = myLast.next;
        mySize += dna.length();
        myAppends++;

        return this;
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
     * Returns an IDnaStrand that is the reverse of this strand
     *
     * @return reverse strand
     */
    @Override
    public IDnaStrand reverse() {
        StringBuilder sb = new StringBuilder(myFirst.info);
        sb.reverse();
        LinkStrand ret = new LinkStrand(sb.toString());
        Node cur = myFirst.next;
        while(cur != null){
            sb = new StringBuilder(cur.info);
            sb.reverse();
            ret.myFirst = new Node(sb.toString(), ret.myFirst);
            ret.mySize = mySize;
            ret.myAppends = myAppends;
            cur = cur.next;
        }
        return ret;
    }

    /**
     * Returns the number of times append has been called.
     *
     * @return the number of appends
     */
    @Override
    public int getAppendCount() {
        return myAppends;
    }

    /**
     * Returns character at a specified index, where 0 <= index < size()
     *
     * @param index specifies which character will be returned
     * @return the character at index
     * @throws IndexOutOfBoundsException if index < 0 or inde >= size()
     * (invalid index)
     */
    @Override
    public char charAt(int index) {
        if(index < 0 || index >= mySize)
            throw new IndexOutOfBoundsException("Invalid index, greater than size or negative");
        if(index < myIndex){
            myCurrent = myFirst;
            myIndex = 0;
            myLocalIndex = 0;
        }
        while(myIndex != index){
            myIndex++;
            myLocalIndex++;
                if(myLocalIndex >= myCurrent.info.length() && myCurrent.next != null){
                    myLocalIndex = 0;
                    myCurrent = myCurrent.next;
                }
            }

        return myCurrent.info.charAt(myLocalIndex);
    }




}
