package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        // so i am here asking my self why this one does not work
        //nf.find(new int[] {4, 3, 2, 1});

        //passing null
        nf.find(new int[] {});
        // null returns this -2147483648
        //2147483647

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
