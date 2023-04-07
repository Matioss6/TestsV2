package CodeWars;

import java.util.List;


public class PaginationHelper<I> {

    List<I> collection;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     *
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection=collection;
        this.itemsPerPage=itemsPerPage;

    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
       return collection.size();


    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (itemCount()%itemsPerPage==0) return itemCount()/itemsPerPage;
        else return (itemCount()/itemsPerPage)+1;

    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        if (pageIndex<0 || pageIndex>this.pageCount()-1) return -1;

        if (pageIndex < this.pageCount()-1)   return itemsPerPage;

        if (pageIndex == this.pageCount()-1 && itemCount()%itemsPerPage==0) return itemsPerPage;

        else return itemCount()%itemsPerPage;

    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {

        if (itemIndex>= this.itemCount() || itemIndex<0) return -1;
        if (itemIndex==0) return 0;

        else return itemIndex/itemsPerPage;



    }
}